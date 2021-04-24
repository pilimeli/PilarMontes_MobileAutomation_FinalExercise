package tests;

import org.apache.log4j.Priority;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.springframework.context.annotation.Description;

import screens.*;
import util.tests.BaseMobileTest;

public class EjercicioMobileTest extends BaseMobileTest {

	@Description(value = "Failed assertive login test ID:0001")
	@Test()
	public void failedLoginTest() {
		log.info("Starting Failed assertive login test");
		DashBoardScreen dashBoard = dismissTutorial();
		LoginScreen login = dashBoard.goToLoginScreen();
		login.fillInLoginData("email", "password");
		String bannerText = login.getBannerText();
		Assert.assertEquals(bannerText, "Something's not right…. We're sorry for the inconvenience!");
	}
	@Test(priority = 0)
	public void testCategory(){
		DashBoardScreen dashBoard = dismissTutorial();
		dashBoard.tapMap();
		Categories categories = new Categories(driver);
		categories.tapOnAttractionsList();
		categories.tapOptionHotel();
	}
	@Test(priority = 1)
	public void privacyLegal(){
		DashBoardScreen dashBoard = dismissTutorial();
		dashBoard.tapMenu();
		PrivacyLegal ejercicioPL = new PrivacyLegal(driver);
		ejercicioPL.scrollToPrivacyAndLegal();
		ejercicioPL.tapOnPrivacyAndLegal();
	}
	@Test(priority = 2)
	public void plansOptions(){
		DashBoardScreen dashBoard = dismissTutorial();
		dashBoard.tapAddPlans();
		AddPlansOptions addplans = new AddPlansOptions(driver);
		addplans.isReserveDiningAvailable();
	}

}