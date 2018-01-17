#Automation Framework

README

________________________________________________________________________________________________________________________________________________

    About the Framework:

    Developed by ANIKET WADKAR with the below technologies.

    Technology Used:
    Scripting Language      : Java
    Build and Deploy        : Maven
    WebDriver               : Selenium
    Unit Test Framework     : Junit
    Assertion Library       : TestNG and Hamcress
    Testing Tool            : Cucumber JVM
    Logging                 : Log4J
    Reporting               : Extent Report, Cucumber Maven Report dashboard
    Design Pattern          : Page Object Design Pattern using Page Factory
    Repository type         : Git (local git + remote VSTS git)

________________________________________________________________________________________________________________________________________________


    Running the Framework:

    This framework can be run in a few different ways.

    To run a single Scenario from a Feature File: right-click on the Scenario tag and click run.

    To run a single Featue file right-click on the Feature file tag and click run.

    To run more than on Scenario or Feature Files, create a custome tag i.e @regression and place this tag above the Feature tag or Scenario tag.
    Go to class RunWith.java and in the Cucumbe Options where tags are quoted, place this tag and run the RunWith.java

    Framework can aslo be run via a command line with the verify command. Paramterens can be processed to set properties.

    Various Shell Script Files can be created and be used to run quick test.

________________________________________________________________________________________________________________________________________________

    Reports in Framework:

    Cucucmber HTMl reports are geenrated when RunWith is Run.

    Maven cucumber reports are generated when project is run as a Maven Build from command line.

    Extent reports are generated when RunWith is run.

    When single Featue File or Scenario is run reports can be generated from the console after run complete.
________________________________________________________________________________________________________________________________________________


    Archetecture: MavenArchetype@QuickStart

    Requirements:

    Intellij Idea Community Edition Installed
    Java Cucumebr Plugin in Intellij Idea
    Gherkin Plugin in INtellij Idea
    Java Devlopement Kit (JDK) installed.
    Java Home Path Set in environment varibales
    Apache Maven path set in environment varibales.
    WebDriver executables required as per OS, placed in src/test/drivers.

________________________________________________________________________________________________________________________________________________


    Setup and Configuration for Windows

    FrameworkPropertyConfigurator.java contains paths to varios .properties files. For windows these paths need to be set in correct windows syntax.

________________________________________________________________________________________________________________________________________________

    Project Related Information:

    Name: Academy Account Return 2018-19
    Locator of choice: XPath (simple,position,dynamic and templated/paramterised)
    Page.java is the generic Library Class of Functionality
    CommomMethods.java is the Library of common functionality used within the application itself.

    BaseTest.java holds commom methods and objects to be used in the test level.
    All Step Definition classes to extend to BaseTest.java

    Resources hold all the Feature Files for the project.

________________________________________________________________________________________________________________________________________________
