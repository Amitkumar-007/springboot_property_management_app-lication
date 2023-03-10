 package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.PropertyDTO;
import com.example.demo.entity.PropertyEntity;
import com.example.demo.repository.PropertyRepository;
import com.example.demo.service.PropertyService;

@Service
public class PropertyServiceImpl implements PropertyService{

	@Autowired
	private PropertyRepository propertyRepository;
	
	@Override
	public PropertyDTO saveProperty(PropertyDTO propertyDTO) {
		PropertyEntity pe = new PropertyEntity();
		pe.setTitle(propertyDTO.getTitle());
		pe.setAddress(propertyDTO.getAddress());
		pe.setOwnerEmail(propertyDTO.getOwnerEmail());
		pe.setOwnerName(propertyDTO.getOwnerName());
		pe.setPrice(propertyDTO.getPrice());
		pe.setDescription(propertyDTO.getDescription());
		
		
		propertyRepository.save(pe);
		return null;
	}

}
