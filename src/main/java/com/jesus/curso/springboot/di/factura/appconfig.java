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

    @Bean
    List<Item> itemsInvoice (){
        Product p1 = new Product("mota de la buena",850);
        Product p2 = new Product("wax del pegador",1200);
        List<Item> items = Arrays.asList(new Item(p1,2),new Item(p2,2));

        return items;
    }
}
