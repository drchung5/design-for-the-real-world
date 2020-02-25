package code.smells.hr;

public class TeamMember {

  Employee employee;

  public TeamMember(Employee employee) {
    this.employee = employee;
  }

  public int getEmployeeID() {
    return employee.getEmployeeID();
  }

  public String getFirstName() {
    return employee.getLastName();
  }

  public String getLastName() {
    return employee.getLastName();
  }

  public String getDepartmentCode() {
    return employee.getDepartmentCode();
  }

  public int getEmployeeType() {
    return employee.getEmployeeType();
  }

  public String getSite() {
    return employee.getSite();
  }

}
