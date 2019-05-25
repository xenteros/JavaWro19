package com.github.xenteros.dzien5;

abstract class Clothing {

    protected String description;
    private String color;
    private String material;
    private String size;

    public Clothing(String description, String color, String material, String size) {
        this.description = description;
        this.color = color;
        this.material = material;
        this.size = size;
    }

    public void display() {
        System.out.println("Displaying a piece of clothing.");
//        System.out.println("Description: " + description);
//        System.out.println("Color: " + color);
//        System.out.println("Material: " + material);
//        System.out.println("Size: " + size);
        System.out.println(String.format("Description: %s", description));
        System.out.println(String.format("Color: %s", color));
        System.out.println(String.format("Material: %s", material));
        System.out.println(String.format("Size: %s", size));

    }


    public String getDescription() {
        return description;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

    public String getSize() {
        return size;
    }
}
