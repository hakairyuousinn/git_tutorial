package javafiles.issues;

public class Bond{
    public static void main(String[] args) {
        System.out.println("Hello World, Hello Innovation");
        Bond bond = new Bond();
        bond.setName("name");
        System.out.println(bond.getName());
    }

    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}