package com.kravchenkovadim.part10_task33_androidpro;


public class RecyclerViewElements  {

    private int imageResource;
    private String namePizza;
    private String describePizza;

    public RecyclerViewElements(int imageResource, String namePizza, String describePizza) {
        this.imageResource = imageResource;
        this.namePizza = namePizza;
        this.describePizza = describePizza;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getNamePizza() {
        return namePizza;
    }

    public String getDescribePizza() {
        return describePizza;
    }
}
