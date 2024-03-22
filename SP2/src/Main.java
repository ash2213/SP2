public class Main {
    public static void main(String[] args) {
        FleetOfCars fleet = new FleetOfCars();

        ElectricCar car1= new ElectricCar("1","Telsa","S",5,103,530);
        GasolinCar car2= new GasolinCar("2","Toyota","300i",5,10);
        DieselCar car3= new DieselCar("3","Citroen","2700",5,15,true);

        fleet.addCar(car1);
        fleet.addCar(car2);
        fleet.addCar(car3);

        System.out.println(fleet);

        System.out.println("Total registration fee for fleet "+fleet.getTotalRegistrationFeeForFleet()+"Kr");


    }
}