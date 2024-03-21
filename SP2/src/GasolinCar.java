public class GasolinCar extends AFuelCar{
    public GasolinCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
    }

    @Override
    String getFuelType() {
        return "Gasoline";
    }

    @Override
    public int getRegistrationFee() {
            int fee=0;
            if(kmPrLitre>20 && kmPrLitre<=50) {
                fee = 330;
            }else if (kmPrLitre>=15 && kmPrLitre<=20){
                fee= 1050;
            }else if (kmPrLitre >= 10 && kmPrLitre <= 15) {
                fee = 2340;
            }else if (kmPrLitre>=5 && kmPrLitre <= 10) {
                fee = 5500;
            }else if (kmPrLitre < 5) {
                fee = 10470;
            }
            return fee;

    }

    public String toString(){
        return "\n"+"The registration fee is "+getRegistrationFee()+"Kr"+"\n"+"Brand: "+getMake()+"\n"+"Model: "+ getModel()+ "\n"+"Registration number: "+ getRegistrationNumber()+"\n"+"Fueltype: "+getFuelType();
    }
}
