package TestNG_Annotation_Examples;

import org.testng.annotations.Test;

public class APITesting019_invocationCount {

    @Test(invocationCount = 2) // how many times wanna run test case
    public void Test_tc1(){
        System.out.println("QA Test");
    }

    @Test
    public void Test_tc2(){
        System.out.println("Smoke Test");
    }

    @Test(invocationCount = 1)
    public void Test_tc3(){
        System.out.println("Sanity Test");
    }
}
