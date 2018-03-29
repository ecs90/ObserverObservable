import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;

public class Car extends Observable {
    private String brand;
    private Map<String, Float> tire_pressure = new HashMap<>();
    private float water_level;
    private float oil_level;
    private ArrayList changer = new ArrayList<>(2);

    public Car(String brand, float tire_pressure1, float tire_pressure2, float tire_pressure3, float tire_pressure4, float water_level, float oil_level) {
        this.brand = brand;
        this.tire_pressure.put("fl", tire_pressure1); // fl = front left
        this.tire_pressure.put("fr", tire_pressure2); // fr = front right
        this.tire_pressure.put("bl", tire_pressure3); // bl = back left
        this.tire_pressure.put("br", tire_pressure4); // br = back right
        this.water_level = water_level;
        this.oil_level = oil_level;
    }

    public void setWater_level(float water_level){
        if(this.changer.size()>0){
            this.changer.clear();
        }
        this.changer.add("water level");
        this.changer.add(this.water_level);
        this.water_level = water_level;
        setChanged();
        notifyObservers(this.changer);
    }

    public void setOil_level(float oil_level){
        if(this.changer.size()>0){
            this.changer.clear();
        }
        this.changer.add("oil level");
        this.changer.add(this.oil_level);
        this.oil_level = oil_level;
        setChanged();
        notifyObservers(this.changer);
    }

    public void setIndividualTire_pressure(String tire_position,float tire_pressure){
        Map aux = new HashMap();
        aux.put("fl", this.tire_pressure.get("fl"));
        aux.put("fr", this.tire_pressure.get("fr"));
        aux.put("bl", this.tire_pressure.get("bl"));
        aux.put("br", this.tire_pressure.get("br"));
        if(this.changer.size()>0){
            this.changer.clear();
        }
        this.changer.add("tire pressure");
        this.changer.add(aux);
        this.tire_pressure.replace(tire_position, tire_pressure);
        setChanged();
        notifyObservers(this.changer);
    }

    public void setAllTire_pressure(float tire_pressure){
        Map aux = new HashMap();
        aux.put("fl", this.tire_pressure.get("fl"));
        aux.put("fr", this.tire_pressure.get("fr"));
        aux.put("bl", this.tire_pressure.get("bl"));
        aux.put("br", this.tire_pressure.get("br"));
        if(this.changer.size()>0){
            this.changer.clear();
        }
        this.changer.add("tire pressure");
        this.changer.add(aux);
        this.tire_pressure.replace("fl", tire_pressure);
        this.tire_pressure.replace("fr", tire_pressure);
        this.tire_pressure.replace("br", tire_pressure);
        this.tire_pressure.replace("bl", tire_pressure);
        setChanged();
        notifyObservers(this.changer);
    }

    @Override
    public String toString() {
        return "Car features: \n\tbrand = "+this.brand+";\n\toil level = "+this.oil_level+";\n\twater level = "+
                this.water_level+";\n\ttire pressure = front left tire: "+this.tire_pressure.get("fl")+", front right tire: "
                +this.tire_pressure.get("fr")+", back left tire: "+this.tire_pressure.get("bl")+", back right tire: "
                +this.tire_pressure.get("br")+"\n";
    }

    public Map<String, Float> getTire_pressure() {
        return tire_pressure;
    }

    public float getWater_level() {
        return water_level;
    }

    public float getOil_level() {
        return oil_level;
    }
}