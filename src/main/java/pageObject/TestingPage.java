package pageObject;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class TestingPage extends BasePage {



  public TestingPage(WebDriver driver) {
    super(driver);
  }

  @FindBy(xpath = "//*[text()='Java QA Engineer. Basic']")
  private WebElement card4;


  public void cardsCounter() {
    String xpathCount = String.valueOf(driver.findElements(By.xpath("//*[contains(@class, 'sc-18q05a6-0 incGfX')]//*[contains(@class, 'sc-1i9m15u-0 gYZQJf')]")).size());
    Assertions.assertEquals("10", xpathCount);
    logger.info("Количество карточек на вебстранице равно: " + xpathCount);
  }

  public TestingPage clickOnCard4() {
    card4.click();
    logger.info("Карточка №4 открыта");
    return this;
  }
}