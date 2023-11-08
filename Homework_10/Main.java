package Homework_10;

public class Main {
    public static void main(String[] args) {
        ProductService productService = new ProductService();
        UnitOfWork unitOfWork = new UnitOfWork();

        Product product1 = new Product(/* заполните атрибуты продукта */);
        Product product2 = new Product(/* заполните атрибуты продукта */);

        unitOfWork.beginTransaction();
        productService.addProduct(product1);
        productService.addProduct(product2);

        // попытка отмены транзакции
        unitOfWork.rollback();

        // проверка, что изменения не сохранены
        // выведение списка всех продуктов с их атрибутами на экран
        // ...

        // завершение транзакции и выведение списка всех продуктов с их атрибутами на экран
        unitOfWork.commit();
    }

}
