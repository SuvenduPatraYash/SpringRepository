package com.Rdemo;

import org.springframework.stereotype.Component;

@Component
public class AddressDAO implements AppDAO {
	public String get() {
		return "Varanasi";
	}
}