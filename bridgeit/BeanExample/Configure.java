package com.bridgeit.BeanExample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configure 
{
  @Bean
  public Hostel hostel()
  {
	  return new Hostel("srujan","Madipeddi");	
  }
}
