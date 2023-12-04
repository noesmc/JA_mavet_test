import org.example.animals.Cat;
import org.testng.Assert;
import org.testng.annotations.Test;

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