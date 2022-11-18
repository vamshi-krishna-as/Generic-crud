package com.genericrud.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.genericrud.dto.ModelRequest;
import com.genericrud.dto.ModelRespomse;
import com.genericrud.model.Model;

import io.github.cepr0.crud.api.AbstractCrudController;
import io.github.cepr0.crud.service.CrudService;

@RestController
@RequestMapping("/models")
public class ModelController extends AbstractCrudController<Model, Integer, ModelRequest, ModelRespomse>
{

	public ModelController(CrudService<Model, Integer, ModelRequest, ModelRespomse> service) {
		super(service);
		// TODO Auto-generated constructor stub
	}
	
	@PostMapping("/create")
	public ResponseEntity<ModelRespomse> create(@RequestBody ModelRequest request){
        return super.create(request);	
	}
	
	@GetMapping("/getModel/{id}")
	public ResponseEntity<ModelRespomse> getOne(@PathVariable("id") Integer id) {
	    return super.getOne(id);
	}

}
