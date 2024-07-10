package dev.arturo.models;

public class Multiply {

    Integer number;

    public Multiply(Integer number) {
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }

    public void getingMultiplies(){
        for (int i = 0; i <= 10; i++) {
            System.out.println(number + "x" + i + "=" + (number*i) );
        }
    }
}
