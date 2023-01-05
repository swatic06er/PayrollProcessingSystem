# Payroll Processing System in Java

`PPC is a Payroll solution provider company who manages the payroll of the various companies from small scale to large scale company.`

`PPC accepts the employees data from the client in either plain text format (.txt) or csv (.csv) format to manage the employee life cycle starting from date of onboarding to date of exit.`

---
## Requirements

> Java 17 or above

---

## IDE 
>IntelliJ Idea || STS || Eclipse

---

## Install
- [x]  [Java 8](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- [x] [IntelliJ Idea](https://www.jetbrains.com/idea/download/#section=windows)
- [x] [STS ](https://spring.io/tools)
- [x] [Eclipse ](https://www.eclipse.org/downloads/)

---

## Framework

For this Payroll Processing System, we are using Collection framework of Java.

---

## Dependencies

In this project we have used following dependencies :-

- JUnit

---


## Directory Structure

```
.
├── src
│   ├── main
│   │   └── java
│   │       └── PayrollProcessing
│   │           ├── controller
│   │           ├── entity
│   │           ├── Exception
│   │           ├── PayrollProcessing
│   │           ├── Repo
│   │           ├── service
│   │           └── utility
│   └── test
│       └── java
│           └── PayrollProcessing
└── target
    ├── classes
    │   ├── META-INF
    │   │   └── maven
    │   │       └── Payroll-Processing-System
    │   │           └── Payroll-Processing-System
    │   └── PayrollProcessing
    │       ├── controller
    │       ├── entity
    │       ├── Exception
    │       ├── PayrollProcessing
    │       ├── Repo
    │       ├── service
    │       └── utility
    └── test-classes
        └── PayrollProcessing
```

---

## <details><summary>Field of records</summary>


| Field of Record        | Description|  
| ------------- |:-------------:| 
|SequenceNo     | Sequence number of records in file starting from 1 | 
| EmpID      | Unique Id of employee  |  
| EmpFName | First Name of employee      |    
|EmpLName | Last Name of employee|
|Designation| Post of employee|
|Event| Any one from below table|
| EventDate | Date when this event happened in DD-MM-YYYY format.|
|Notes|Date when this event happened in DD-MM-YYYY format.|
|Value| Value according to the event. Refer the following table. |

<b>Table for the value of the event</b>
| | |          
| ------------- |:-------------:| 
| ONBOARD     | Date of Joining in MM-DD-YYYY format | 
| SALARY      | Salary Amount in USD     |  
| BONUS  |Bonus Amount in USD|
|EXIT| Date of Leaving in MM-DD-YYYY format|
|REIMBURSEMENT| Reimbursement Amount in USD|

</details>

---

## Output of the solutions to the problems

1. Total number of employees in an organization.

2. Month wise following details

    a. Total number of employees joined the organization with employee details like emp id,
designation, name, surname.

    b. Total number of employees exit organization with employee details like name, surname.

3. Monthly salary report in following format

    a. Month, Total Salary, Total employees

4. Employee wise financial report in the following format

    a. Employee Id, Name, Surname, Total amount paid

5. Monthly amount released in following format

    a. Month, Total Amount (Salary + Bonus + REIMBURSEMENT), Total employees

6. Yearly financial report in the following format

    a. Event, Emp Id, Event Date, Event value
    
![ss1](https://user-images.githubusercontent.com/117448701/210780370-46284825-bc0b-41da-9df1-6ef2b896e694.png)
![ss2](https://user-images.githubusercontent.com/117448701/210780397-5e8d37d4-41c1-4d19-984a-4aa7fab97754.png)
