package com.cognizant.exchangeserviceproxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.cognizant.cartservice.model.SweetItem;

@FeignClient(name = "sweetitem-service")
public interface SweetItemExchangeServiceProxy {

	// to fetch sweet item from feign client
	@GetMapping("/sweet-item/customer/{sweetItemId}")
	public SweetItem findSweetItemById(@PathVariable("sweetItemId") int sweetItemId);
}
