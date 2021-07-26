public class Food {
    private String name;
    private float price;
    private float quantity;
    private java.time.LocalDate expirationDate;
    private int stockAvailability;

    public void setName(String name){
        this.name=name;
    }
    public void setPrice(float price){
        this.price=price;
    }
    public void setQuantity(float quantity){
        this.quantity=quantity;
    }
    public void setExpirationDate(java.time.LocalDate expirationDate){
        this.expirationDate =expirationDate;
    }
    public void setStockAvailability(int stockAvailability){
        this.stockAvailability =stockAvailability;
    }
    public String getName(){
        return name;
    }
    public float getPrice(){
        return price;
    }
    public float getQuantity(){
        return quantity;
    }
    public java.time.LocalDate getExpirationDate(){
        return expirationDate;
    }
    public int getStockAvailability(){
        return stockAvailability;
    }


}
