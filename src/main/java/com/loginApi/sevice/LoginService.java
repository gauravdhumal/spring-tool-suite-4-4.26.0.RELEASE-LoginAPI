package com.loginApi.sevice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loginApi.LoginEntity.Entitys;
import com.loginApi.LoginRepo.Repository;

@Service
public class LoginService {
	
	@Autowired
	private Repository repo;
	
	//add data in database
	public Entitys saveEntity(Entitys entitys) {
		return repo.save(entitys);
	}
	
	//add list of data in database
	public List<Entitys> saveEntitys(List<Entitys> entityss) {
		return repo.saveAll(entityss);
	}
	
	//view list of data in database
	public List<Entitys> getEntitys() {
		return repo.findAll();
	}
	
	//delete data from database
	public String deleteEntitys(int id) {
		repo.deleteById(id);
		return ("remove sucessfully...!"+ id);
	}

	public Entitys getEntitysById(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	public Entitys upEntity(Entitys entitys) {
		// TODO Auto-generated method stub
		return repo.save(entitys);
	}
	
	
	
}
