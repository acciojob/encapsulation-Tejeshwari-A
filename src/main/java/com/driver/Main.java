package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly rwOnly = new RWOnly();

        //System.out.println(rwOnly.name = "name");
        //java: name has private access in com.driver.RWOnly

        rwOnly.setName("new name");
        System.out.println(rwOnly.getName());
    }
}