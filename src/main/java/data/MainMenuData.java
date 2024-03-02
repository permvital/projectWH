package data;

public enum MainMenuData {
  OBUCHENIE("Обучение");

  private String name;

  MainMenuData(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }
}