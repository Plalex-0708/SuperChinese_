
package com.mycompany.superchino;


public class Product {
        public String code;
    public String name;
    public String nameEmployer;
    public String idEmployer;
    public int cuantity;
    public double basePrice;
    public ProducType type;

    public Product(String code, String name, String nameEmployer, String idEmployer, int cuantity, double basePrice, ProducType type) {
        this.code = code;
        this.name = name;
        this.nameEmployer = nameEmployer;
        this.idEmployer = idEmployer;
        this.cuantity = cuantity;
        this.basePrice = basePrice;
        this.type = type;
    }

    

    public double calcBrutePrice() {
        switch (type) {
            case Alimentos:
                return basePrice * 0.20 + basePrice;
            case Bebidas:
                return basePrice * 0.30 + basePrice;
            case Higiene:
                return basePrice * 0.25 + basePrice + 500;
            case Limpieza:
                return basePrice * 0.19 + basePrice * 0.04 + 1000 + basePrice;
            default:
                return 0;
        }

    }

    public double calcEstiEarns() {
        return (calcBrutePrice() - basePrice) * cuantity;

    }

    public String showInfo() {
        return "Código: " + code + "\n"
                + "Nombre: " + name + "\n"
                + "Empleado que agregó: " + nameEmployer + "\n"
                + "Cédula del empleado: " + idEmployer + "\n"
                + "Cantidad: " + cuantity + "\n"
                + "Precio base: " + basePrice + "\n"
                + "Tipo de producto: " + type + "\n"
                + "Precio bruto: " + calcBrutePrice() + "\n"
                + "Ganancia esperada: " + calcEstiEarns() + "\n";
    }

}
