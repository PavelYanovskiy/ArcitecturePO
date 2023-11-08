package Homework_10;

public class ProductService {
    private ProductRepository productRepository;

    public ProductService() {
        this.productRepository = new ProductRepository();
    }

    public void addProduct(Product product) {
        // Бизнес-логика, например, проверка цены продукта
        productRepository.addProduct(product);
    }

}
