package kr.ac.kopo.product;

import kr.ac.kopo.model.Product;

import java.util.List;

public interface ProductDao {
    List<Product> list();

    void add(Product product);

    Product item(int id);

    void update(Product product);

    void delete(int id);
}
