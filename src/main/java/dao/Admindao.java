package dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entity.Customer;
import entity.Mediator;

@Repository
public interface Admindao extends JpaRepository<Customer,Integer>{

	void save(Mediator mediator);

}
