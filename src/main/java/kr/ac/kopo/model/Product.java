package kr.ac.kopo.model;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Getter
@Slf4j
public class Product {
    private int id;
    private String name;
    private int price;
    private int category;


    /**
     * @param name
     * @param price
     * @param category 기본 생성자
     */
    public Product(String name, int price, int category) {

        this.name = name;
        this.price = price;
        this.category = category;

        log.info("productName = {}   ", name);
        log.info("price = {}   ", price);
        log.info("category = {}   ", category);
    }

    public void setId(int id){

        this.id = id;
    }

}