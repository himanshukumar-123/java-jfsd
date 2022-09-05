# Implement Spring Security with Authentication .

## DESCRIPTION

## Directions for Building Project:
1.	Build table and put this command into workbench: insert into springsecurityuser (id, active, password, roles, user_name) values (1, 1, "password", "ROLE_USER", "user");
2.	Unzip project or import project from Github link into Eclipse Enterprise IDE 
3.	Right click folder and select run as > maven install to install necessary jar libraries 
4.	Edit application.property file to connect to local MySQL database
5.	Open the SpringSecurityMwApplication.java file and run the file


## Project objective: 

As a developer, build Authentication Provider in Spring Security.


Background of the problem statement: 

You have been assigned a task by the team to add more flexibility rather than using the standard scenario in building Spring Security.

Following requirements should be met: 

   * You should have a spring MVC web application as part of your submission. (JSP or Thymeleaf are both acceptable front-ends)
   * User Password style in-memory storage is acceptable but variations on this (such as storing to database) are also acceptable.
   * Users should be redirected to a login.html page if not authenticated before being redirected to the original page once authenticated.
   * A few of the source code should be tracked on GitHub repositories. You need to document the tracked  files which are ignored during the final push to the GitHub repository.
   * The submission of your GitHub repository link  is mandatory. In order to track your task, you need to share the link of the repository in the document. 
   * The step-by-step process involved in completing this task should be documented.


### Hints

You can find a discussion on implementing Spring Security in the [Spring Online Documentation.](https://spring.io/guides/gs/securing-web/)

Here is another example that uses JSPs rather than Thymleaf: [JSP Example](https://www.baeldung.com/spring-security-login).
 

### Due Date

2021-03-25

