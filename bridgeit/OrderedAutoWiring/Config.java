package com.bridgeit.OrderedAutoWiring;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

@Configuration
public class Config 
{
	@Bean
	public CollectionBean getCollectionBean()
	{
		return new CollectionBean();
	}

	@Bean
	public List<String> nameList()
	{
		return Arrays.asList("Srujan","Suman","Madipeddi","Srujan2");
	}

	@Bean
	public Map<Integer, String> nameMap()
	{
	    Map<Integer, String>  nameMap = new HashMap<Integer, String>();
	    nameMap.put(1, "Srujan");
	    nameMap.put(2, "Suman");
	    nameMap.put(3, "Madipeddi");
	    nameMap.put(4, "Srujan2");
	    return nameMap;
	}

	@Bean
	public MapBean getMapBean()
	{
		return new MapBean();
	}

	@Bean
	public OrderBean getOrderBean()
	{
		return new OrderBean();
	}

	@Bean
	@Order(3)
	public Names getName()
	{
		return new Names();
	}
	@Bean
	@Order(1)
	public Names getName1()
	{
		return new Names(); 
	}
	@Bean
	@Order(2)
	public Names getName2()
	{
		Names nm=new Names();
		nm.setName("Srujan");
		return nm;
	}
	@Bean
	@Order(4)
	public Names getName4()
	{
		return new Names();
	}
}

	
	
	

