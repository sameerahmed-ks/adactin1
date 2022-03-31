Feature: Hotel_Room Booking Adactin Application
Scenario: Login Functionality
Given user Launch The Adactin Application
When user Enters The User Name In The InputField
And user Enters The Password In The InputField
Then user Clicks The Login Button And It Navigates To The SearchHotelPage


Scenario: Search Hotel Functionality
Given user Selects The Location In The DropDown
When user Selects The Hotel In The DropDown
And user Selects The RoomType In The DropDown
And user Selects The Number Of Rooms In The DropDown
And user Enters The CheckIn Date In InputField
And user Enters The CheckOut Date In InputField
And user Selects The Number Of Adults In The DropDown
And user Selects The Number Of Children In The DropDown
Then user Clicks The Search Button And It Navigates To The SelectHotelPage


Scenario: Select Hotel Functionality
Given user Is On Select Hotel Functionality Page
When user Clicks The RadioButton Of The Desired Hotel
Then user Clicks The Continue Button And It Navigates To The BookHotelPage


Scenario: Book Hotel Functionality
Given user Is On Book Hotel Functionality Page
When user Provides The First Name In The InputField
And user Provides The Second Name In The InputField
And user Enters The Billing Address In The InputTextField
And user Enters The CreditCard Number In The InputField
And user Selects The CreditCard Type In The DropDown
And user Selects The Expiry Month In The Dropdown
And user Selects The Expiry Year In The DropDown
And user Provides The CVV Number In The InputField
Then user Clicks The Book Now Button And It Navigates To Booking Confirmation 


Scenario: Booking Confirmation Functionality
Given user Is On Booking Confirmation Functionality Page
Then user Clicks My Iterniery Button And It Navigates To BookedItineraryPage

Scenario: Logout Functionality
Given user Is On BookedItinerary Page
Then user Clicks The Logout Button And It Navigates To Logout Page