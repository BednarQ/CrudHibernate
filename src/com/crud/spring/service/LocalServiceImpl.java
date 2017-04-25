package com.crud.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.crud.spring.dao.LocalDAO;
import com.crud.spring.entity.Lokal;


@Service
public class LocalServiceImpl implements LocalService {

	
	//inject dao
	
	@Autowired
	private LocalDAO localDAO;
	
	@Override
	@Transactional
	public List<Lokal> getLocals(Integer ocena) {
		// TODO Auto-generated method stub
		return localDAO.getAllLocals(ocena);
	}

}
