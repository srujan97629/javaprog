package com.bridgeit.VisitorDesignPattern;

public interface ItemElement
{
	public int accept(ShoppingCartVisitor visitor);
}
