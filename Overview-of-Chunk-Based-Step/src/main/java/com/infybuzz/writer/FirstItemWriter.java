package com.infybuzz.writer;


import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Component;

import java.sql.SQLOutput;
import java.util.List;
@Component
public class FirstItemWriter implements ItemWriter<Long> {
   //Long is the value of output of ItemReader...........
    @Override
    public void write(List<? extends Long> list) throws Exception {
        System.out.println("Inside item writer method");
        list.stream().forEach(System.out::println);
    }
}
