public abstract class AFuelCar extends ACar {
int kmPrLitre;

    public AFuelCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre) {
        super(registrationNumber,make,model,numberOfDoors);
        this.kmPrLitre=kmPrLitre;
    }

    //should return Gasoline or Diesel
abstract String getFuelType();

public int getKmPrLitre(){

    return kmPrLitre;
}

@Override

    public String toString(){
    return "";
}

}
