package homepage;

import base.CommonAPI;
import report.TestLogger;

public class HomePage extends CommonAPI {


    public void clickOnSearchBar() {
        clickOnElementByXpath("//input[@id='twotabsearchtextbox']");
        TestLogger.log("search bar clicked");
    }

    public void typeOnSearchBar(String value) {
        typeOnElementByXpath("//input[@id='twotabsearchtextbox']", value);
        TestLogger.log(value + " typed on the search bar");
    }

    public void clickOnSearchButton() {
        clickOnElementByXpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']");
        TestLogger.log("search button clicked");
    }


}
