package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	private ICustomerCheckService customerCheckManager;
	
	public StarbucksCustomerManager(ICustomerCheckService customerCheckManager) {
		super();
		this.customerCheckManager = customerCheckManager;
	}

	@Override
	public void Save(Customer customer)  {
		try {
			if(customerCheckManager.CheckIfRealPerson(customer)) {
				super.Save(customer);

			}
			
		} catch (Exception e) {
			System.out.println("Veritabanýna Kaydedilmedi");
		}
	
	}

	
}
