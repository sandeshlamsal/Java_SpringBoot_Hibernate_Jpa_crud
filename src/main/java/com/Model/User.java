package com.Model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

@Entity //jpa
@Table(name="users") //jpa
public class User {
 
 @Id
 @GeneratedValue(strategy = GenerationType.AUTO) //jpa
 public int id;
 
 public String name;
 public String pass;
 
 public User(){}
 
public User(int id, String name, String pass){
	 this.id=id;
	 this.name=name;
	 this.pass=pass;
 }

 /**
 * @return the id
 */
public int getId() {
	return id;
}
/**
 * @param id the id to set
 */
public void setId(int id) {
	this.id = id;
}
/**
 * @return the name
 */

public String getName() {
	return name;
}
/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}
/**
 * @return the pass
 */
public String getPass() {
	return pass;
}
/**
 * @param pass the pass to set
 */
public void setPass(String pass) {
	this.pass = pass;
} 
}
