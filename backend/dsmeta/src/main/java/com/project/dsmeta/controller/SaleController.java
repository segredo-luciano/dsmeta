package com.project.dsmeta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.dsmeta.entities.Sale;
import com.project.dsmeta.services.SaleService;

@RequestMapping(value="/sales")
@RestController
public class SaleController {

	@Autowired
	private SaleService saleService;
	
	@GetMapping("listAll")
	public List<Sale> findSales() {
		return saleService.findSales();
	}
}
