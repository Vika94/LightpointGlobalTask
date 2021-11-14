package pageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.Assert;
import utils.ParsUtils;

import static com.codeborne.selenide.Selenide.$;

public class ProductsPage {
    private final int priceBYN = 100;
    private SelenideElement firstProductPrice = $(By.xpath("(//span[contains(@data-bind,'minPrice')])[1]"));

    public ProductsPage verifyFirstProductPrice() {
        Assert.assertTrue(ParsUtils.parseStringToDouble(firstProductPrice.getText()) > priceBYN);
        return this;
    }
}
