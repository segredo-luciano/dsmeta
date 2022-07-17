package com.project.dsmeta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.dsmeta.entities.Sale;
import com.project.dsmeta.services.SaleService;

@RequestMapping(value="/sales")
@RestController
public class SaleController {

	@Autowired
	private SaleService saleService;
	
	@GetMapping("listAll")
	public Page<Sale> findSales(@RequestParam(value="minDate", defaultValue="") String minDate, 
							@RequestParam(value="maxDate", defaultValue="") String maxDate, 
							Pageable pageable) {
		return saleService.findSales(minDate, maxDate, pageable);
	}
}
