package com.genericrud.dto;

import io.github.cepr0.crud.dto.CrudResponse;
import lombok.Data;

@Data
public class ModelRespomse implements CrudResponse<Integer>
{
	private Integer id;
	private String name;
}
