## Hudl
**Please go through the below to understand the framework and how to setup and run the test.**

```Framework SetUp```

```* Selenium webDriver
* Java - programming language
* Chrome webdriver browser
* POM
* Cucumber
* Java 11
* Maven - build management tool
* IDE - IntelliJ IDEA```

**To Run Test**

``` Download, install and setup Java JDK (Java 11) on your PC.
2. Install IntelliJ IDEA on you PC, go to File - Project Structure - Project, then point it to the Java JDK-11, click apply & ok button.
3. On your drive, create a folder and give it a name i.e 'Hudl' 
4. Go to Terminal, change directory into the folder created.
5. use git command "git clone (https://github.com/alder1/Hudl.git)" to Clone the test framework into the created folder on your PC.
6. Launch IntelliJ, go to File - select Open and point to the cloned test framework, then select the pom.xml file (MAC)- This will load up the project.
7. Go to File on IntelliJ, Project Structure, select Project - (Project SDK) and point to your java jdk 11 location. Apply and click on OK.
8. On IntelliJ, go to '[src\test\java\runner\TestRunner.java]' right click on it and select "Run 'TestRunner' - this will start to execute the test.
6. You may also wish to run the test from Terminal with 'mvn test' command - provided you have maven installed and correctly setup on your pc within the environment variables.```
