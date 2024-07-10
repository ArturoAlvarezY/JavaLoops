package dev.arturo.models;

import java.util.ArrayList;
import java.util.List;

public class Multiply {

    Integer number;

    public Multiply(Integer number) {
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }

    public List<String> Multiplytable(){

    List<String>table = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
           table.add(number + "x" + i + "=" + (number*i)) ;
        }
        return table;
    }

    
}
