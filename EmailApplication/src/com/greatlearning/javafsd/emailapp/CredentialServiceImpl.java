package com.greatlearning.javafsd.emailapp;

public class CredentialServiceImpl implements ICredentialService {

	@Override
	public String generatePassword() {

		PasswordGenerator generator = new PasswordGenerator();

		String password = generator.generate();

		return password;
	}

	@Override
	public String generateEmailAddress(Employee employee) {

		String firstName = employee.getFirstName();

		String lastName = employee.getLastName();

		String department = employee.getDepartment();

		StringBuilder emailBuilder = new StringBuilder();

		emailBuilder.append(firstName.toLowerCase());
		emailBuilder.append(".");
		emailBuilder.append(lastName.toLowerCase());
		emailBuilder.append("@");
		emailBuilder.append(department);
		emailBuilder.append(".gl.com");

		String emailAdress = emailBuilder.toString();

		employee.setEmailAddress(emailAdress);

		return emailAdress;
	}

	@Override
	public void displayCredentials(Employee employee) {

		StringBuilder messageBuilder = new StringBuilder();

		messageBuilder.append("Dear ");
		messageBuilder.append(employee.getFirstName());
		messageBuilder.append(", Your generated credentials are as follows");

		String newline = System.getProperty("line.separator");
		messageBuilder.append(newline);
		messageBuilder.append("Email   ---> ");
		messageBuilder.append(employee.getEmailAddress());
		messageBuilder.append(newline);
		messageBuilder.append("Password  --->");
		messageBuilder.append(employee.getPassword());

		String finalMessage = messageBuilder.toString();

		System.out.println(finalMessage);
	}
}