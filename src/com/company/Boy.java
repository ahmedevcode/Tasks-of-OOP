package com.company;

public class Boy extends Person{
    private  String wfottball;

    public String getWfottball() {
        return wfottball;
    }

    public void setWfottball(String wfottball) {
        this.wfottball = wfottball;
    }

    public Boy(){
        System.out.println("hey ahmed");
    }

    public Boy(String wfottball) {
        this.wfottball = wfottball;
        System.out.println(wfottball);
    }

    @Override
    public void eat(){
        super.eat();
        System.out.println(" is  eating in the night of ramadan Ahmed");

    }
}
