package TestNG_Annotation_Examples;

import org.testng.annotations.Test;

public class APITesting015_dependsOn {

    @Test
    public void Test_tc1(){
        System.out.println("QA Test");
    }
    @Test(dependsOnMethods = "method2")
    public void Method1(){
        System.out.println("Smoke Test");
    }
    @Test(dependsOnMethods = "Test_tc1")
    public void method2(){
        System.out.println("Sanity Test");
    }
}
