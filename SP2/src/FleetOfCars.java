import java.util.ArrayList;

public class FleetOfCars {

    ArrayList<Car> fleet= new ArrayList<>();

    public void addCar(Car car){
        fleet.add(car);

    }


    public int getTotalRegistrationFeeForFleet() {
        int totalfee=0;
        for(Car car:fleet){
            totalfee += car.getRegistrationFee();
        }

        return totalfee;
    }

        @Override

        public String toString(){
           for(Car car: fleet){
               System.out.println(car);
           }

        return "The total fee cost for this fleet of cars is " + getTotalRegistrationFeeForFleet()+ "Kr";
        }
    }

