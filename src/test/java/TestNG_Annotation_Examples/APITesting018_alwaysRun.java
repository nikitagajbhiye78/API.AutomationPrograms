package TestNG_Annotation_Examples;

import org.testng.annotations.Test;

public class APITesting018_alwaysRun {

    @Test(alwaysRun = false) // true will always run, even if we dont run
    public void Test_tc1(){
        System.out.println("QA Test");
    }

    @Test
    public void Test_tc2(){
        System.out.println("Smoke Test");
    }

    @Test(alwaysRun = true)
    public void Test_tc3(){
        System.out.println("Sanity Test");
    }
}
