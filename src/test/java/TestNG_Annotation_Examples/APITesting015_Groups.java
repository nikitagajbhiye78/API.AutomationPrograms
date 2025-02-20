package TestNG_Annotation_Examples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITesting015_Groups {

    @Test(groups = {"Reg Test, QA Test"})
    public void Sanity(){
        System.out.println("Sanity Test");
    }
    @Test(groups = {"QA Test"})
    public void Regration(){
        System.out.println("Reg Test");
    }
    @Test(groups = {"Sanity Test"})
    public void Smoke(){
        System.out.println("Reg Test");
    }
    @Test(groups = {"QA Test"})
    public void Explore(){
        System.out.println("QA Test");
    }
}
