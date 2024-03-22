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
        StringBuilder output= new StringBuilder("Cars in fleet: \n \n");
           for(Car car: fleet){
               output.append(car.toString()).append("\n");

           }

        return output.toString();
        }
    }

