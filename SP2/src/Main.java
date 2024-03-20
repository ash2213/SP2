public class Main {
    public static void main(String[] args) {
        FleetOfCars fleet = new FleetOfCars();

        ElectricCar car1= new ElectricCar("1","Telsa","3",5,103,530);
        GasolinCar car2= new GasolinCar("2","Toyota","3",5,10);
        DieselCar car3= new DieselCar("1","Citroen","2",5,15,true);

        fleet.addCar(car1);
        fleet.addCar(car2);
        fleet.addCar(car3);

        System.out.println(fleet);
        

    }
}