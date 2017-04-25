package com.crud.spring.dao;

import java.util.List;

import com.crud.spring.entity.Lokal;

public interface LocalDAO {

	public List<Lokal> getAllLocals(Integer ocena);
}
