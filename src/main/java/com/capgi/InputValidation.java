package com.capgi;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputValidation {
	public boolean dateValidation(String date) {
		Pattern pattern = Pattern.compile("^([0-3]){1}([0-9]){1}([a-z]){3}([1-9]){1}([0-9]){3}$");
		Matcher matcher = pattern.matcher(date);
		boolean isValid = matcher.find();
		return isValid;
	}

	public boolean CustomerValidation(String customerType) {
		Pattern pattern = Pattern.compile("[A-Z]{1}[a-z]+");
		Matcher matcher = pattern.matcher(customerType);
		boolean isValid = matcher.find();
		return isValid;
	}
}
