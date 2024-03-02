package data;

public enum CoursesData {
  TESTING("Тестирование");

  private String name;

  CoursesData(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

}