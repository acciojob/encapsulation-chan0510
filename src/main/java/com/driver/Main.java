package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj= new RWOnly();
        obj.writeOnly ("Nikhil");
        System.out.println(obj.readOnly ());
    }
  
}