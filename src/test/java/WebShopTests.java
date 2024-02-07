import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class WebShopTests {
    private final By ACCEPT_COOKIES_BTN =  By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll");
    private final String SECTION = "Mēbeles";
    private final By MENU_ITEM = By.xpath(".//li[contains(@class, 'submenu-lvl1__list-item--has-child')]/a");
    private final By MENU = By.xpath(".//div[contains(@class, 'submenu-lvl1--index')]");

    @Test
    public void productPresenceInCartCheck() {
        WebDriver browser = new ChromeDriver();

        browser.get("https://www.1a.lv/");

        WebDriverWait wait = new WebDriverWait(browser, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(ACCEPT_COOKIES_BTN));

        // find element
        WebElement acceptBtn = browser.findElement(ACCEPT_COOKIES_BTN);

        // click on this element
        acceptBtn.click();

        //find all sections


        //find necessary section Instrumenti
        WebElement menuBlock = browser.findElement(MENU);
        List<WebElement> items = menuBlock.findElements(MENU_ITEM);

        boolean isSectionFound = false;
        for (WebElement we : items) {
            if (we.getText().equals(SECTION)) {
                wait.until(ExpectedConditions.elementToBeClickable(we));
                isSectionFound = true;
                we.click();
                break;
            }
        }
        Assertions.assertTrue(isSectionFound, "Section not found");
    }






    //click on it
    @Test
    public void workingWithLists() {
        List<String> names = new ArrayList<>();
        names.add("Dmitrij");
        names.add("David");
        names.add("Vika");
        names.add("Misa");

        // ------------ loop for
        //       from     to    step
        for (int i = 0; i < names.size(); i = i + 2) {
            System.out.println("The name number " + (i + 1) + " is:" + names.get(i));
        }

        // ------------ loop foreach
        for (String name : names) {
            System.out.println(name);
        }


//        System.out.println(names.isEmpty());
//        System.out.println(names.size());
//        System.out.println(names.get(2));
    }
}
