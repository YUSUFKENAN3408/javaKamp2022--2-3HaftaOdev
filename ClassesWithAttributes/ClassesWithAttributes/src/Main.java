public class Main {
    public static void main(String[] args) {
       // Product product = new Product(id:1, name:"Laptop", description:"Asus Laptop", price:300, stockAmound:2, renk:
        //"Siyah");


        Product product = new Product();
        product.setName("Laptop");
        product.setId(1);
        product.setPrice(5000);
        product.setDescription("Asus Laptop");
        product.setStockAmount(3);


        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        System.out.println(product.getKod());

    }
}