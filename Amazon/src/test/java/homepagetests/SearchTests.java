package homepagetests;

import SearchResult.ResultPage;
import homepage.HomePage;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class SearchTests extends HomePage {

    ResultPage resultPage = new ResultPage();

    @Test(enabled = false)
    public void validateSearchButtonWorks() {
        clickOnSearchBar();
        typeOnSearchBar("Java Books");
        clickOnSearchButton();
        sleepFor(2);
        resultPage.validateSearchPageDisplayed();
    }

    //@Test
    public void validateResultPage() {
        //resultPage.whatever();
    }

    @Test
    public void testAllDropDownMenu() {
        List<WebElement> elementList = getAllElementFromList();
        System.out.println(elementList.size());
        //homework -- print all the values of the dropdown (Not XPATH)
    }
}
