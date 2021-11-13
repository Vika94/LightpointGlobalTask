package pageObject;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pageObject.forms.ElectronicsMenu;
import pageObject.forms.MenuProducts;
import pageObject.forms.MobilePhoneMenu;


public class HomePage {
    @FindBy(xpath = "//ul[@class='b-main-navigation']//li[@class='b-main-navigation__item']")
    SelenideElement catalog;

    public HomePage clickCatalogBtn() {
        Selenide.Wait().until(ExpectedConditions.elementToBeClickable(catalog)).click();
        return this;
    }

    public HomePage clickMenu(MenuProducts menuProducts) {
        Selenide.Wait().until(ExpectedConditions.elementToBeClickable(menuProducts.getElement())).click();
        return this;
    }

    public HomePage clickMenu(ElectronicsMenu electronicsMenu) {
        electronicsMenu.getElement().click();
        return this;
    }

    public HomePage clickMenu(MobilePhoneMenu mobilePhoneMenu) {
        mobilePhoneMenu.getElement().click();
        return this;
    }
}
