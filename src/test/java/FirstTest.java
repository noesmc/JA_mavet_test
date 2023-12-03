import org.example.Deep;
import org.example.animals.Animal;
import org.example.animals.Cat;
import org.example.animals.Dog;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Calendar;

public class FirstTest {

    @Test (groups = "negative")
    public static void negative() {
        int yearNow = 2022;
        Assert.assertEquals(yearNow, Cat.getYear());
    }

    @Test (groups = "positive")
    public static void positive() {
        int yearNow = 2023;
        Assert.assertEquals(yearNow, Cat.getYear());
    }
}