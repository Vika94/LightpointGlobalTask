package pageObject.forms;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static com.codeborne.selenide.Selenide.$;

public class FilterProducts {
    @FindBy(xpath = "//div[@class='schema-filter__fieldset']//span[@class='i-checkbox__faux']")
    private SelenideElement appleBtn;

    private SelenideElement loadBtn = $(By.xpath("//div[contains(@class,'button__state_animated')]"));

    public FilterProducts clickAppleBtn() {
        appleBtn.click();
        Selenide.Wait().until(ExpectedConditions.invisibilityOf(loadBtn));
        return this;
    }
}
