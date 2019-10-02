package homepagetests;

import SearchResult.ResultPage;
import homepage.HomePage;
import org.testng.annotations.Test;

public class SearchTests extends HomePage {

    ResultPage resultPage = new ResultPage();

    @Test
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
}
