
package com.mycompany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class IndependentMessageRenderer {
   //благодаря это аннотации Spring находит в контейнере бин с подходящей реализацией
    //благодаря этой аннотации Sring находит в контейнере бин с подходящей реализацией
   @Autowired  //автосвязывание
    private MessageRenderer renderer;

    public void print() {
        renderer.printMessage();
    }
}
