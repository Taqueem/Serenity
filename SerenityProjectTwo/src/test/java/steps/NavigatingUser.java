package steps;

import enums.Category;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import pages.CurrentPage;
import pages.EbayHomePage;



public class NavigatingUser {

    EbayHomePage ebayHomePage;
    CurrentPage currentPage;
    @Step
    public void isOnHomePage() {
        ebayHomePage.open();
    }

    @Step
    public void navigatesToCategory(Category category ) {

    ebayHomePage.selectCategory(category);
    }

    @Step
    public void shouldSeePageTitle(String expectedTitle) {

        Assert.assertEquals(currentPage.getTitle(),expectedTitle);

    }
}
