package RestAssured_Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardSoft_Assertion023 {

    // HardAssertion if condition or code fail, rest of the part will not execute
    @Test
    public void demo1 (){
        System.out.println("Start of the program");
        Boolean is_neeru_male = false;
        Assert.assertTrue(is_neeru_male);
        System.out.println("End of the program");
        // Assert.assertEquals("Nikita" , "Nikita");
       //  Assert.assertEquals("Nikita" , "nikita"); // Case sensitive
    }
    @Test
    public void demo2(){
        System.out.println("Start of the program");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(false); // assertTrue != false
        System.out.println("This line still executed");
        softAssert.assertAll();
    }
}
