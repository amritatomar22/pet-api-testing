<div id="top"></div>
<div align="center">  
  <a href="https://github.com/amritatomar22/pet-api-testing/main/README.md">
    <img src="download.png" alt="Logo" width="200" height="80">
  </a>

  <h3 align="center">PET API TESTING</h3>  
</div>
<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    <li>
      <a href="#getting-started-local">Getting Started Local</a>
      <ul>
        <li><a href="#local-prerequisites">Local Prerequisites</a></li>
        <li><a href="#local-installation">Local Installation</a></li>
      </ul>
    </li>
    <li><a href="#local-usage">Local Usage</a></li>
     <li>
      <a href="#getting-started-jenkins">Getting Started Jenkins</a>
      <ul>
        <li><a href="#jenkins-prerequisites">Jenkins Prerequisites</a></li>
        <li><a href="#jenkins-installation">Jenkins Installation</a></li>
      </ul>
    </li>
    <li><a href="#jenkins-usage">Jenkins Usage</a></li>
  </ol>
</details>

<!-- ABOUT THE PROJECT -->
## About The Project

This project is created to test [/pet/findByStatus](https://petstore3.swagger.io/) endpoint. It is created using java, rest assured technologies. Additionally, it has support for CI pipeline in jenkins. This project is created in windows machine and can easily be modified to run in different OS.

### Built With

This section should list any major frameworks/libraries used to bootstrap your project. Leave any add-ons/plugins for the acknowledgements section. Here are a few examples.

* [Testng](https://testng.org/)
* [Java](https://www.java.com/)
* [Maven](https://maven.apache.org/)
* [Rest Assured](https://rest-assured.io/)
* [Jenkins](https://www.jenkins.io/)

<!-- Getting Started Local -->
## Getting Started Local
### Local Prerequisites
1. Java 1.8 or higher
2. Maven 3.8.1
3. Git 
4. Eclipse(Optional)

### Local Installation
1. Clone the repo
   ```sh
   git clone https://github.com/amritatomar22/pet-api-testing.git
   ```
2. Change directory to api-testing folder
   ```sh
   cd api-testing
   ```
3. Compile and run tests
   ```sh
   mvn clean compile
   mvn test
   ```
4. View report by opening ./target/surefire-reports/index.html

<p align="right">(<a href="#top">back to top</a>)</p>

<!-- USAGE EXAMPLES -->
## Local Usage

1. Local execution example:

 ![image](https://user-images.githubusercontent.com/100403357/155838998-261a0b02-67ea-4028-817a-e2d43f4c0b41.png)

2. Local Report example:
 
 ![image](https://user-images.githubusercontent.com/100403357/155838069-f01d304f-1b11-4a1a-8243-53ef19d50d0c.png)
 
 <p align="right">(<a href="#top">back to top</a>)</p>

<!--Getting Started Jenkins-->
## Getting Started Jenkins
### Jenkins Prerequisites
1. Jenkins
2. Jenkins Plugins(Publish html plugin, Github branch source plugin, Github plugin, Folders plugin)
3. Java 1.8 or higher
4. Maven 3.8.1

### Jenkins Installation
1. [Install jenkins](https://www.jenkins.io/doc/book/installing/windows/) with recommended plugins.
2. Create a new pipeline and configure as below:

   ![image](https://user-images.githubusercontent.com/100403357/155838365-a46d1353-83b6-453c-9f36-1fc9745d0d5e.png)
   
   
   ![image](https://user-images.githubusercontent.com/100403357/155838382-d3ebf8db-f932-433f-b526-2e4533e0f8ba.png)  
      
3. Build pipeline
  
  <p align="right">(<a href="#top">back to top</a>)</p>
  
<!-- USAGE EXAMPLES -->
## Jenkins Usage

1. Build example: 
 
  ![image](https://user-images.githubusercontent.com/100403357/155838495-04517c4e-ea5a-4dfd-ae16-4058293392c2.png)
  
2. Report example: 

 ![image](https://user-images.githubusercontent.com/100403357/155838545-dbd2b608-e044-4271-91a1-f8a863215fbb.png)
 
 <p align="right">(<a href="#top">back to top</a>)</p>



