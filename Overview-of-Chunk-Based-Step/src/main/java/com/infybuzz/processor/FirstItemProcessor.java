package com.infybuzz.processor;


import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

@Component
public class FirstItemProcessor implements ItemProcessor<Integer, Long> {
    //Integer is the outPut of ItemReader..................
    @Override
    public Long process(Integer item) throws Exception {
        System.out.println("Inside item processor");
        //Le processs transofrmation faite
        return Long.valueOf(item+ 20) ;
    }
}
