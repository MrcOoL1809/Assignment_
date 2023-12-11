package Junit_Assignment.Junit;

import org.junit.Test;

public class Question_18 {
	@Test (groups = "first")
	public void shoppingUserRegistration() {
			System.out.println("User Registration");
		}
		
		@Test(groups = {"buy","first"})
		public void UserLogin() {
			System.out.println("User login");
		}
		
		
		@Test(groups = "first")
		public void UserPurchaseDirect() {
			System.out.println("purchase successful");
		}
		
		@Test(groups = "buy")
		public void AddToCart() {
			System.out.println("added to cart");
		}
		
		@Test
		public void AddtoWishlist() {
			System.out.println("Added to wishlist");
		}
		
		@Test
		public void sortProduct() {
			System.out.println("sorted product");
		}
		
		@Test(groups = "buy")
		public void FilterProduct() {
			System.out.println("product filtered");
		}
		
		
		@Test(groups = "first")
		public void payViaDebitCard() {
			System.out.println("debit card payment");
		}
		
		@Test
		public void payViaCreditCard() {
			System.out.println("credit card payment");
		}
		
		@Test(groups = "buy")
		public void payViaUPI() {
			System.out.println("UPI payment");
		}
}
//xml

//<?xml version="1.0" encoding="UTF-8"?>
//<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
//<suite name="Suite">
//  <test thread-count="5" name="Test">
//	  <groups>
//		  <run>
//			  <include name="first"/>
//			  <include name="buy"/>
//		  </run>
//	  </groups>
//    <classes>
//      <class name="assignment.Q18"/>
//    </classes>
//  </test> <!-- Test -->
//</suite> <!-- Suite -->


}
