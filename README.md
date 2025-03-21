# ChatPP Automation Testing Project

Overview

This project is designed to automate testing for the ChatPP application using Selenium WebDriver, TestNG, and the Page Object Model (POM). It ensures the functionality of user authentication, group creation, and logout features.

# Technologies Used

Selenium WebDriver – For browser automation

Java – Programming language for test scripts

TestNG – Framework for test execution

Maven – For dependency management and build execution

Page Object Model (POM) – For structured and maintainable test scripts

# Project Structure
~~~
kartiksharma200-chatpp-testing-project/
├── README.md
└── ChatPP Automation Project/
    ├── pom.xml                               # Maven configuration file
    ├── testng.xml                            # TestNG configuration file
    ├── src/
    │   ├── main/java/com/
    │   │   ├── PageObjects/                  # Page object classes
    │   │   │   ├── LoginPage.java
    │   │   │   ├── LogoutPage.java
    │   │   │   ├── createGroupPage.java
    │   │   │   └── signUpPage.java
    │   │   └── Utils/
    │   │       ├── DriverManager.java        # WebDriver management utility
    │   ├── test/java/com/Test/
    │   │   ├── createGroupTest.java          # Test cases
    │   │   ├── signInTest.java
    │   │   └── signUpTest.java
    ├── target/                                # Compiled code and reports
    ├── test-output/                           # Test reports and results
~~~
# Setup & Installation

Prerequisites

Ensure the following are installed before running the tests:

Java JDK 8+

Maven

TestNG Plugin (for IDEs like IntelliJ or Eclipse)

Google Chrome & ChromeDriver (matching versions)

Steps to Set Up the Project

Clone the Repository:
~~~
git clone https://github.com/kartiksharma200/chatpp-testing-project.git
~~~
Navigate to the Project Directory:
~~~
cd ChatPP Automation Project
~~~
Install Dependencies:
~~~
mvn clean install
~~~
Execute Tests Using TestNG:
~~~
mvn test
~~~
Running Test Cases

Run all tests using Maven:
~~~
mvn test
~~~
Run a specific test suite with TestNG:
~~~
mvn test -DsuiteXmlFile=testng.xml
~~~
Test Reports

Test results are stored in the test-output/ directory. Open index.html in a browser to view the reports.

Author

Kartik Sharma

License

This project is licensed under the MIT License.
