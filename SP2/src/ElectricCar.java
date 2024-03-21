public class ElectricCar extends ACar{


    private int batteryCapacity;
    private int maxRange;

    public ElectricCar(String registrationNumber, String make, String model, int numberOfDoors, int batteryCapacity,int maxRange) {
        super(registrationNumber, make, model, numberOfDoors);
        this.batteryCapacity=batteryCapacity;
        this.maxRange=maxRange;
    }


public int getBatteryCapacityKWh(){
    return batteryCapacity;

}

public int getMaxRangeKm(){
    return maxRange;

}


public int getWhPrKm(){

        return ((batteryCapacity*1000)/maxRange);

}


    @Override
    public int getRegistrationFee() {
        double WhPrKm = getWhPrKm();
        double kmPerLitreEquivalent = 100/(WhPrKm/ 91.25);
        int fee=0;
        if(kmPerLitreEquivalent>20 && kmPerLitreEquivalent<=50) {
            fee = 330;
        }else if (kmPerLitreEquivalent>=15 && kmPerLitreEquivalent<=20){
            fee= 1050;
        }else if (kmPerLitreEquivalent >= 10 && kmPerLitreEquivalent <= 15) {
            fee = 2340;
        }else if (kmPerLitreEquivalent>=5 && kmPerLitreEquivalent <= 10) {
            fee = 5500;
        }else if (kmPerLitreEquivalent < 5) {
            fee = 10470;
        }
        return fee;

    }

    public String toString(){
    return "The registration fee is "+getRegistrationFee()+"Kr"+"\n"+"Brand: "+ getMake()+"\n"+"Model: "+ getModel()+ "\n"+"Registration number: "+ getRegistrationNumber();
    }
}
