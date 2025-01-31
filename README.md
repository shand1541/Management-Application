# **README**

## **Project Description - front end **

This project is a Java-based application designed for a stationary items sales system. The app includes user login functionality, review management, and order placement features. It utilizes Java Swing for its graphical user interface and ArrayLists to manage user and review data. The core features of the application include:

1. **User Authentication**: 
   - Allows users to log in and log out, displaying appropriate messages based on successful or unsuccessful login attempts.
   
2. **Review Management**: 
   - Users can add anonymous reviews about products/services, including a date, a comment, and a satisfaction rating.
   - Users can view all reviews left by others.

3. **Order Placement**: 
   - After logging in, users can place orders for stationary items, which include a discount based on their user type (individual, corporate, or non-profit).

## **Features**

### **User Authentication**

- **Login**: Users can log in by entering their username and password. Upon successful login, a welcome message is displayed, and the "Review" menu is enabled.
- **Logout**: Users can log out, which resets the application to its initial state (with only the "User" menu enabled).
- **Quit**: Allows the user to exit the application.

### **Review Management**

- **Add Review**: 
  - Users can add a review for the products/services by specifying a review date, a comment, and a rating (1 to 4). Reviews are saved to an ArrayList.
  - The review date is displayed in the form of "dd/MM/yy", and a slider is used to select the rating.

- **View Reviews**: 
  - Users can view all previously submitted reviews in a text area within a JDialog. Each review includes the review date (converted to a string), the comment, and the rating.

### **Order Placement**

- **Place Order**: 
  - After logging in, users can place orders for items such as Coffee Mugs, Notebooks, Pens, Water Bottles, Keychains, Tote Bags, Desk Lamps, and Calendars. Users input the quantity and the item is added to the order list.
  - The application calculates the total value for each item (before applying the discount), and the final price is shown after applying a user-specific discount based on their type:
    - **Individual**: No discount
    - **Corporate**: 5% discount
    - **Non-profit organization**: 8% discount

## **Application Layout**

- **Menus**: 
  - The menu bar includes options for User actions (Login, Log out, Quit), Review management (Add Review, View Review), and Order placement (Place Order).
  - Before logging in, only the "User" menu is enabled. After logging in, all menus become accessible.

