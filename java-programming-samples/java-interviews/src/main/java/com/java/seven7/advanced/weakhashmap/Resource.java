package com.java.seven7.advanced.weakhashmap;

public class Resource {
    public String toString() {
        return "resource";
    }

    // finalize method
    public void finalize() {
        System.out.println("Finalize method is called");
    }
}
