
package com.mycompany;

import org.springframework.beans.factory.annotation.Autowired;

public class IndependentMessageRenderer {
   //благодар€ это аннотации Spring находит в контейнере бин с подход€щей реализацией
   @Autowired  //автосв€зывание
    private MessageRenderer renderer;

    public void print() {
        renderer.printMessage();
    }
}
