package com.Rdemo;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.Rdemo.AddressDAO;
import com.Rdemo.AppDAO;
import com.Rdemo.CompanyDAO;

@Service
public class EmployeeService {
	@Resource(type = CompanyDAO.class)
	private AppDAO company;
	@Resource(type = AddressDAO.class)
	private AppDAO address;

	public AppDAO getCompany() {
		return company;
	}

	public AppDAO getAddress() {
		return address;
	}
}