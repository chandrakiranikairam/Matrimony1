package service;

import org.springframework.stereotype.Service;

import entity.Mediator;

@Service
public interface AdminService {

	boolean editMediator(Mediator med);

	Mediator addMediator(Mediator mediator);

	boolean deleteMediator(Integer medId);
	
}

	

	