package de.neuefische;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Feature {
    public static void main(String[] args) {
        System.out.println("Hier ist was neues");
        List<Integer> numbers=new ArrayList<>(List.of(1,2,3,71));
        List<Double> newNumbers=numbers.stream().map(n->Double.valueOf(n)/10).collect(Collectors.toList());
        System.out.println(newNumbers);
    }
}
