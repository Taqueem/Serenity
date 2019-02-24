package pages;

import enums.Category;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://www.ebay.com")
public class EbayHomePage extends PageObject {


    public void selectCategory(Category category){
        find(By.linkText(category.name())).click();
    }

}
