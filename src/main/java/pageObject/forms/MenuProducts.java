package pageObject.forms;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static org.openqa.selenium.By.xpath;

public enum MenuProducts {
    ELECTRONICS($(xpath("//ul[contains(@class,'classifier')]//li[contains(@class,'classifier__item')]")));

    protected SelenideElement element;

    MenuProducts(SelenideElement element) {
        this.element = element;
    }

    public SelenideElement getElement() {
        return element;
    }

}
