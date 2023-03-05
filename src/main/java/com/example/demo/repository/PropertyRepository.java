package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.PropertyEntity;

public interface PropertyRepository extends CrudRepository<PropertyEntity,Long> {

}
