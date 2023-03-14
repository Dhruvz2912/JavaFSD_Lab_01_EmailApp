package com.greatlearning.javafsd.emailapp.test;

import com.greatlearning.javafsd.emailapp.CredentialServiceImpl;
import com.greatlearning.javafsd.emailapp.Employee;
import com.greatlearning.javafsd.emailapp.PasswordGenerator;

public class CredentialServiceImplTest {

	public static void main(String[] args) {

		testEmailAddressGeneration();
		testPasswordGeneration();
		testdisplayCredentials();
	}

	static void testEmailAddressGeneration() {

		CredentialServiceImpl serviceImpl = new CredentialServiceImpl();

		Employee dhruv = new Employee("dhruv", "dalwadi", "technical");

		String emailAdress = serviceImpl.generateEmailAddress(dhruv);

		System.out.println(emailAdress);
	}

	static void testPasswordGeneration() {

		CredentialServiceImpl serviceImpl = new CredentialServiceImpl();

		String password = serviceImpl.generatePassword();

		System.out.println("Password-> " + password);

	}

	static void testdisplayCredentials() {

		CredentialServiceImpl serviceImpl = new CredentialServiceImpl();

		Employee dhruv = new Employee("Dhruv", "Dalwadi", "technical");

		serviceImpl.generateEmailAddress(dhruv);

		String password = serviceImpl.generatePassword();

		dhruv.setPassword(password);

		serviceImpl.displayCredentials(dhruv);

	}
}
