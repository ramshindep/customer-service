package org.dnyanyog.enums;

public enum ErrorCode {
  CUSTOMER_ADD_SUCCESS("Success", "Customer added successfully!!"),
  CUSTOMER_EMAIL_FAIL("Fail", "Email is already exist! Please enter valid emailID"),
  CUSTOMER_FAIL("Fail", "Customer not found !!"),
  CUSTOMER_SEARCH_SUCCESS("Success", "Customer ddetails are as follows :");
  private final String status;
  private final String message;

  ErrorCode(String status, String message) {
    this.status = status;
    this.message = message;
  }

  public String getStatus() {
    return status;
  }

  public String getMessage() {
    return message;
  }
}
