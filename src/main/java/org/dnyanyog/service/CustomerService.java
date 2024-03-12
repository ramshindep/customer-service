package org.dnyanyog.service;

import org.dnyanyog.dto.CustomerRequest;
import org.dnyanyog.dto.CustomerResponse;

public interface CustomerService {

	public CustomerResponse addCustomerDetails(CustomerRequest customerRequest);

	public CustomerResponse updateCustomerDetails(long id, CustomerRequest customerRequest) ;
	
	//public CustomerResponse findByEmailId(String email_id);
	
	public CustomerResponse findByMobileNumber(String mobile_number);
		
}
