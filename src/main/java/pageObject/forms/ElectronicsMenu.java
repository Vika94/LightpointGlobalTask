package pageObject.forms;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static org.openqa.selenium.By.xpath;

public enum ElectronicsMenu {
    MOBILEPHONES($(xpath("//div[contains(@Class, 'catalog-navigation-list_opened')]//div[contains(@Class, 'title')][1]")));

    protected SelenideElement element;

    ElectronicsMenu(SelenideElement element) {
        this.element = element;
    }

    public SelenideElement getElement() {
        return element;
    }
}

