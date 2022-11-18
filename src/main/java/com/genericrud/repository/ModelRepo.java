package com.genericrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.genericrud.model.Model;

import io.github.cepr0.crud.repo.JpaRepo;


public interface ModelRepo extends JpaRepository<Model, Integer>
{

}
