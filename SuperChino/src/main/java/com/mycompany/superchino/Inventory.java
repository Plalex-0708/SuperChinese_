package com.mycompany.superchino;

public class Inventory {

    public String nameSuper;
    public String codeSuper;
    public Product[] products;
    public int cuantityProducts;

    public Inventory(String nameSuper, String codeSuper, Product[] products, int cuantityProducts) {
        this.nameSuper = nameSuper;
        this.codeSuper = codeSuper;
        this.products = new Product[100];
        this.cuantityProducts = cuantityProducts;
    }

    public String getNameSuper() {
        return nameSuper;
    }

    public void setNameSuper(String nameSuper) {
        this.nameSuper = nameSuper;
    }

    public String getCodeSuper() {
        return codeSuper;
    }

    public void setCodeSuper(String codeSuper) {
        this.codeSuper = codeSuper;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public int getCuantityProducts() {
        return cuantityProducts;
    }

    public void setCuantityProducts(int cuantityProducts) {
        this.cuantityProducts = cuantityProducts;
    }
    
    

    public void addProduct(Product producto) {
        products[cuantityProducts] = producto;
        cuantityProducts++;
    }

    public String showProducts() {
        String info = "Productos en el inventario de " + nameSuper + ":\n";
        for (int i = 0; i < cuantityProducts; i++) {
            info += "Producto " + (i + 1) + ":\n"
                    + products[i].showInfo() + "\n\n";
        }
        return info;
    }

    public double calcTotalEarns() {
        double totalEarns = 0;
        for (int i = 0; i < cuantityProducts; i++) {
            totalEarns += products[i].calcEstiEarns();
        }
        return totalEarns;
    }

}
