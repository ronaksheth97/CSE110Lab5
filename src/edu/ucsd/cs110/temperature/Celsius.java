package edu.ucsd.cs110.temperature;

public class Celsius extends Temperature {
  public Celsius(float t){
    super(t);
  }

  @Override
  public Temperature toCelsius() {
    return this;
  }

  @Override
  public Temperature toFahrenheit() {
    float temp = 9/5.0f;
    return new Fahrenheit((this.getValue() * (temp)) + 32);
  }

  public String toString(){
    return new String(this.getValue()+" C");
  }
}
