package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.HowToUseLocators;
import screens.components.AlertPopup;
import util.screens.BaseScreen;

import java.util.List;

import static io.appium.java_client.pagefactory.LocatorGroupStrategy.ALL_POSSIBLE;

/**
 * DashBoard screen.
 * 
 * @author Hans.Marquez
 *
 */
public class DashBoardScreen extends BaseScreen {

	/**
	 * Constructor method.
	 * 
	 * @author Hans.Marquez
	 * 
	 * @param driver
	 *            : AndroidDriver
	 */

	/**
	 *
	 * @param driver Creando los tests con selectores
	 */
	public DashBoardScreen(AndroidDriver<AndroidElement> driver) {
		super(driver);
	}

	@HowToUseLocators(androidAutomation = ALL_POSSIBLE)
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.disney.wdpro.dlr:id/tmpsubacts_root\").childSelector(new UiSelector().textContains(\"Sign In\"))")
	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.disney.wdpro.dlr:id/tmpsubacts_primary\")")
    private AndroidElement signInButton;

	@AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Map, Tab, 2of5\"]")
	private AndroidElement mapIcon;

	@AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"More Options, Tab, 5of5, Features shopping, photos, mobile orders, tickets, chat with us, help and your profile.\"]")
	private AndroidElement menuIcon;

	@AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Add Plans, Tab, 3of5\"]")
	private AndroidElement addPlanIcon;

	/**
	 * Creando los Metodos para llamar selectores
	 */
	public void tapMap(){
		click(mapIcon);
	}
	public void tapMenu(){
		click(menuIcon);
	}
	public void tapAddPlans() {
		click(addPlanIcon);
	}
	/**
             * @author Hans.Marquez
             *
             * @description: Handle with random PopUps available in DashBoard Screen.
             *
             */


	public LoginScreen goToLoginScreen() {
		click(signInButton);
		return new LoginScreen(driver);
	}
	

	/**
	 * Alert control.
	 */
	@Override
	public void alertControl() {
		int retries = 0;
		try {
			while(retries < 3) {
				AlertPopup alertPopup = new AlertPopup(driver);
				alertPopup.accept();
				retries++;
			}
		} catch (Exception e) {
			log.info("No alerts found.");
			log.info(e);
		}
	}
}
