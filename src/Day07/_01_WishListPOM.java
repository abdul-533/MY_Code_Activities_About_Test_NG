package Day07;

import Day06._03_PlaceOrderElements;
import Utility.BaseDriver;
import Utility.Tools;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class _01_WishListPOM extends BaseDriver {

    @Test
    @Parameters("searchText")
    void addToWishList(String text) {

        _03_PlaceOrderElements poe = new _03_PlaceOrderElements();

        _02_WishListElements wle=new _02_WishListElements();
        poe.searchBox.sendKeys(text);
        poe.searchButton.click();

        int randomSecim = Tools.RandomGenerator(wle.searhResult.size());
        String wishItemText = wle.searhResult.get(randomSecim).getText();
        wle.wishBtnList.get(randomSecim).click();
        wle.btnWisthProducts.click();
        Tools.listContainsString(wle.wishTableNames, wishItemText);
    }
}
