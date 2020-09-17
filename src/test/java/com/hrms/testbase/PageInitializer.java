package com.hrms.testbase;

import com.hrms.pages.AddEmployeePageElements;
import com.hrms.pages.DashboardPageElements;
import com.hrms.pages.LoginPageElements;
import com.hrms.pages.SearchEmployeeListPageElements;
import com.hrms.pages.ViewPersonalDetailsPageElements;

public class PageInitializer extends BaseClass{
	
	public static LoginPageElements login;
	protected static DashboardPageElements dash;
	protected static AddEmployeePageElements addEmp;
	protected static ViewPersonalDetailsPageElements persDetails;
	protected static SearchEmployeeListPageElements searchEmp;
	
	/**
	 * initializing the classes with web elements from pages package and it is called in setUp() from BaseClass class(testbase)
	 */

	public static void initializePageObjects() {
		login = new LoginPageElements();
		dash = new DashboardPageElements();
		addEmp = new AddEmployeePageElements();
		persDetails = new ViewPersonalDetailsPageElements();
		searchEmp = new SearchEmployeeListPageElements();
	}
}
