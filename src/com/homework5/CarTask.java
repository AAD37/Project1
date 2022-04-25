package com.homework5;

public class CarTask {

    String carName;
    String carColor;
    int releaseYear;
    int horsePower;
    boolean secondHand;

    public CarTask (String carName, String carColor, int releaseYear, int horsePower, boolean secondHand) {
        this.carName = carName;
        this.carColor = carColor;
        this.releaseYear = releaseYear;
        this.horsePower = horsePower;
        this.secondHand = secondHand;
    }

    public CarTask(String carName, String carColor, boolean secondHand) {
        this.carName = carName;
        this.carColor = carColor;
        this.secondHand = secondHand;
        releaseYear = -1;
        horsePower = -1;
    }

    public CarTask(String carName, String carColor, int releaseYear, int horsePower) {
        this.carName = carName;
        this.carColor = carColor;
        this.releaseYear = releaseYear;
        this.horsePower = horsePower;
        carColor = "N/A";
        secondHand = false;
    }

    public CarTask(String carName, int releaseYear, int horsePower, boolean secondHand) {
        this.carName = carName;
        this.releaseYear = releaseYear;
        this.horsePower = horsePower;
        this.secondHand = secondHand;
    }

    public CarTask() {
    }

    public static void main(String[] args) {
        CarTask myCar1 = new CarTask("BMW", "blue", 2007, 158, true);
        CarTask myCar2 = new CarTask("Mazda", "red", true);
        CarTask myCar3 = new CarTask("Mercedes", "black", 2010, 200);
        CarTask myCar4 = new CarTask("Audi", 2015, 250, false);
        CarTask myCar5 = new CarTask();
        System.out.println(myCar1.carName);
    }

}
