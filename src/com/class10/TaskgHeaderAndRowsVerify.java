package com.class10;

import Utils.CommonMethods;

public class TaskgHeaderAndRowsVerify extends CommonMethods {

	public static void main(String[] args) {
		/*
		 * TC 1: Table headers and rows verification
		 *  1. Open browser and 
		 *  go to �http://secure.smartbearsoftware.com/samples/testcomplete11 /WebOrders/login.aspx� 
		 *  2. Login to the application 
		 *  3. Create an Order 
		 *  4.Verify order of that person is displayed in the table �List of All Orders�
		 *   5.Click on edit of that specific order 
		 *   6. Verify each order details 
		 *   7. Update street address 
		 *   8. Verify in the table that street has been updated 
		 *   9. Close browser
		 * 
		 */
		String url = "http://secure.smartbearsoftware.com/samples/testcomplete11 /WebOrders/login.aspx";
		setUpDriver("chrome", url);
	}

}
