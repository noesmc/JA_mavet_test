package org.example.birds;

import actions.Move;
import actions.Voice;

import java.util.Calendar;

public abstract class Bird implements Voice, Move {
    protected String kind;
    protected String name;
    protected String colour;
    protected int yearOfBirth;

    public Bird(String name, String colour, int yearOfBirth) {
        this.kind = getClass().getSimpleName();
        this.name = name;
        this.colour = colour;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public static int getYear() {
        int year;
        Calendar calendar = Calendar.getInstance();
        year = calendar.get(Calendar.YEAR);
        return year;

    }

    public void move() {
        System.out.printf("%s move around using their powerful tails to swim. ", getName());
    }

    public void getInfo() {
        System.out.printf("The kind is \"%s\", called %s. %s's colour is %s. He is %d years old. ",
            kind,
            name,
            name,
            colour,
            getYear() - yearOfBirth);
    }
}
