package com.tts.UsersAPI.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
//@Entity
public class Users {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private String id;
  private String firstName;
  private String lastName;
  private String state;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
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

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  @Override
  public String toString() {
    return "Users{" +
            "id='" + id + '\'' +
            ", firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            ", state='" + state + '\'' +
            '}';
  }
}
