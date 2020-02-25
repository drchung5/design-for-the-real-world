package code.smells.hr;

public class Employee {

  public static String DEFAULT_DEPARTMENT_CODE = "DEV";
  public static int DEFAULT_EMPLOYEE_TYPE = 100;
  public static String DEFAULT_SITE = "HQ";

  private int employeeID;
  private String firstName;
  private String lastName;
  private String departmentCode;
  private int employeeType;
  private String site;

  public Employee(
      int employeeID,
      String firstName,
      String lastName) {
    this.employeeID = employeeID;
    this.firstName = firstName;
    this.lastName = lastName;
    this.departmentCode = DEFAULT_DEPARTMENT_CODE;
    this.employeeType = employeeType;
    this.site = DEFAULT_SITE;
  }

  public Employee(
      int employeeID,
      String firstName,
      String lastName,
      String departmentCode) {
    this.employeeID = employeeID;
    this.firstName = firstName;
    this.lastName = lastName;
    this.departmentCode = departmentCode;
    this.employeeType = DEFAULT_EMPLOYEE_TYPE;
    this.site = DEFAULT_SITE;
  }

  public Employee(
      int employeeID,
      String firstName,
      String lastName,
      int employeeType) {
    this.employeeID = employeeID;
    this.firstName = firstName;
    this.lastName = lastName;
    this.departmentCode = DEFAULT_DEPARTMENT_CODE;
    this.employeeType = employeeType;
    this.site = DEFAULT_SITE;
  }

  public Employee(
      int employeeID,
      String firstName,
      String lastName,
      int employeeType,
      String site) {
    this.employeeID = employeeID;
    this.firstName = firstName;
    this.lastName = lastName;
    this.departmentCode = DEFAULT_DEPARTMENT_CODE;
    this.employeeType = employeeType;
    this.site = site;
  }

  public Employee(
      int employeeID,
      String firstName,
      String lastName,
      String departmentCode,
      String site) {
    this.employeeID = employeeID;
    this.firstName = firstName;
    this.lastName = lastName;
    this.departmentCode = departmentCode;
    this.employeeType = DEFAULT_EMPLOYEE_TYPE ;
    this.site = site;
  }

  public Employee(
      int employeeID,
      String firstName,
      String lastName,
      String departmentCode,
      int employeeType,
      String site) {
    this.employeeID = employeeID;
    this.firstName = firstName;
    this.lastName = lastName;
    this.departmentCode = departmentCode;
    this.employeeType = employeeType;
    this.site = site;
  }

  public int getEmployeeID() {
    return employeeID;
  }

  public void setEmployeeID(int employeeID) {
    this.employeeID = employeeID;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getDepartmentCode() {
    return departmentCode;
  }

  public void setDepartmentCode(String departmentCode) {
    this.departmentCode = departmentCode;
  }

  public int getEmployeeType() {
    return employeeType;
  }

  public void setEmployeeType(int employeeType) {
    this.employeeType = employeeType;
  }

  public String getSite() {
    return site;
  }

  public void setSite(String site) {
    this.site = site;
  }
}
