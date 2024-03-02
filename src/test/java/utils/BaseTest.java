package utils;

import driverFactory.WebDriverFactory;
import exceptions.BrowserNotSupportedExeception;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import pageObject.*;

import java.util.ArrayList;
import java.util.List;


public abstract class BaseTest {
  protected WebDriver driver;

  @BeforeEach
  public void initDriverOptions() throws BrowserNotSupportedExeception {
    List<String> options = new ArrayList<>();
    driver = new WebDriverFactory().create(WebDriverFactory.setDriverType(), options);
    new MainPage(driver).open("/");
  }

  @AfterEach
  public void close() {
    if (driver != null) {
      driver.close();
      driver.quit();
    }

  }
}