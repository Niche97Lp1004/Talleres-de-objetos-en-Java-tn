package taller1_java;


/**
 *
 * @author Tania Forero
 */
public class Producto {
    
    public int Id;
    public String Name;
    public float price;
    private String NameofSupplier;
    protected int Stock;

    public Producto(int Id, String Name, float price, String NameofSupplier, int Stock) {
        this.Id = Id;
        this.Name = Name;
        this.price = price;
        this.NameofSupplier = NameofSupplier;
        this.Stock = Stock;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getNameofSupplier() {
        return NameofSupplier;
    }

    public void setNameofSupplier(String NameofSupplier) {
        this.NameofSupplier = NameofSupplier;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }
    
}
