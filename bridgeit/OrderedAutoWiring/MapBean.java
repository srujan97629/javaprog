package com.bridgeit.OrderedAutoWiring;

import java.util.Map;

public class MapBean 
{
    private Map<Integer,String> nameMap; 
    
    public void setNameMap(Map<Integer,String> nameMap)
    {
    	this.nameMap=nameMap;
    }
    public void printNameMap()
    {
    	System.out.println(nameMap);
    }
}
