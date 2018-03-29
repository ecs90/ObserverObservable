import java.util.*;

public class Mechanic implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        ArrayList observable = (ArrayList) arg;
        Car car = (Car) o;
        if(observable.get(0)=="tire pressure"){
            HashMap<String, Float> tire = ((HashMap) observable.get(1));

            System.out.println("Original values of tire pressure: " +
                    "\n\tfront left tire = "+tire.get("fl")+
                    "\n\tfront right tire = "+tire.get("fr")+
                    "\n\tback left tire = "+tire.get("bl")+
                    "\n\tback right tire = "+tire.get("br")+
                    "\nChange observed: \n\tfront left tire = "+car.getTire_pressure().get("fl")+
                    "\n\tfront right tire = "+car.getTire_pressure().get("fr")+
                    "\n\tback left tire = "+car.getTire_pressure().get("bl")+
                    "\n\tback right tire = "+car.getTire_pressure().get("br")+"\n");
        }else if(observable.get(0)=="oil level"){
            System.out.println("Original values of oil level: "+observable.get(1)+
                    "\nChange observed in oil level: "+car.getOil_level()+"\n");
        }else if(observable.get(0)=="water level"){
            System.out.println("Original values of water level: "+observable.get(1)+
                    "\nChange observed in water level: "+car.getWater_level()+"\n");
        }
    }

}
