package com.bridgeit.AnnotationAutowiring;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Configuration
{
  @Bean
  public Intel Processor()
  {
	  return new Intel("i3, i5, i7");
  }
  @Bean
  public Autowiring mid()
  {
	  return new Autowiring();
  }
}
