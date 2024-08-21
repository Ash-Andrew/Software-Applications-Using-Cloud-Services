<strong> **DO NOT DISTRIBUTE OR PUBLICLY POST SOLUTIONS TO THESE LABS. MAKE ALL FORKS OF THIS REPOSITORY WITH SOLUTION CODE PRIVATE. PLEASE REFER TO THE STUDENT CODE OF CONDUCT AND ETHICAL EXPECTATIONS FOR COLLEGE OF INFORMATION TECHNOLOGY STUDENTS FOR SPECIFICS. ** </strong>

# WESTERN GOVERNOR UNIVERSITY 
## D387 – ADVANCED JAVA
# Andrew Ashbaker
+ B1
+ Created resource bundle named welcome
+ add locales en_US and en_FR
+ B1 Update path and moved the resource bundle to the correct location
+ B2
+ +Modified: app.component.html added Lines 25-28
+ Created Message package to hold the classes for the translation and welcome message
+ Modified app.component.ts Lines 18-20, 36-37 added to initialize welcome messages and created HTTP Get Request
+ Created: DisplayMessage.java Class
+ Created: WelcomeController
+ Modified D387SampleCodeApplication Lines 18-28
+ Modified app.component.ts Lines 112-113 added priceCAD and priceEur variables
+ Modified app.component.ts Lines onSubmit Lines 57-64
+ B3:
+ Created: TimeZoneConversion
+ Created: TimeZoneConversionController
+ Modified: app.component.ts
+ Modified: app.component.html LINES 66-69
+ C1
+ Created: added DockerFile
+ C2
+ Build Docker Image docker build -t d387_010912370_pa .
+ Run Docker Container docker run -d -p 8080:8080 --name D387_010912370_PA d387_010912370_pa
+ Checked for Container Logs in terminal docker logs D387_010912370_PA
+ Added DockerImage_Evidence.png
+ C3
+ To deploy my multithreaded Spring web application to the cloud, I would choose Amazon Web Services (AWS) as my cloud provider. First, I would create a Docker image of my application and push it to Amazon Elastic Container Registry (ECR) for secure storage and management of Docker images. 
Next, I would use AWS Fargate, a serverless compute engine, to run the Docker container, which eliminates the need to provision and manage servers. I would configure AWS Fargate to deploy the container, ensuring it scales automatically based on demand. Additionally, I would set up an Application Load Balancer to distribute incoming traffic evenly across the running instances of the application. 
To secure the deployment, I would configure Security Groups to control inbound and outbound traffic, enhancing the network security. Finally, I would use Amazon CloudWatch to monitor the application's performance and Amazon CloudTrail for logging and auditing all API calls, ensuring comprehensive monitoring and maintenance of the deployed application.

Welcome to Advanced Java! This is an opportunity for students to write multithreaded object-oriented code using Java frameworks and determine how to deploy software applications using cloud services.

FOR SPECIFIC TASK INSTRUCTIONS AND REQUIREMENTS FOR THIS ASSESSMENT, PLEASE REFER TO THE COURSE PAGE.
## BASIC INSTRUCTIONS
For this assessment, you will modify a Spring application with a Java back end and an Angular front end to include multithreaded language translation, a message at different time zones, and currency exchange. Then, build a Docker image of the current multithreaded Spring application and containerize it using the supporting documents provided in this task.


## SUPPLEMENTAL RESOURCES 
1.	How to clone a project to IntelliJ using Git?

> Ensure that you have Git installed on your system and that IntelliJ is installed using [Toolbox](https://www.jetbrains.com/toolbox-app/). Make sure that you are using version 2022.3.2. Once this has been confirmed, click the clone button and use the 'IntelliJ IDEA (HTTPS)' button. This will open IntelliJ with a prompt to clone the proejct. Save it in a safe location for the directory and press clone. IntelliJ will prompt you for your credentials. Enter in your WGU Credentials and the project will be cloned onto your local machine.  

2. How to create a branch and start Development?

- GitLab method
> Press the '+' button located near your branch name. In the dropdown list, press the 'New branch' button. This will allow you to create a name for your branch. Once the branch has been named, you can select 'Create Branch' to push the branch to your repository.

- IntelliJ method
> In IntelliJ, Go to the 'Git' button on the top toolbar. Select the new branch option and create a name for the branch. Make sure checkout branch is selected and press create. You can now add a commit message and push the new branch to the local repo.

## SUPPORT
If you need additional support, please navigate to the course page and reach out to your course instructor.
## FUTURE USE
Take this opportunity to create or add to a simple resume portfolio to highlight and showcase your work for future use in career search, experience, and education!

