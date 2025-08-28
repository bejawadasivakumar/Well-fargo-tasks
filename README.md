<b>Task 1:</b></br>
First, take a look at the following requirements for the new system. Your project manager passed them along with the data model ticket:

---> The system will help manage multiple financial advisors’ clients.</br>
---> Financial advisors must be able to create, update, and remove clients.</br>
---> Each financial advisor can have numerous clients.</br>
---> Financial advisors will be using the system during standard business hours from 9 to 5 on weekdays.</br>
---> Each client will have a portfolio.</br>
---> Client portfolios may contain zero or more securities.</br>
---> Financial advisors must be able to create, update, and remove securities from client portfolios.</br>
---> Every security has a name, a category, a purchase date, a purchase price, and a quantity.</br>
---> The system must have 99% uptime.</br>
---> The system must expose a React dashboard.</br>
---> The system’s backend must use the Spring framework for Java.</br>
---> The system must store data in a relational database.</br>
---> The system must be highly scalable.</br>
<img width="3768" height="1061" alt="image" src="https://github.com/user-attachments/assets/03badaf4-6a4b-4132-af6b-12c4065be12d" />


<b> Task 2: </b></br>
Your task is to implement the data model you created in the previous task within the provided Spring application. Follow these steps carefully:

1. Fork and clone the starter repo, which can be found here. If you are unfamiliar with Git, read through the first two chapters of the Git book, found here. Git is one of a developer’s most frequently used technologies, so it’s worth taking some time to get acquainted with it.<br>
2. Download and install IntelliJ if you haven’t already. IntelliJ is one of the best Java IDEs on the market and can be found here.
3. Open up the project in IntelliJ, then take some time to explore the codebase. Get a feel for what each class is doing. It’s okay if you don’t understand how part of the code works; there are lots of gotchas in Spring development. The goal is to become familiar with the overall flow of the program.<br>
4. Time to get to work! Create a class for each entity in your data model (these should be placed in the entities directory). Respect the following when implementing your data model:<br>
       a) Each entity must be annotated with the @Entity type, which can be found in the javax.persistence package.<br>
       b) Each id must be auto-generated.<br>
       c) Each instance variable must contain either a column or a relationship annotation.<br>
       d) Each class must contain a constructor which initializes all instance variables.<br>
       e) Each class must expose a getter and setter for each instance variable (no setter for the id field is required).<br>
       f) Lean on the existing entities (one has been provided for you) for hints on how to accomplish the above.<br>
5. When you are finished implementing your data model, commit and push your changes to GitHub. Then, submit a link to your project repo in the next step. Good luck!<br>
