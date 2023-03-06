package kr.ac.kopo.product;

import kr.ac.kopo.model.Product;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductDaoImpl implements ProductDao{
    @Autowired
    SqlSession sql;


    @Override
    public List<Product> list() {
        return sql.selectList("product.list");
    }

    @Override
    public void add(Product product) {
        sql.insert("product.add", product);
    }

    @Override
    public Product item(int id) {
        return sql.selectOne("product.item");
    }

    @Override
    public void update(Product product) {
        sql.update("product.item", product);
    }

    @Override
    public void delete(int id) {

    }
}
