package com.example;

 /**
  * This is a class.
  */
  
public class Greeter {

 /**
  * This is a constructeur
  */
  public Greeter() {

  }
/**
  * @param someone name of a person
  * @return greeting string
  */
  
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
