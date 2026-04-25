package com.loginApi.LoginController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loginApi.LoginEntity.Entitys;
import com.loginApi.sevice.LoginService;

@RestController
@RequestMapping("/api")
public class Controller {
	
	@Autowired
	private LoginService sevice;
	
	@PostMapping("/addentity")
	public Entitys addEntity(@RequestBody Entitys entity) {
		return sevice.saveEntity(entity);
	}
	
	@PostMapping("/addentitys")
	public List<Entitys> addEntitys(@RequestBody List<Entitys> entitys) {
		return sevice.saveEntitys(entitys);
	}
	
	@GetMapping("/view")
	public List<Entitys> findAllEntity(){
		return sevice.getEntitys();
	}
	
	@GetMapping("/product/{id}")
	public Entitys getEntity(@PathVariable int id) {
		return sevice.getEntitysById(id);
	}
	
	@PutMapping("/update")
	public Entitys upEntity(@RequestBody Entitys entitys) {
		return sevice.upEntity(entitys);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deletEntity(@PathVariable int id) {
		return sevice.deleteEntitys(id);
	}

}
