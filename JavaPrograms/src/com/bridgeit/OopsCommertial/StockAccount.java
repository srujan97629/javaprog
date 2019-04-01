package com.bridgeit.OopsCommertial;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import com.bridgeit.DataStructures.utility.LinkedList;
import com.bridgeit.DataStructures.utility.Queue;
import com.bridgeit.DataStructures.utility.QueueList;
import com.bridgeit.DataStructures.utility.StackGenerics;
import com.bridgeit.DataStructures.utility.StackLinked;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;


public class StockAccount implements StockInterface {
	StackGenerics stack = new StackGenerics(100);
	LinkedList list = new LinkedList();
	StackLinked stackList = new StackLinked();
	Queue queue = new Queue(100);
	QueueList queueList = new QueueList();

	private Customer customer;
	private CompanyShares companyShares;

	public static ObjectMapper objMapperRef = new ObjectMapper();
	File customerFile = new File("/home/admin1/eclipse-workspace/jsonfiles/CustomerFile.json");
	File companySharesFile = new File("/home/admin1/eclipse-workspace/jsonfiles/CompanySharesFiles.json");

	public StockAccount() {

	}
	// constructor having argument
	public StockAccount(String fileName) {
		CommertialUtility.addAccount(fileName);
	}

	@Override

	public double valueOf() {
		Scanner scan = new Scanner(System.in);
		try {
			List<Customer> customerList = objMapperRef.readValue(customerFile, new TypeReference<List<Customer>>() {
			});
			List<CompanyShares> companySharesList = objMapperRef.readValue(companySharesFile,
					new TypeReference<List<CompanyShares>>() {	});
	
			System.out.println("Enter the person name");
			String searchName = scan.next().toUpperCase();
			int index = CommertialUtility.searchCustomerIndex(searchName, customerList);
			if (index != -1) {
				Customer customer = new Customer();
				customer = customerList.get(index);

				int relianceShares = companySharesList.get(0).getPrice() * customer.getRelianceShares();
				int hdfcShares = companySharesList.get(1).getPrice() * customer.getHdfcShares();
				int iciciShares = companySharesList.get(2).getPrice() * customer.getIciciShares();

				int totalValue = relianceShares + hdfcShares + iciciShares;

				System.out.print("\nTotal Value of Stock: ");

				return (double) totalValue;
			} else {
				return -1;
			}

		} catch (IOException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public void list()
	{

			try {
				List<CompanyShares> companySharesList = objMapperRef.readValue(companySharesFile,
						new TypeReference<List<CompanyShares>>() {
						});
				List<Customer> customerList = objMapperRef.readValue(customerFile, new TypeReference<List<Customer>>() {
				});

				String emptyString="";
				for(int i=0;i<companySharesList.size();i++)
				{
					emptyString=companySharesList.get(i).toString();
				
					list.add(emptyString);
				}

			} catch (IOException e) {
				System.out.println(""+e.getMessage());
				e.printStackTrace();
			}
	}
	
	public void stack()
	{

			try {
				List<CompanyShares> companySharesList = objMapperRef.readValue(companySharesFile,
						new TypeReference<List<CompanyShares>>() {
						});
				List<Customer> customerList = objMapperRef.readValue(customerFile, new TypeReference<List<Customer>>() {
				});

				String emptyString="";
				for(int i=0;i<companySharesList.size();i++)
				{
					emptyString=companySharesList.get(i).toString();
				
					stackList.push(emptyString);
				}
			} catch (IOException e) {
				System.out.println(""+e.getMessage());
				e.printStackTrace();
			}
	}

	@Override

	public void buy(int shares, String symbol) {
		Scanner scan = new Scanner(System.in);
		try {
			List<CompanyShares> companySharesList = objMapperRef.readValue(companySharesFile,
					new TypeReference<List<CompanyShares>>() {
					});
			List<Customer> customerList = objMapperRef.readValue(customerFile, new TypeReference<List<Customer>>() {
			});
			System.out.println("Enter the person name");

			String searchName = scan.next().toUpperCase();
			int custIndex = CommertialUtility.searchCustomerIndex(searchName, customerList);
			int stockIndex = CommertialUtility.searchSharesBySymbol(symbol, companySharesList);
			String stackSymbol = null;
			CompanyShares companyShares = null;
			if (custIndex != -1) {
				companyShares = companySharesList.get(stockIndex);
				int noOfShares = companyShares.getNoOfShares();
				companyShares.setNoOfShares(noOfShares - shares);
				stackSymbol = companyShares.getStockSymbol();
				
				Customer customer = customerList.get(custIndex);
				if (stockIndex == 0) {
					int value = customer.getRelianceShares();
					customer.setRelianceShares(value + shares);
				}
				if (stockIndex == 1) {
					int value = customer.getHdfcShares();
					customer.setHdfcShares(value + shares);
				}
				if (stockIndex == 2) {
					int value = customer.getIciciShares();
					customer.setIciciShares(value + shares);
				}
			} else {
				System.out.println("stock not found!");
			}

			objMapperRef.writerWithDefaultPrettyPrinter().writeValue(companySharesFile, companySharesList);
			objMapperRef.writerWithDefaultPrettyPrinter().writeValue(customerFile, customerList);

			System.out.println("\n----------Stock Details----------");
			System.out.printf("%-15s %-20s %-20s\n", "Company Name", "NO. of Stocks", "Price");
			System.out.println("------------------------------------------------------------------");
			System.out.println(companySharesList.get(stockIndex).toString());

			System.out.printf("\n%-15s %-20s %-20s %-20s\n", "Cust. Name", "Reliance(Shares)", "HDFC(Shares)",
					"ICICI(Shares)");
			System.out.println("-------------------------------------------------------------------");
			System.out.println(customerList.get(custIndex).toString());
			System.out.println("==================In LIST==================");
			
			System.out.println("Company Shares in LIST:");
			list();
			list.print();

			System.out.println("---------------------------------------------");
			//stack.push(stackSymbol);
			System.out.println("Company Symbol in STACK LIST:");
			stackList.displayList();
			System.out.println("-------------------------------------------");

			
			Date currentDate = new Date();
			String date = currentDate.toString();
			queue.enQueue(date);         		
			queueList.print();
			System.out.println("");

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void sell(int amount, String symbol) {
		Scanner scan = new Scanner(System.in);
		try {

			List<CompanyShares> companySharesList = objMapperRef.readValue(companySharesFile,
					new TypeReference<List<CompanyShares>>() {
					});
			List<Customer> customerList = objMapperRef.readValue(customerFile, new TypeReference<List<Customer>>() {
			});

			int stockIndex = CommertialUtility.searchSharesBySymbol(symbol, companySharesList);
			System.out.println("Enter the person name");
			String searchName = scan.next().toUpperCase();
			int custIndex = CommertialUtility.searchCustomerIndex(searchName, customerList);
			String stackSymbol = "";
			CompanyShares companyShares = null;
			if (custIndex != -1) {
				companyShares = companySharesList.get(stockIndex);
				int noOfShares = companyShares.getNoOfShares();
				companyShares.setNoOfShares(noOfShares + amount);

				System.out.println("");
				stackSymbol = companyShares.getStockSymbol();
				
				Customer customer = customerList.get(custIndex);
				if (stockIndex == 0) {
					int value = customer.getRelianceShares();
					customer.setRelianceShares(value - amount);
				}
				if (stockIndex == 1) {
					int value = customer.getHdfcShares();
					customer.setHdfcShares(value - amount);
				}
				if (stockIndex == 2) {
					int value = customer.getIciciShares();
					customer.setIciciShares(value - amount);
				}
			} else {
				System.err.println("Sorry stock not found!");
			}

			objMapperRef.writerWithDefaultPrettyPrinter().writeValue(companySharesFile, companySharesList);
			objMapperRef.writerWithDefaultPrettyPrinter().writeValue(customerFile, customerList);

			System.out.println("\n----------Stock Details----------");
			System.out.printf("%-15s %-20s %-20s\n", "Company Name", "NO. of Stocks", "Price");
			System.out.println("---------------------------------------------------------------------");
			System.out.println(companySharesList.get(stockIndex).toString());

			System.out.println("\n---------- Customer Details ----------");
			System.out.printf("\n%-15s %-20s %-20s %-20s\n", "Customer Name", "Reliance(Shares)", "HDFC(Shares)",
					"ICICI(Shares)");
			System.out.println("----------------------------------------------------------------------");
			System.out.println(customerList.get(custIndex).toString());
			System.out.println("  ");
			System.out.println("================== In LIST ==================");

			System.out.println("Company Shares in LIST:");
			list();
			list.print();

			System.out.println("---------------------------------------------");
			//stack.push(stackSymbol);
			System.out.println("Company Symbol in STACK LIST :");
			stackList.displayList();
			System.out.println("-------------------------------------------");

			String date = "";
			Date currentDate = new Date();
			date = currentDate.toString();
			queue.enQueue(date);
			
			queue.push(date);
			
			queueList.print();
			System.out.println("");
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void save(String fileName, List<Customer> customerList) {
		try {
			objMapperRef.writerWithDefaultPrettyPrinter().writeValue(new File(fileName), customerList);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void printReport() {
		try {
			List<CompanyShares> companySharesList = objMapperRef.readValue(companySharesFile,
					new TypeReference<List<CompanyShares>>() {});
					
			List<Customer> customerList = objMapperRef.readValue(customerFile, new TypeReference<List<Customer>>() {
			});
			Date currentDate = new Date();
			String date = currentDate.toString();
            System.out.println("Transcation Date :"+date);
            System.out.println("     ");
			System.out.println("\n---------- Stock Details ----------");
			System.out.printf("%-15s %-20s %-20s\n", "Company Name", "NO. of Stocks", "Price");
			System.out.println("-----------------------------------------------------------------");
			for (int i = 0; i < companySharesList.size(); i++) {

				System.out.println(companySharesList.get(i).toString());
			}

			System.out.println("\n---------- Customer Details ----------");
			System.out.printf("\n%-15s %-20s %-20s %-20s\n", "Cust. Name", "Reliance(Shares)", "HDFC(Shares)",
					"ICICI(Shares)");
			System.out.println("----------------------------------------------------------------------");
			for (int i = 0; i < customerList.size(); i++) {
				System.out.println(customerList.get(i).toString());
			}

		} catch (IOException e) {
			System.err.println("Please check your file details");
			e.printStackTrace();
		}

	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public CompanyShares getCompanyShares() {
		return companyShares;
	}

	public void setCompanyShares(CompanyShares companyShares) {
		this.companyShares = companyShares;
	}

}

	
	
	

