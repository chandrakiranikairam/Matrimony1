package service;


import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import dao.Admindao;
import entity.Customer;
import exception.UserNotFoundException;
import jakarta.transaction.Transactional;



@Component
@Transactional
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private Admindao aDao;

	@Override
	public List<Customer> findAllCustomers() {
		List<Customer> list=new ArrayList<>();
		aDao.findAll().forEach(list1->list.add(list1));
		return list;
	}



	@Override
	public Customer addCustomer(Customer cust) {
		aDao.save(cust);
		return cust;
	}


	@Override
	public boolean deleteCustomer(Integer customerId) {
		if(!aDao.existsById(customerId)) {
			throw new UserNotFoundException("the customer is not found for the entered address id : "+customerId);
			
		}
		aDao.deleteById(customerId);
		return true;
	}

	@Override	
	public boolean editCustomer(Customer custom) {
		    deleteCustomer(custom.getCustomerId());
			aDao.save(custom);
			return true;
	}



	}


