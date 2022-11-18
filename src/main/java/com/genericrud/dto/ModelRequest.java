package com.genericrud.dto;

import io.github.cepr0.crud.dto.CrudRequest;
import lombok.Data;

@Data
public class ModelRequest implements CrudRequest{
	private Integer id;
	private String name;
}
