package pageObject;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestCardPage extends BasePage{

  public TestCardPage(WebDriver driver) {
    super(driver);
  }

  @FindBy(xpath = "//*[contains(@class, 'sc-1og4wiw-0 sc-s2pydo-1 ifZfhS diGrSa')]")
  private WebElement titleCard;

  public TestCardPage getTitleCard4() {
    String titleCardActual = titleCard.getText();
    String titleCardExpected = "Java QA Engineer. Basic";
    Assertions.assertEquals(titleCardExpected, titleCardActual);
    logger.info("Название: " + titleCardExpected);
    return this;
  }
  public TestCardPage getDescriptionCard4() {
    String descriptionActual = driver.findElement(By.xpath("//*[contains(@class, 'sc-1og4wiw-0 sc-s2pydo-3 gaEufI dZDxRw')]")).getText();
    String descriptionExpected = "Всё, что нужно знать младшему инженеру-тестировщику\n" + " ";
    Assertions.assertEquals(descriptionExpected, descriptionActual);
    logger.info("Описание курса: " + descriptionExpected);
    return this;
  }

  public TestCardPage getDurationCard4() {
    String durationCard4Actual = driver.findElement(By.xpath("(//*[contains(@class,'sc-1og4wiw-0 sc-3cb1l3-0 jQNgtj dgWykw')])[3]")).getText();
    String durationCard4Expected = "4 месяца";
    Assertions.assertEquals(durationCard4Expected, durationCard4Actual);
    logger.info("Длительность: " + durationCard4Expected);
    return this;
  }
  public TestCardPage getFormatCard4() {
    String formatCard3Actual = driver.findElement(By.xpath("(//*[contains(@class,'sc-1og4wiw-0 sc-3cb1l3-0 jQNgtj dgWykw')])[4]")).getText();
    String formatCard3Expected = "Онлайн";
    Assertions.assertEquals(formatCard3Expected, formatCard3Actual);
    logger.info("Формат: " + formatCard3Expected);
    return this;
  }

}