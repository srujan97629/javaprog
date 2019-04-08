package com.bridgeit.VisitorDesignPattern;

public interface ShoppingCartVisitor
{
	int visit(Book book);
	int visit(Fruit fruit);
}
