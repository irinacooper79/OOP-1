public class Car {

    public String brabd;

    public String model;

    public float engineVolume;

    public String color;

    public int manufacturingYear;

    public String manufactureCountry;

    public Car ( String brand, String model, float engineVolume, String color, int manufacturingYear,
                 String manufactureCountry){

        this.brand = ValidationUtils.validOrDefault( brand, "default");
        this.model = ValidationUtils.validOrDefault (model, "default");
        this.engineVolume = engineVolume > 0.0f? engineVolume : 1.5f;
        this.color = ValidationUtils.validOrDefault (color, "White);
        this.manufacturingYear = manufacturingYear >=0 ? manufacturingYear :2000;
        this.manufactureCountry = ValidationUtils.validOrDefault(manufactureCountry, "default");

        public String toString(){
            return "Сar{" +
                    "brand=" + brand + "/" +
                    ", model=" + model + "/" +
                    ", engineVolume=" + engineVolume +
                    ", color=" + color + "/" +
                    "manufacturingYear=" + ManufacturingYear + "/" +
                    ", manufactureCountry=" + manufactureCountry + "/" +
                    '}';
        }
    }
}

