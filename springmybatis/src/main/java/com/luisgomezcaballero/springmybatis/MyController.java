package com.luisgomezcaballero.springmybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@Autowired
	private MyEntityMapper myEntityMapper;
	
	public MyController() {
	}
	
	@RequestMapping(value = "/findAll", method = RequestMethod.GET)
	public List<MyEntity> findAll() {
		return myEntityMapper.findAll();
	}


}
