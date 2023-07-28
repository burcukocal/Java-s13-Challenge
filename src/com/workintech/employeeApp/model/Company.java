package com.workintech.employeeApp.model;

import java.util.Arrays;

public class Company {
    private int id;
    private String name;
    private double giro;
    private String[] developerNames;

    public Company(int id, String name, double giro, String[] developerNames){
        this.id = id;
        this.name = name;
        checkGiro(giro);
        this.developerNames = developerNames;
    }
    private void checkGiro(double giro){
        if (giro < 0){
            this.giro = 0;
        } else {
            this.giro = giro;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGiro() {
        return giro;
    }

    public void setGiro(double giro) {
        checkGiro(giro);
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }

    public void addEmployee(int index, String name){
        try{
            if(developerNames[index] == null){
                developerNames[index] = name;
            } else{
                System.out.println("Indexte developer mevcut");
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Olmayan index için atama yapıldı" + index);
        }
    }

    public String toString(){
        return "Name: " + name + " Giro: " + giro + " Developers: " + Arrays.toString(developerNames);
    }
}
