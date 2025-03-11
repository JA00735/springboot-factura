package com.jesus.curso.springboot.di.factura;

import com.jesus.curso.springboot.di.factura.models.Item;
import com.jesus.curso.springboot.di.factura.models.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
@PropertySource("classpath:data.properties")
public class appconfig {

    @Bean("2")
    List<Item> itemsInvoice (){
        Product p1 = new Product("mota de la buena",850);
        Product p2 = new Product("wax del pegador",1200);
        List<Item> items = Arrays.asList(new Item(p1,2),new Item(p2,2));

        return items;
    }

    @Bean("1")
    List<Item> itemsInvoice2 (){
        Product p1 = new Product("purple haze",700);
        Product p2 = new Product("mango kush",1100);
        Product p3 = new Product("ak-47 og",900);
        Product p4 = new Product("de la mas chida",3000);
        List<Item> items2 = Arrays.asList(new Item(p1,2),new Item(p2,2)
        ,new Item(p3,4),new Item(p4,3));

        return items2;
    }
}
