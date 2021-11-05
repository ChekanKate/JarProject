### Compiling and running the program from the command line. Building the executable jar file.

#### In case the project does not use an external library, it will look like this:
 1) Compiling and running : 

> javac com\chekan\\*.java
> 
> java com.chekan.TestClass

2) Building the executable jar file :

> jar cfe JarProjectM.jar com.chekan.TestClass com\chekan\\*.class
> 
> java -jar JarProjectM.jar

#### If the project uses an external library, it will look like this:
1) Compiling and running :

> javac -cp C:\Users\user\IdeaProjects\commons-collections4-4.4.jar com\chekan\\*.java
>
> java -cp C:\Users\user\IdeaProjects\commons-collections4-4.4.jar;./ com.chekan.TestClass

2) Building the executable jar file :

We first create a text file named ManifestJ.txt with the following contents:

> Main-Class: com.chekan.TestClass
> Class-Path: commons-collections4-4.4.jar

We then create a JAR file named MyJar2.jar by entering the following command:

>jar cfm MyJar2.jar ManifestJ.txt com\chekan\\*.class

Run the JAR file:

>java -jar MyJar2.jar
