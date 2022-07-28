package com.Rdemo;

import org.springframework.stereotype.Component;

@Component
public class CompanyDAO implements AppDAO {
	public String get() {
		return "MyCompany Ltd";
	}
}