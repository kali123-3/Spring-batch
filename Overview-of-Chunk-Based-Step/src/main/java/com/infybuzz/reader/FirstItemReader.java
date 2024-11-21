package com.infybuzz.reader;


import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.stereotype.Component;

import java.util.*;
@Component
public class FirstItemReader implements ItemReader<Integer> {
    List<Integer> list = Arrays.asList(0,1,2,3,4,6);
    int i= 0;
    @Override
    public Integer read()  {
            System.out.println("Inside item Reader method");
              Integer item;
              while(i<list.size()){
                  item = list.get(i);
                  i++;
                  return item;
              }
        return null;
    }
}
