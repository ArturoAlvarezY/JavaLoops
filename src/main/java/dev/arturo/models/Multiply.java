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

    public List<Integer> Multiplytable(){

    List<Integer>table = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
          table.add(number*i);
        }
        return table;
    }
}
