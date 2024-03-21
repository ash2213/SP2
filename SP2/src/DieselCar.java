public class DieselCar extends AFuelCar{


    boolean hasParticleFilter;

    public DieselCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre, boolean hasParticleFilter) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
        this.hasParticleFilter = hasParticleFilter;
    }

    public boolean hasParticleFilter(){
        return hasParticleFilter;


    }
    @Override
    String getFuelType() {
        return "Diesel";
    }

    @Override
    public int getRegistrationFee() {
        int fee=0;
        if(kmPrLitre>20 && kmPrLitre<=50) {
            fee = 130;
        }else if (kmPrLitre>=15 && kmPrLitre<=20){
            fee=1390;
        }else if (kmPrLitre >= 10 && kmPrLitre <= 15) {
            fee = 1850;
        }else if (kmPrLitre>=5 && kmPrLitre <= 10) {
            fee = 2770;
        }else if (kmPrLitre < 5) {
            fee = 15260;
        }
        if(!hasParticleFilter()){
            fee +=1000;
        }
        return fee;
    }

    public String toString(){
        return "\n"+"The registration fee is "+getRegistrationFee()+"Kr"+"\n"+"Brand: "+getMake()+"\n"+"Model:"+ getModel()+ "\n"+"Registration number: "+ getRegistrationNumber()+"\n"+"Fueltype: "+ getFuelType();
    }
}
