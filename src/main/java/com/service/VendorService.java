package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.domain.Vendor;
import com.repo.VendorRepository;

@Service
public class VendorService {
	@Autowired
	private VendorRepository vendorRepository;
	
	public List<Vendor> findAllusers(){
		
		List<Vendor> vendors = (List<Vendor>) vendorRepository.findAll();
		return vendors;
	}
	
	public Vendor find(int vendor_id){
		Vendor vendor = vendorRepository.find(vendor_id);
		return vendor;
	}
	
	public Vendor save(Vendor vendor){
	Vendor vendor1=vendorRepository.save(vendor);
		return vendor1;
	}
	
	public void delete(int vendor_id){
		vendorRepository.delete(vendor_id);
	}
}
