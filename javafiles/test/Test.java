package javafiles.test;

import javafiles.issues.Bond;

class Test{
    public static void main(String[] args) {
        System.out.println("Hello World, Hello Innovation");  
        Bond bond = new Bond("name", "bond");
        System.out.println(bond.getCode() + bond.getName()); 
    }
}