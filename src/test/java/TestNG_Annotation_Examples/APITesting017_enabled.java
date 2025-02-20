package TestNG_Annotation_Examples;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class APITesting017_enabled {


    @Test(enabled = false) // it will disabled the test case/,method
    public void Test_tc1(){
        System.out.println("QA Test");
    }
    @Test
    public void Test_tc2(){
        System.out.println("Smoke Test");
    }
    @Test(enabled = false)
    public void Test_tc3(){
        System.out.println("Sanity Test");
    }
}
