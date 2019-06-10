/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author user
 */
@Configuration
@ComponentScan(basePackages="com.mycompany")
public class AppConfig {
   @Bean
   public MessageRenderer messageRenderer(){
       return new MessageRendererErrorImpl(message());
       
   }
   @Bean
   public Message message(){
       return new HelloMessage("Sergei!");
   }
}
