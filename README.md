# Containerisation And Orchestration

**Install Java:**

You can download the latest Java JDK (Java Development Kit) from the Oracle or OpenJDK website.

**Install Java Development Tools (Optional):**

If you plan to develop Java applications, you may want to install an Integrated Development Environment (IDE) like Spring STS.

**Set up Environment Variables:**

**JAVA_HOME:**
Right-click on "This PC" or "My Computer" and select "Properties."
Click on "Advanced system settings" on the left side.
Click the "Environment Variables" button.
In the "System Variables" section, click "New" to add a new variable.
Set the variable name to JAVA_HOME.
Set the variable value to the path where you installed Java (e.g., C:\Program Files\Java\jdk1.8.0_291).
Click "OK."

**PATH:**
In the "System Variables" section, find the "Path" variable, select it, and click "Edit."
Add %JAVA_HOME%\bin to the list of paths. This allows you to run Java executables from the command line without specifying the full path.

**Verify Configuration:**
Open a Command Prompt.
Run the following commands to verify that Java is correctly configured:
java -version
javac -version


**Download and Install Maven:**
Visit the official Apache Maven website (https://maven.apache.org/download.cgi) to download the latest version of Maven.
Ensure that you have Java installed on your system, as Maven relies on it.
Verify Installation: java --version

**Open a terminal or command prompt.**
Type **mvn -version** and press Enter. This command should display the installed Maven version and other details.

**Configure Environment Variables**
You can set system environment variables to make Maven easily accessible from the command line.
On Windows, add the Maven bin directory to the PATH environment variable.

**Execute commands**

./mvnw clean

./mvnw install
