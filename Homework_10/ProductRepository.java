package Homework_10;

public class ProductRepository {
    private ProductDAO productDAO;

    public ProductRepository() {
        this.productDAO = new ProductDAO();
    }

    public void addProduct(Product product) {
        productDAO.addProduct(product);
        // Дополнительная бизнес-логика, если необходимо
    }

    public void deleteProduct(int productId) {
        productDAO.deleteProduct(productId);
        // Дополнительная бизнес-логика, если необходимо
    }

    public Product getProduct(int productId) {
        return productDAO.getProduct(productId);
    }

}
