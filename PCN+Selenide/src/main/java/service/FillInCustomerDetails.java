package service;

import module.CustomerDetails;

public class FillInCustomerDetails {
	public static void fillCustomerDetails() {
		CustomerDetails.chooseNewCustomer();
		CustomerDetails.fillCustomerCodeField();
		CustomerDetails.fillCustomerNameField();
		CustomerDetails.clickStatusButton();
		CustomerDetails.fillDropdown();
		CustomerDetails.clickRegionButton();
		CustomerDetails.fillDropdown();
	}
}
