package kr.ac.kopo.product;

import kr.ac.kopo.model.Product;
import org.apache.ibatis.annotations.ConstructorArgs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    final ProductDao dao;

    public ProductServiceImpl(ProductDao dao) {
        this.dao = dao;
    }

    @Override
    public List<Product> list() {
        return dao.list();
    }

    @Override
    public void add(Product product) {
        dao.add(product);
    }

    @Override
    public Product item(int id) {
        return dao.item(id);
    }

    @Override
    public void update(Product product) {
        dao.update(product);
    }

    @Override
    public void delete(int id) {
        dao.delete(id);
    }
}
