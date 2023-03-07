package dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entity.Customer;
import entity.UserDetails;


@Repository
public interface Userdao extends JpaRepository<UserDetails,Integer>{

	Customer getByUserId(Integer customerId);
}

