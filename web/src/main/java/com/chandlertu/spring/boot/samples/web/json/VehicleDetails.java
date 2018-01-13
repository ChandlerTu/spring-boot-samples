package com.chandlertu.spring.boot.samples.web.json;

public class VehicleDetails {

  private String make;

  private String model;

  public VehicleDetails() {
  }

  public VehicleDetails(String make, String model) {
    this.make = make;
    this.model = model;
  }

  public String getMake() {
    return make;
  }

  public void setMake(String make) {
    this.make = make;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

}
