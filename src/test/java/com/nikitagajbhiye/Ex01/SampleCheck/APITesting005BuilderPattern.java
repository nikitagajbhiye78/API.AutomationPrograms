package com.nikitagajbhiye.Ex01.SampleCheck;

public class APITesting005BuilderPattern {

    public APITesting005BuilderPattern step1() {
        System.out.println("Step 1");
        return this;
    }

    public APITesting005BuilderPattern step2() {
        System.out.println("Step 2");
        return this;
    }

    public APITesting005BuilderPattern step3(String parameter) {
        System.out.println("Step 3");
        return this;
    }

    public static void main(String[] args) {
        APITesting004nodesignpattern bp = new APITesting004nodesignpattern();
    }
}
