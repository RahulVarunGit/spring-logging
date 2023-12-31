package com.rahulvarun.restdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rahulvarun.restdemo.model.CloudVendor;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService {
	
	@GetMapping("{vendorId}")
	public CloudVendor getCloudVendorDetails(String vendorId) {
		if (vendorId == "A1")
			return new CloudVendor("A1","Smith","Bloomington,IL","3091234567");
		else
			return new CloudVendor("Invalid Vendor ID","","","");
		
	}

}
