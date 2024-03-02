import data.CoursesData;
import data.MainMenuData;
import pageObject.*;
import utils.BaseTest;
import org.junit.jupiter.api.*;


public class TestPW extends BaseTest {

  @Test
  public void test() {
    new MainPage(driver)
        .clickButtonLogin();

    new LoginPage(driver)
        .waitVisibleInputBox()
        .authorizationUser()
        .waitModalWindowInvisible();

    new MainPage(driver)
        .clickMainMenuCourses(MainMenuData.OBUCHENIE)
        .clickCoursesByName(CoursesData.TESTING);

    new TestingPage(driver)
        .cardsCounter();
  }

  @Test
  public void test2() {
    new MainPage(driver)
        .clickButtonLogin();

    new LoginPage(driver)
        .waitVisibleInputBox()
        .authorizationUser()
        .waitModalWindowInvisible();

    new TestingPage(driver)
        .open("/categories/testing/");
    new TestingPage(driver)
        .clickOnCard4();
    new TestCardPage(driver)
        .getTitleCard4()
        .getDescriptionCard4()
        .getDurationCard4()
        .getFormatCard4();
  }

  @Test
  public void test3() {
    new MainPage(driver)
        .clickMainMenuCourses(MainMenuData.OBUCHENIE)
        .clickOnCalendarButton();

    new CalendarEventsPage(driver)
        .getSumEventsElemets()
        .getEventDays();
  }

  @Test
  public void test4() {
    new MainPage(driver)
        .clickMainMenuCourses(MainMenuData.OBUCHENIE)
        .clickOnCalendarButton();

    new CalendarEventsPage(driver)
        .openEventsTypeSelector()
        .selectEventType()
        .checkEventType();
  }

}