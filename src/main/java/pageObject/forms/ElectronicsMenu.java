package pageObject.forms;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static org.openqa.selenium.By.xpath;

public enum ElectronicsMenu {
    MOBILEPHONES($(xpath("//div[contains(text(),'телефоны')]")));//div[contains(@class, 'aside_active')]//div[contains(@class, 'item_active')]

    protected SelenideElement element;

    ElectronicsMenu(SelenideElement element) {
        this.element = element;
    }

    public SelenideElement getElement() {
        return element;
    }
}

