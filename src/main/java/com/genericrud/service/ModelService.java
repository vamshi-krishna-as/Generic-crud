package com.genericrud.service;

import org.springframework.stereotype.Service;

import com.genericrud.dto.ModelRequest;
import com.genericrud.dto.ModelRespomse;
import com.genericrud.model.Model;

import io.github.cepr0.crud.mapper.CrudMapper;
import io.github.cepr0.crud.repo.CrudRepo;
import io.github.cepr0.crud.service.AbstractCrudService;

@Service
public class ModelService extends AbstractCrudService<Model, Integer, ModelRequest, ModelRespomse>
{

	protected ModelService(CrudRepo<Model, Integer> repo, CrudMapper<Model, ModelRequest, ModelRespomse> mapper) {
		super(repo, mapper);
	}

	
}
