import baseTest.BaseTest;
import org.testng.annotations.Test;
import pageObject.HomePage;
import pageObject.ProductsPage;
import pageObject.forms.ElectronicsMenu;
import pageObject.forms.FilterProducts;
import pageObject.forms.MenuProducts;
import pageObject.forms.MobilePhoneMenu;

public class Tests extends BaseTest {

    @Test
    public void checkingIPhoneByPrice() {
        get(HomePage.class).clickCatalogBtn()
                .selectItemMenu(MenuProducts.ELECTRONICS)
                .selectItemMenuElectronics(ElectronicsMenu.MOBILEPHONES)
                .selectItemMenuMobilePhone(MobilePhoneMenu.SMARTPHONES);
        get(FilterProducts.class).clickAppleBtn();
        get(ProductsPage.class).verifyFirstProductPrice();
    }

    @Test
    public void checkTestGit(){

    }
}
