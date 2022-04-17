package com.alzohar.products.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.alzohar.products.entity.Product;
import com.alzohar.products.repository.ProductRepository;

@Service
@Transactional
public class ProductService {

	@Autowired
	ProductRepository repo;

	public List<Product> listAll() {
		return repo.findAll(Sort.by("name").ascending());
	}
}
