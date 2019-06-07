
package com.mycompany;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {
        // invertion of control container
        ApplicationContext context = new
                ClassPathXmlApplicationContext("com.mycompany\\context.xml");
   

        MessageRendererBefore rendererBefore = (MessageRendererBefore) context.getBean("MessageRendererBefore");

        rendererBefore.printMessage();
        

        IndependentMessageRenderer rendererIndependency = context.getBean(IndependentMessageRenderer.class);
        rendererIndependency.print();
    }
}