package Exrecises_P03_WildFarm.foods;

public abstract class Food {
    private int quantity;

    public Food(int quantity) {
        setQuantity(quantity);
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity>0){
            this.quantity = quantity;
        }else{
            this.quantity=0;
        }

    }
}
