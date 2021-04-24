package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import util.screens.BaseScreen;

public class AddPlansOptions extends BaseScreen {


    /**
     * Constructor method for standard screens object.
     *
     * @param driver
     * @author Arley.Bolivar, Hans.Marquez
     */
    public AddPlansOptions(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Reserve Dining, 2 of 5, button\"]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView")
    private AndroidElement reserveDiningOption;
    public void isReserveDiningAvailable(){
        isElementAvailable(reserveDiningOption);
    }


    @Override
    public void alertControl() {

    }
}
