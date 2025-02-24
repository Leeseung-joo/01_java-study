package com.minkook.section01.polymorphism;

public class Child1 extends Parent {
    private int z;

    public Child1() {

    }

    public Child1(int z) {
        this.z = z;
    }

    public Child1(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }


    public void printChild1(){
        System.out.println("나 첫번재 자식이야" );
    }

    @Override
    public void printParent(){
        System.out.println("나 첫번째 자식이야");
    }
}
