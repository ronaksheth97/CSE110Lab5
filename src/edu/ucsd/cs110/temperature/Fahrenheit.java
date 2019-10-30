package edu.ucsd.cs110.temperature;

public class Fahrenheit extends Temperature {

  public Fahrenheit(float t){
    super(t);
  }

  @Override
  public Temperature toCelsius() {
    float temp = 5f/9;
    return new Celsius((this.getValue() - 32) * temp);
  }

  @Override
  public Temperature toFahrenheit() {
    return this;
  }

  public String toString(){
    return new String(this.getValue()+" F");
  }
}
