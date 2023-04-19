package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int basePrice;

    private int vegBasePrice = 300;
    private int nonvegBaseprice = 400;
    private int cheaseprice = 80;
    private int extoppingsnonveg = 120;
    private int extraToppingsVeg = 70;
    private int bagPrice = 20;
    private boolean ischeaseAdded;
   private  boolean isextraTopppings;
   private int toppingPrice;


   private boolean istakeAway;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
       basePrice =gateBaseprice();
       price = basePrice;
        ischeaseAdded = false;
    }

    public int getPrice(){

        return this.price;
    }
    private int gateBaseprice(){
        return  price = isVeg ? vegBasePrice : nonvegBaseprice;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!ischeaseAdded){
            ischeaseAdded =true;
            price+=cheaseprice;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if (! isextraTopppings){
            isextraTopppings = true;
           if (isVeg) {
               toppingPrice+=extraToppingsVeg;
               price += extraToppingsVeg;
           }
           else{
               toppingPrice+=extoppingsnonveg;
               price+=extoppingsnonveg;
           }
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!istakeAway){
            istakeAway = true;
            price+=bagPrice;
        }
    }

    public String getBill(){
        // your code goes here
        String var = "";
        var+= "Base Price of the Pizza : " + basePrice +"\n";
        if(ischeaseAdded){
            var+= "Extra Cheese Added : "+cheaseprice + "\n";
        }
        if(isextraTopppings){
            var+= "Extra Topping Added : " + toppingPrice + "\n";
        }
        if(istakeAway){
            var+= "Extra paperbag price : " + bagPrice + "\n";
        }
        var += "total Price :" + price +"\n";
        this.bill = var;
        return this.bill;
    }
}
