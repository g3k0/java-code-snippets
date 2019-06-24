package oop;

public class Tree extends Plant {

    @Override
    public void grow() {
        System.out.println("oop.Tree growing");
    }

    public void shedLeaves() {
        System.out.println("Leaves shedding");
    }
}
