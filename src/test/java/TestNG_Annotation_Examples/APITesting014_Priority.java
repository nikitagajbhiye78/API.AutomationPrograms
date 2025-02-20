package TestNG_Annotation_Examples;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class APITesting014_Priority {

        @Test(priority = 3)
        public void Test_tc1(){
            System.out.println("QA Test");
        }
        @Test(priority = 1)
        public void Test_tc2(){
            System.out.println("Smoke Test");
        }
        @Test(priority = 2)
        public void Test_tc3(){
            System.out.println("Sanity Test");
        }
    }


