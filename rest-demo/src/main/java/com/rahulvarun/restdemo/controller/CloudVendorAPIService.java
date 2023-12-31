package com.rahulvarun.restdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rahulvarun.restdemo.model.CloudVendor;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService {
	
	CloudVendor cloudVendor;
	
	@GetMapping("/{id}")
	public CloudVendor getCloudVendorDetails(@PathVariable String id) {
		System.out.println("id: " + id);
		if (cloudVendor == null)
			return new CloudVendor("No Cloud Vendors Created","","","");
		if (id.equals(cloudVendor.getVendorId()))
			return cloudVendor;
		else
			return new CloudVendor("Invalid Vendor ID","","","");
		
	}
	@PostMapping
	public String postCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
		this.cloudVendor = cloudVendor;
		return("Cloud Vendor Added");
	}
	
	@PutMapping
	public String putCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
		this.cloudVendor = cloudVendor;
		return("Cloud Vendor Added");
	}

}
