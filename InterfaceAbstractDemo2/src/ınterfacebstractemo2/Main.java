package ýnterfacebstractemo2;

import java.util.Date;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager=new StarbucksCustomerManager(new MernisServiceAdapter());
		Customer customer1=new Customer(1,"Muhammet","Yýlmaz",new Date(2001,06,27),"00000000");
		
		customerManager.Save(customer1);
		
		//customer.Save(new Customer());

	}

}
