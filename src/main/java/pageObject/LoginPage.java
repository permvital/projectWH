package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {
  public LoginPage(WebDriver driver) {
    super(driver);
  }

  private final static String LOGIN = System.getProperty("login");
  private final static String PASSWORD = System.getProperty("password");


  @FindBy(xpath = "//*[@id=\"__PORTAL__\"]/div/div/div[3]/div[2]/div/div[2]/div[1]/div/div[1]/div/div[1]/div")
  private WebElement loginTextBox;

    @FindBy(xpath = "//div/input[@name='email']")
  private WebElement loginTextBox2;

  @FindBy(xpath = "//*[@id=\"__PORTAL__\"]/div/div/div[3]/div[2]/div/div[2]/div[1]/div/div[1]/div/div[2]/div")
  private WebElement passwordTextBox;

  @FindBy(xpath = "//input[@type='password']")
  private WebElement passwordTextBox2;

  @FindBy(xpath = "//button/div[text()='Войти']")
  private WebElement loginButton;

  private String inputTextBox = "//*[@id=\"__PORTAL__\"]/div/div/div[3]/div[2]/div/div[2]/div[1]/div/div[1]/div/div[1]/div";

  private String loginModalWindow = "//div[contains(@class, 'modal-container')][1]";


  public LoginPage waitVisibleInputBox() {
    wait.until(ExpectedConditions
            .visibilityOfElementLocated(By.xpath(inputTextBox)))
        .isDisplayed();

    return this;
  }

  public LoginPage waitModalWindowInvisible() {
    wait.until(ExpectedConditions
        .invisibilityOfElementLocated(By.xpath(loginModalWindow)));

    return this;
  }

  public LoginPage authorizationUser() {
    loginTextBox.click();
    loginTextBox2.sendKeys(LOGIN);
    passwordTextBox.click();
    passwordTextBox2.sendKeys(PASSWORD);
    loginButton.click();

    return this;
  }
}