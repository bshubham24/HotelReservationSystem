package com.capgi;

public class Customer {
	private String customerType;

	public Customer() {

	}

	public String getCustomerType() {
		return customerType;
	}

	public boolean setCustomerType(String customerType) throws InputValidationException {
		boolean check = false;
			InputValidation inputValidation = new InputValidation();
			check = inputValidation.CustomerValidation(customerType);
			if (check)
				this.customerType = customerType;
			else
				throw new InputValidationException("Enter proper customer type");

		return check;
	}

}
