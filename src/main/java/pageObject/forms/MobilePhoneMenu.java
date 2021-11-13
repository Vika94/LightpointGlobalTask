package pageObject.forms;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public enum MobilePhoneMenu {
    SMARTPHONES($(By.xpath("//div[contains(@class,'list_opened')]//div[contains(@class,'dropdown-list')]/a")));

    protected SelenideElement element;

    MobilePhoneMenu(SelenideElement element) {
        this.element = element;
    }

    public SelenideElement getElement() {
        return element;
    }
}
