package TestNG_Annotation_Examples;

import org.testng.annotations.*;

public class APITesting013 {

    @AfterClass
    public void Test_tc1(){
        System.out.println("QA Test");
    }
    @Test
    public void Test_tc2(){
        System.out.println("Smoke Test");
    }
    @AfterTest
    public void Test_tc3(){
        System.out.println("Sanity Test");
    }
}
