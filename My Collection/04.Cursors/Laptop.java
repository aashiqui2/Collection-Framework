public class Laptop {
    int price;
    int gb;
    boolean touch;
    String brand;
    
    @Override
    public String toString(){
        return " "+this.brand+" "+this.gb+" "+this.price+" "+this.touch;
    }
    
    public Laptop(String brand,int price,int gb,boolean touch){
        this.brand=brand;
        this.price=price;
        this.gb=gb;
        this.touch=touch;
    }

    public Laptop() {
       
    }
}
