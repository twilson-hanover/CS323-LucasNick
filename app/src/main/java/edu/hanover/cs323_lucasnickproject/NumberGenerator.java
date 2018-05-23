package edu.hanover.cs323_lucasnickproject;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NumberGenerator {
    Random rand = new Random();
    List<String> getNumber(String number) {
        int myNumber = new ArrayList<~>();
        if (number.equals("5")) {
            myNumber = rand.nextInt(5);
        }
        else if (number.equals("10")) {
            myNumber = rand.nextInt(10);
        }
        else if (number.equals("15")) {
            myNumber = rand.nextInt(15);
        }
        else if (number.equals("20")) {
            myNumber = rand.nextInt(20);
        }
        else if (number.equals("25")) {
            myNumber = rand.nextInt(25);
        }
        else if (number.equals("30")) {
            myNumber = rand.nextInt(30);
        }
        else if (number.equals("50")) {
            myNumber = rand.nextInt(50);
        }
        else if (number.equals("75")) {
            myNumber = rand.nextInt(75);
        }
        else {
            myNumber = rand.nextInt(100);
        }
        return myNumber;
    }
}
