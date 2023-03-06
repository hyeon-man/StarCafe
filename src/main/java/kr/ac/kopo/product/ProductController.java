package kr.ac.kopo.product;

import kr.ac.kopo.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {

    final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @GetMapping("/list")
    public String list(Model model) {

        List<Product> list = service.list();
        model.addAttribute("list", list);

//        Product product = new Product("아이스 아메리카노", 3000, "음료");

        return "product/list";
    }

    @GetMapping("/add")
    public String add() {
        return "product/add";
    }

    @PostMapping("/add")
    public String add(Product product) {
        service.add(product);

        return "redirect:list";
    }

    @GetMapping("/update/{id}")
    public String update(@PathVariable int id, Model model) {
        Product item = service.item(id);
        model.addAttribute("item", item);

        return "product/update";
    }

    @PostMapping("/update/{id}")
    public String update(@PathVariable int id, Product product) {
        product.setId(id);
        service.update(product);
        return "redirect:../list";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id){
        service.delete(id);

        return "redirect:../list";
    }
}
