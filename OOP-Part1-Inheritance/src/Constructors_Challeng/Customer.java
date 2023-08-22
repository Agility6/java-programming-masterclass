package Constructors_Challeng;

public class Customer {
  private String name;
  private String limit;
  private String email;

  public Customer() {
  }

  public Customer(String name, String limit, String email) {
    this.name = name;
    this.limit = limit;
    this.email = email;
  }

  public Customer(String name, String email) {
    this.name = name;
    this.email = email;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLimit() {
    return limit;
  }

  public void setLimit(String limit) {
    this.limit = limit;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}
