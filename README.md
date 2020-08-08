# CS311 Term Project Configuration Document

<img src="./ActivitySchedulingTool/WebContent/icon.png" align="right">

# Project ID: CS311S20PID34
 
# Project Title: Activity Scheduling  
</br>

| Sr No.        | Software               | Version  | Reason |
| ------------- |:-------------:         | -----:   | ------:|
| 1             | Operating System(windows)|  10  |  Because we as a student are using windows.|
| 2             | Java SE Development Kit|  14.0.2  | It is a package used  for JAVA. It allows user to run JAVA project on JRE. |
| 3             | Eclipse IDE for Java EE development|  4.16 | It is used to run the java project. |
| 4             | Apache Tomcat|   v9.0 | It is used to execute web pages that include java server page coding.|
| 5             | mysql-connector-java|   v8.0.21 | It is used to Connect MySql Database to java.|
| 6             | Xampp|   v7.4.80 | It is used to Connect MySql Database to java.|
| 7             | Node js|   v12.18.3 | Node. js tools are available via Eclipse IDE for Java EE Developers / Eclipse IDE for JavaScript and Web Developers.|
| 8             | Java|   v7.4.80 | It is used to Connect MySql Database to java.|


# Project Configuration Guidelines(Step by Step):
>Install JAVA </br>
      1. Visit this https://www.oracle.com/java/technologies/javase-downloads.html </br>
      2. Download File according to your operating system.</br>
      3. Now run the downloaded exe file
      4. Click next and Don't choose destination folder let the exe file choose it.</br>
      5. Now it is installing </br>
      6. After installation click close.</br>
      7. On command prompt type this java -version to ensure that it is installed. Or you can check in C:\Program Files\Java whether a java folder is created or not.</br>
      8. Now open Control Panel>System and Security>System>Advanced System Settings>Environment Variables.</br>
      9. Add a new User variable and system variable of name JAVA_HOME and set the value to the path of your jdk file in Java folder.</br>
      10. Do the same step user variable and add one more variable of the name JRE_HOME and put the path of jre file in the value box from java folder. </br>

>Install Eclipse IDE </br>
        1. Visit this link https://www.eclipse.org/downloads/packages/release/indigo/sr2/eclipse-ide-java-ee-developers </br>
        2. Download according to your operating system.</br>
        3. Now extract the downloaded folder.</br>
        4. Now run the eclipse.exe.</br>
        5. After running it select eclipse IDE for enterprise java developers. and install it. 
        5. Open Eclipse.</br>
        6. In nav bar select window>preference> search Web Browser> </br>
        7. In Web Browser click new and then add name chrome and give it the location of your chrome.exe file. (it is because we have designed our project for chrome web browser on other browsers its interface will be not adjustable.)</br>
        8. In nav bar select Window>Web browser then from the menu select chrome.
    
>Install Xampp </br>
        1. Go to this link https://www.apachefriends.org/download.html and install it.
        2. Run it as administrator. </br>
        3. And start apache and mysql.    

>Install Tomcat </br>
        1. Go to this link https://tomcat.apache.org/download-90.cgi</br>
        2. In core section click the windows installer.    

>Install Node Js </br>
        1. Go to this link https://nodejs.org/en/download/</br>
        2. And simply install it by hitting next button.</br>


>Import Github Repo </br>
        1. After Installing Xamp navigate into this directory C:\xampp\htdocs and create a new folder name project and clone git repository in this folder. </br>
        2. Launch a workspace in eclipse.</br>
        3. You will see a search bar on upper right corner
        in it search git Repositories(Git)</br>
        4. If you will see a our repository in bottom section then justthen select it clone existing repository link in the bottom section.</br>
        4. Click it and type the path of C:\xampp\htdocs\project\CS311S20PID34.</br>
        5. Select the check box and click finish.</br>
        6. Right click on the repository shown in bottom pane and import project.
        Do not change any field value and import the project.</br>
        7. From ActivitySchedulingTool[CS311S20PID34]>WebContent and open index.jsp file</br>
        8. Right click in opened index.jsp file in text editor section</br>
        9. Choose run as > run on server.</br>
        10. Choose Apache>Tomcat v9.0 and then add the link in browse field like this C:\Program Files\Apache Software Foundation\Tomcat 9.0 (Depending on your device)</br>
        


## Author
* **Eisha Nawaz** - *Initial Work* - [Eisha Butt](https://github.com/EishaButt)
* **Manahil Ameer** - *Initial Work* - [Manahil Ameer](https://github.com/ManahilAmeer)
* **Khansa Khaliq** - *Initial Work* - [Khansa Khaliq](https://github.com/Khansa-Khaliq)

See also the list of [contributors] who contributed in this project.
