package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import dao.Admindao;
import entity.Mediator;
import exception.UserNotFoundException;
import jakarta.transaction.Transactional;

@Component
@Transactional
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	private Admindao aDao;

	@Override
	public Mediator addMediator(Mediator mediator) {
		aDao.save(mediator);
		return mediator;
	}

	@Override
	public boolean editMediator(Mediator med) {
		 deleteMediator(med.getMediatorId());
			aDao.save(med);
			return true;
	}

	@Override
	public boolean deleteMediator(Integer medId) {
		if(!aDao.existsById(medId)) {
			throw new UserNotFoundException("the mediator is not found for the entered mediator id : "+medId);
			
		}
		aDao.deleteById(medId);
		return true;}}
	



