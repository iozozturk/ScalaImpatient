package Chapter05Classes;

/**
 * Created by ismet özöztürk on 25/07/15.
 */
public class Car {
    private  String manufacturer;
    private  String model;
    private  int year;
    public   String plate;

    public Car(String manufacturer, String model, int year, String plate){
        this.manufacturer = manufacturer;
        this.plate = plate;
        this.year = year;
        this.model = model;
    }

    @Override
    public String toString(){
        return manufacturer + " " + model + " " + year + " " + plate;
    }

    public Car(String manufacturer, String model){
        this(manufacturer, model, -1, "");
    }
    public Car(String manufacturer, String model, int year){
        this(manufacturer, model, year, "");
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public Car(String manufacturer, String model, String plate) {
        this(manufacturer, model, -1, plate);
    }
}
