public class Main {
    public static void main(String[] args) {
        Car Fun = new Car("Suzuki", 24.7f, 24f, 28.4f, 30f,7.8f, 3f);
        Mechanic Roberto = new Mechanic();

        Fun.addObserver(Roberto);

        System.out.println(Fun.toString());

        Fun.setOil_level(4.5f);
        Fun.setIndividualTire_pressure("fl", 27f);
        Fun.setWater_level(10f);
        Fun.setAllTire_pressure(30f);
    }
}
