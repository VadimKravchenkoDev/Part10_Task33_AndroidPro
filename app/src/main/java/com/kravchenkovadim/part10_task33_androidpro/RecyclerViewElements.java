package com.kravchenkovadim.part10_task33_androidpro;


public class RecyclerViewElements  {

    private final int imageResource;
    private final String namePizza;
    private final String describePizza;
    private final String methodPizza;

    public RecyclerViewElements(int imageResource, String namePizza, String describePizza, String methodPizza) {
        this.imageResource = imageResource;
        this.namePizza = namePizza;
        this.describePizza = describePizza;
        this.methodPizza = methodPizza;
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

    public String methodPizza() {
        return methodPizza;
    }
}
