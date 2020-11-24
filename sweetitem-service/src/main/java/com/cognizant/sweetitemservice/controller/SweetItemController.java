package com.cognizant.sweetitemservice.controller;

import java.util.List;

import javax.validation.Valid;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.sweetitemservice.model.SweetItem;
import com.cognizant.sweetitemservice.service.SweetItemServiceImpl;

@RestController
@RequestMapping(value = "/sweet-item")
public class SweetItemController {

	@Autowired
	SweetItemServiceImpl sweetItemServiceImpl;

	// Method is used to fetch SweetItem List for Admin
	@GetMapping(value = "/admin", produces = MediaType.APPLICATION_JSON)
	public List<SweetItem> getSweetItemListAdmin() {
		return sweetItemServiceImpl.getSweetItemListAdmin();
	}

	// Method is used to fetch SweetItem List for Customer
	@GetMapping(value = "/customer", produces = MediaType.APPLICATION_JSON)
	public List<SweetItem> getSweetItemListCustomer() {

		return sweetItemServiceImpl.getSweetItemListCustomer();
	}

	// Method is used to modify SweetItem by SweetItem Id and accessible for Admin
	@PutMapping(value = "/admin/{sweetItemId}")
	public String modifySweetItem(@PathVariable @Valid int sweetItemId, @RequestBody SweetItem sweetItem) {
		SweetItem sweetItemModify = sweetItemServiceImpl.modifySweetItem(sweetItemId, sweetItem);
		return "Sweet Item modify successfully. \n" + sweetItemModify.toString();
	}

	// Method is used to fetch SweetItem by SweetItem Id for Customer
	@GetMapping(value = "/customer/{sweetItemId}", produces = MediaType.APPLICATION_JSON)
	public SweetItem getSweetItemCustomer(@PathVariable int sweetItemId) {

		return sweetItemServiceImpl.getSweetItem(sweetItemId);
	}

	// Method is used to fetch SweetItem by SweetItem Id for Admin
	@GetMapping(value = "/admin/{sweetItemId}", produces = MediaType.APPLICATION_JSON)
	public SweetItem getSweetItemAdmin(@PathVariable int sweetItemId) {

		return sweetItemServiceImpl.getSweetItem(sweetItemId);
	}

	// Method is used to add SweetItem in Database and accessible for Admin
	@PostMapping(value = "/admin")
	public String addSweetItem(@RequestBody @Valid SweetItem sweetItem) {
		SweetItem sweetItemAdd = sweetItemServiceImpl.addSweetItem(sweetItem);
		return "Sweet Item added successfully. \n"+sweetItemAdd.toString();
	}

	// Method is used to remove SweetItem from Database and accessible for Admin
	@DeleteMapping(value = "/admin/{sweetItemId}")
	public String removeSweetItem(@PathVariable @Valid int sweetItemId) {
		SweetItem sweetItemRemove = sweetItemServiceImpl.removeSweetItem(sweetItemId);
		return "Sweet Item removed successfully. \n"+sweetItemRemove.toString();
	}
}
