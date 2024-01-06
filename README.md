# Selenium-Framework

 Hybrid Framework using Page Object Model (POM)

## Overview

This repository contains a Hybrid Framework developed using the Page Object Model (POM) design pattern. The purpose of this framework is to enable efficient and organized test automation for web applications.

 ## Key Features

 Description of the class files created in the Page object Model (POM) Selenium framework:

1) Helper.Java: This class provides utility methods or functions that assist in common tasks across the framework, ensuring code reusability.
 
2) Browser.java: Manages browser properties and settings. It's responsible for initiating browsers like Chrome, Firefox, etc., based on the requirements.

3) ExcelData.java: Handles reading from Excel files. It's primarily utilized for fetching test data, acting as a data provider for the scripts 17

4) ConfigDataProvider.java: Aims at locating and accessing the config.properties file. This file serves as a data provider, supplying information like browser type and base URL for the 

5) Testcase.java: This is where the actual test scripts are written and executed. It leverages other class functionalities to perform end-to-end tests.

6) BaseClass.java: Acts as a foundation for all other classes. It might contain setup and teardown methods, common functionalities, or other base attributes
ential for the framework's operation.

7) SearchPages.class: Designed according to the POM principles, it encapsulates all the locators and actions associated with a webpage. This ensures better intainability and readability of the test scripts.
segmenting functionalities into separate class files, the framework enhances maintainability, reduces redundancy, and ensures a structured approach to automated sting.

# Page Object Model (POM)

Selenium framework utilizes the Page Object Model, a design pattern that aids in enhancing test maintenance and reducing code duplication. Each web page is represented as class, and interactions with that page are encapsulated within that class.

## Extent Reports

To offer a clear and insightful reporting mechanism, the framework integrates with Extent Reports. After each test execution, an interactive and detailed report is enerated, showcasing the success and failure of tests, along with relevant logs and screenshots.
