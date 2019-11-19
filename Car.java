public class Car {

public String make;
public String model;
private double fuelEfficiency;
private double year;
private double amtPaid;
private double tankSize;
private double tankFuel;
private double milesTravelled;

  public Car (String make, String model, double fuelEfficiency, double year, double amtPaid, double tankSize, double tankFuel) {
  this.make = make;
  this.model = model;
  this.fuelEfficiency = fuelEfficiency;
  this.year = year;
  this.amtPaid = amtPaid;
  this.tankSize = tankSize;
  this.tankFuel = tankFuel;
  }
  public void drive (double miles) {
  milesTravelled  +=  miles;
  tankFuel -= miles * (1/fuelEfficiency);
  }



}
