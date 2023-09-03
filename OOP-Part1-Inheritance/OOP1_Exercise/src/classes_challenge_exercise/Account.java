package classes_challenge_exercise;

/**
 * ClassName: Account
 * Description:
 *
 * @Author Agility6
 * @Create 2023-08-21
 * @Version 1.0
 */
public class Account {
  /**
   * account number
   * account balance
   * customer name
   * email
   * phone number
   */
  private String number;
  private double balance;
  private String customerName;
  private String customerEmail;
  private String customerPhone;


  /**
   * Create two additional methods:
   * one for depositing funds into the account
   * one for withdrawing funds from the account
   *
   */
  public void depositFunds(double depositAmount) {
    this.balance += depositAmount;
    System.out.println("depositing... -->  " + this.balance + "$");
  }

  public void withdrawFunds(double depositAmount) {
    if (this.balance < depositAmount) {
      System.out.println("sorry Insufficient accountBalance");
    } else {
      this.balance -= depositAmount;
      System.out.println("withdrawing... -->  " + this.balance + "$");
    }
  }

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public String getCustomerEmail() {
    return customerEmail;
  }

  public void setCustomerEmail(String customerEmail) {
    this.customerEmail = customerEmail;
  }

  public String getCustomerPhone() {
    return customerPhone;
  }

  public void setCustomerPhone(String customerPhone) {
    this.customerPhone = customerPhone;
  }
}
