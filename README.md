# Selenium Assignment Automation Project

## Overview

This project is designed to demonstrate web automation using **Selenium WebDriver**, **Java**, **TestNG**, and **Maven**.  
It covers hands-on assignments such as form handling, popups, dropdowns, tables, drag-and-drop with screenshots, and data-driven login testing.

---

```

## Project Structure

selenium-assignment/
├── pom.xml
├── README.md
├── src/
│ ├── main/
│ └── test/
│ ├── java/
│ │ └── com/
│ │ └── selenium/
│ │ ├── module1/
│ │ │ └── Assignment1.java
│ │ ├── module2/
│ │ │ ├── Assignment1.java
│ │ │ ├── Assignment2.java
│ │ │ └── Assignment3.java
│ │ ├── module3/
│ │ │ └── Assignment1.java
│ │ └── module4/
│ │ └── Assignment1.java
│ └── resources/
│ └── test-data/
│ ├── credentialsForAssignment.xlsx
│ └── screenshots/



## Dependencies

Key dependencies in `pom.xml`:

- **Selenium Java** – 4.35.0  
- **TestNG** – 7.11.0  
- **Apache POI** – for reading/writing Excel files  
- **Maven Surefire Plugin** – for running TestNG tests  

All dependencies are defined in the `pom.xml` to ensure easy build and execution with Maven.

---

## Assignments Included

- **module1/Assignment1.java**  
  Verifies page title, handles radio buttons/checkboxes, and dropdown selection.

- **module2/Assignment1.java**  
  Extracts company names from a web table.

- **module2/Assignment2.java**  
  Demonstrates handling and validating browser alerts.

- **module2/Assignment3.java**  
  Performs drag-and-drop action and saves a screenshot.

- **module3/Assignment1.java**  
  Data-driven login tests using TestNG `@DataProvider` and ChromeOptions for incognito/feature disabling.

- **module4/Assignment1.java**  
  Reads login credentials from Excel, iterates logins, and validates via UI and alert handling.

---

## How To Run

1. **Prerequisites:**  
   - Install JDK 17 or newer  
   - Install Chrome browser  
   - Install Maven 3.x  

2. **Clone the repository:**  
   ```bash
   git clone <your-repository-url>
   cd selenium-assignment

## Run all TestNG tests:

mvn test

## Or run individual Test classes from your IDE

## Test Data

Excel file: credentialsForAssignment.xlsx located in src/test/resources/test-data/

Screenshots from drag-and-drop tests saved in the screenshots/ subfolder

## Notes

Test results and logs are output to the console and TestNG report files in target/.

## Author

Raghavendra
