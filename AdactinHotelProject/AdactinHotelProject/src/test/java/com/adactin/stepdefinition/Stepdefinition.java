package com.adactin.stepdefinition;

import java.io.FileReader;

import org.openqa.selenium.WebDriver;

import com.PageObjectManager.com.PageObjectManager;
import com.adactin.runner.AdactinRunner;
import com.base.com.Base_Class;
import com.reader.com.FileReaderManager;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefinition extends Base_Class {
	
	public static WebDriver driver=AdactinRunner.driver;
	
	PageObjectManager pom = new PageObjectManager(driver);
	
	

@Given("^user Launch The Adactin Application$")
public void user_Launch_The_Adactin_Application() throws Throwable {
  launchURL("https://adactinhotelapp.com/");
    
}

@When("^user Enters The User Name In The InputField$")
public void user_Enters_The_User_Name_In_The_InputField() throws Throwable {
	sendValues(pom.getInstanceLogin().getUser(),"mdinesh93");
  
}
@When("^user Enters The Password In The InputField$")
public void user_Enters_The_Password_In_The_InputField() throws Throwable {
   sendValues(pom.getInstanceLogin().getPassword(), "1NJ8QS");
}

@Then("^user Clicks The Login Button And It Navigates To The SearchHotelPage$")
public void user_Clicks_The_Login_Button_And_It_Navigates_To_The_SearchHotelPage() throws Throwable {
    clickOnElement(pom.getInstanceLogin().getLogin());
}

@Given("^user Selects The Location In The DropDown$")
public void user_Selects_The_Location_In_The_DropDown() throws Throwable {
	 selectByVisibleTest(pom.getInstanceSearchPage().getLocation(), "Sydney");
    }

@When("^user Selects The Hotel In The DropDown$")
public void user_Selects_The_Hotel_In_The_DropDown() throws Throwable {
    selectByVisibleTest(pom.getInstanceSearchPage().getHotels(),"Hotel Sunshine");
}

@When("^user Selects The RoomType In The DropDown$")
public void user_Selects_The_RoomType_In_The_DropDown() throws Throwable {
    selectByVisibleTest(pom.getInstanceSearchPage().getRoomtype(),"Double");
}
@When("^user Selects The Number Of Rooms In The DropDown$")
public void user_Selects_The_Number_Of_Rooms_In_The_DropDown() throws Throwable {
	 selectByIndex(pom.getInstanceSearchPage().getRoomnums(),2);
	}


@When("^user Enters The CheckIn Date In InputField$")
public void user_Enters_The_CheckIn_Date_In_InputField() throws Throwable {
	 sendValues(pom.getInstanceSearchPage().getCheckInDate(),"28/03/2022");
}

@When("^user Enters The CheckOut Date In InputField$")
public void user_Enters_The_CheckOut_Date_In_InputField() throws Throwable {
	 sendValues(pom.getInstanceSearchPage().getCheckInDate(),"29/03/2022");

}

@When("^user Selects The Number Of Adults In The DropDown$")
public void user_Selects_The_Number_Of_Adults_In_The_DropDown() throws Throwable {
	 selectByIndex(pom.getInstanceSearchPage().getAdultroom(),2);
    }

@When("^user Selects The Number Of Children In The DropDown$")
public void user_Selects_The_Number_Of_Children_In_The_DropDown() throws Throwable {
	 selectByIndex(pom.getInstanceSearchPage().getChildroom(),2);
   
}

@Then("^user Clicks The Search Button And It Navigates To The SelectHotelPage$")
public void user_Clicks_The_Search_Button_And_It_Navigates_To_The_SelectHotelPage() throws Throwable {
	clickOnElement(pom.getInstanceSearchPage().getSubmit());
    }

@Given("^user Is On Select Hotel Functionality Page$")
public void user_Is_On_Select_Hotel_Functionality_Page() throws Throwable {
    
}

@When("^user Clicks The RadioButton Of The Desired Hotel$")
public void user_Clicks_The_RadioButton_Of_The_Desired_Hotel() throws Throwable {
   clickOnElement(pom.getInstanceSelecthotel().getRadioBtn());
}

@Then("^user Clicks The Continue Button And It Navigates To The BookHotelPage$")
public void user_Clicks_The_Continue_Button_And_It_Navigates_To_The_BookHotelPage() throws Throwable {
	clickOnElement(pom.getInstanceSelecthotel().getContinueBtn());
    }

@Given("^user Is On Book Hotel Functionality Page$")
public void user_Is_On_Book_Hotel_Functionality_Page() throws Throwable {
  
}

@When("^user Provides The First Name In The InputField$")
public void user_Provides_The_First_Name_In_The_InputField() throws Throwable {
 sendValues(pom.getInstanceBookhotel().getFirstname(),"dinesh");  
}

@When("^user Provides The Second Name In The InputField$")
public void user_Provides_The_Second_Name_In_The_InputField() throws Throwable {
	sendValues(pom.getInstanceBookhotel().getLastname(),"mohan");  
}

@When("^user Enters The Billing Address In The InputTextField$")
public void user_Enters_The_Billing_Address_In_The_InputTextField() throws Throwable {
	sendValues(pom.getInstanceBookhotel().getAddress(), "thanjavur");
    }

@When("^user Enters The CreditCard Number In The InputField$")
public void user_Enters_The_CreditCard_Number_In_The_InputField() throws Throwable {
  sendValues(pom.getInstanceBookhotel().getCc_num(), "1234567890987654");
}

@When("^user Selects The CreditCard Type In The DropDown$")
public void user_Selects_The_CreditCard_Type_In_The_DropDown() throws Throwable {
    selectByVisibleTest(pom.getInstanceBookhotel().getCc_type(),"VISA");
}

@When("^user Selects The Expiry Month In The Dropdown$")
public void user_Selects_The_Expiry_Month_In_The_Dropdown() throws Throwable {
   selectByIndex(pom.getInstanceBookhotel().getCc_exp_month(),2);}

@When("^user Selects The Expiry Year In The DropDown$")
public void user_Selects_The_Expiry_Year_In_The_DropDown() throws Throwable {
	selectByIndex(pom.getInstanceBookhotel().getCc_exp_year(),2);
}

@When("^user Provides The CVV Number In The InputField$")
public void user_Provides_The_CVV_Number_In_The_InputField() throws Throwable {
  sendValues(pom.getInstanceBookhotel().getCvv(), "234");
}

@Then("^user Clicks The Book Now Button And It Navigates To Booking Confirmation$")
public void user_Clicks_The_Book_Now_Button_And_It_Navigates_To_Booking_Confirmation() throws Throwable {
   clickOnElement(pom.getInstanceBookhotel().getBooknow());}

@Given("^user Is On Booking Confirmation Functionality Page$")
public void user_Is_On_Booking_Confirmation_Functionality_Page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^user Clicks My Iterniery Button And It Navigates To BookedItineraryPage$")
public void user_Clicks_My_Iterniery_Button_And_It_Navigates_To_BookedItineraryPage() throws Throwable {
  }

@Given("^user Is On BookedItinerary Page$")
public void user_Is_On_BookedItinerary_Page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^user Clicks The Logout Button And It Navigates To Logout Page$")
public void user_Clicks_The_Logout_Button_And_It_Navigates_To_Logout_Page() throws Throwable {
  clickOnElement(pom.getInstanceBookhotel().getlogout());
}


	

}
