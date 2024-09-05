import java.sql.SQLOutput;

public class Pizza {
    private int price;
    private Boolean veg;

    private int extraCheesePrice = 100;
    private int extraToppingsPrice = 150;
    private int bagPackPrice = 20;

    private int basePizzaPrice;

    private boolean isExtraToppingsAdded = false;
    private boolean isExtraCheeseAdded = false;
    private boolean optedForTakeAway = false;

    public Pizza(Boolean veg) {
        this.veg = veg;
        if(this.veg){
            this.price = 300;
        }
        else{
            this.price = 400;
        }
        basePizzaPrice = this.price;
    }

    public void addExtraCheese(){
        isExtraCheeseAdded = true;
        this.price += extraCheesePrice;
    }
    public void addExtraToppings(){
        isExtraToppingsAdded = true;
        this.price += extraToppingsPrice;
    }
    public void takeAway(){
        optedForTakeAway = true;
        this.price += bagPackPrice;
    }

    public void getBill() {
        String bill = "";
        System.out.println("----Bill----");
        System.out.println("Pizza: "+basePizzaPrice);
        if (isExtraCheeseAdded){
            bill += "Extra Cheese Added: " + extraCheesePrice + "\n";
        }
        if (isExtraToppingsAdded){
            bill += "Extra Toppings Added: " + extraToppingsPrice + "\n";
        }
        if (optedForTakeAway){
            bill += "Take Away: " + bagPackPrice + "\n";
        }
        bill += "Total:" + this.price + "\n";
        System.out.println(bill);
        System.out.println("----END----");
    }
}


/*
* Pizza : 300
* Toppings: 150
* Cheese: 100
* Take Away: 20
* */