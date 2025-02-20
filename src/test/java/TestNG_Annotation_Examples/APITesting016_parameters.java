package TestNG_Annotation_Examples;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class APITesting016_parameters {

    @Parameters("Browser")
    @Test
    public void demo1(String value) {
        System.out.println("Browser is"  + value);

        if (value.equalsIgnoreCase("Chrome")) {
            System.out.println("Your chrome browser is starting");
        }
        if (value.equalsIgnoreCase("Firefox")) {
            System.out.println("Your Firefox browser is starting");
        }
    }
}
