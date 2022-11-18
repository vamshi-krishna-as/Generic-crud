package com.genericrud.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.genericrud.dto.ModelRequest;
import com.genericrud.dto.ModelRespomse;
import com.genericrud.model.Model;

import io.github.cepr0.crud.mapper.CrudMapper;

@Mapper(config = CrudMapper.class)
public abstract class ModelMapper implements CrudMapper<Model, ModelRequest, ModelRespomse>
{
	@Mapping(target ="id", source = "id")
	public abstract ModelRespomse toResponse(Model model);
	
	@Mapping(target ="id", source = "id")
	public abstract Model toRequest(ModelRequest modelreq);
}
