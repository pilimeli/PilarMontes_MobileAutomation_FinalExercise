package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import util.screens.BaseScreen;

public class PrivacyLegal extends BaseScreen {


    /**
     * Constructor method for standard screens object.
     *
     * @param driver
     * @author Arley.Bolivar, Hans.Marquez
     */
    public PrivacyLegal(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }
    @AndroidFindBy(xpath = "//android.widget.RelativeLayout[@content-desc=\"Privacy & Legal button\"]/android.widget.TextView[2]")
    private AndroidElement privacyAndLegalSection;
    public void scrollToPrivacyAndLegal(){
        scrollDown(6);
    }
    public void tapOnPrivacyAndLegal(){
        click(privacyAndLegalSection);
    }


    @Override
    public void alertControl() {

    }
}
