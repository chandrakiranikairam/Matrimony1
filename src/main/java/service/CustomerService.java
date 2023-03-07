package service;

import java.util.List;

import org.springframework.stereotype.Service;

import entity.Customer;


@Service
public interface CustomerService {

	List<Customer> findAllCustomers();

	Customer addCustomer(Customer cust);

	boolean deleteCustomer(Integer customerId);

	boolean editCustomer(Customer custom);

}


	

