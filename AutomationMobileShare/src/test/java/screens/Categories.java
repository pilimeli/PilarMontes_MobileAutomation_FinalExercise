package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import util.screens.BaseScreen;

public class Categories extends BaseScreen {
    /**
     * Constructor method for standard screens object.
     *
     * @param driver
     * @author Arley.Bolivar, Hans.Marquez
     */
    public Categories(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    @AndroidFindBy(id = "com.disney.wdpro.dlr:id/categoryTitle")
    private AndroidElement tapOnAtractionsList;
    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"Hotels, Category, 11of12, button\"]")
    private AndroidElement optionHotel;
    public void tapOnAttractionsList(){
        click(tapOnAtractionsList);
    }

    public void tapOptionHotel(){
        click(optionHotel);
    }


    @Override
    public void alertControl() {

    }
}
