package pageObject;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.Assert;
import utils.ParsUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ProductsPage {
    ElementsCollection productsByPrice = $$(By.xpath("//span[contains(@data-bind,'minPrice')]"));

    SelenideElement productByPrice = $(By.xpath("(//span[contains(@data-bind,'minPrice')])[1]"));

    public ProductsPage verifyProductPrice() {
        List<String> list = new ArrayList<>();
        productsByPrice.forEach(product -> list.add(product.getText()));
        List<Double> listOfPrices = list.stream()
                .map(ParsUtils::parseStringToDouble)
                .collect(Collectors.toList());
        System.out.println(listOfPrices.get(0));
        Assert.assertTrue(listOfPrices.get(0) > 100);
        return this;
    }


    /*
   public ProductsPage verifyProductPrice() {
       Assert.assertTrue(ParsUtils.parseStringToDouble(productByPrice.getText()) > 100);
        return this;
    }
     */
}
