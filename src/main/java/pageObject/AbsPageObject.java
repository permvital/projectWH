package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class AbsPageObject {
  protected WebDriver driver;
  protected Actions actions;
  protected WebDriverWait wait;

  public AbsPageObject(WebDriver driver){

    this.driver = driver;
    this.actions = new Actions(driver);
    this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    PageFactory.initElements(driver, this);
  }
}