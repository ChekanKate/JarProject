###Compiling and running the program from the command line. Building the executable jar file.

####In case the project does not use an external library, it will look like this:
 1) Compiling and running : 

>javac com\chekan\*.java
> 
> java com.chekan.TestClass

2) Building the executable jar file :

>jar cfe JarProjectM.jar com.chekan.TestClass com\chekan\*.class
> 
> java -jar JarProjectM.jar

####If the project uses an external library, it will look like this:
1) Compiling and running :

>javac -cp C:\Users\user\IdeaProjects\commons-collections4-4.4.jar com\chekan\*.java
>
>java -cp C:\Users\user\IdeaProjects\commons-collections4-4.4.jar;./ com.chekan.TestClass

2) Building the executable jar file :

>jar cf JarProjectJ.jar com\chekan\*.class
>
>java -cp JarProjectJ.jar;C:\Users\user\IdeaProjects\commons-collections4-4.4.jar;./ com.chekan.TestClass