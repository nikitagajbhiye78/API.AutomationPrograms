package com.nikitagajbhiye.Ex01.SampleCheck;

public class APITesting004nodesignpattern {
    public void step1() {
        System.out.println("Step1");
    }

    public void step2() {
        System.out.println("Step2");
    }

    public void step3(String parameter) {
        System.out.println("Step3");
    }

    public static void main(String[] args) {
        APITesting004nodesignpattern np = new APITesting004nodesignpattern();
        np.step1();
        np.step2();
        np.step3("Nikita");
    }

}
