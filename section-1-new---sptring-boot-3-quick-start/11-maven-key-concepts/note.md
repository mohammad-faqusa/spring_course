## POM File - pom.xml

## POM file structure

    project metda data :
        project name, version, output type : JAR , WAR...
    dependencies :
        Spring , Hibernate ...
    plug ins :
        additional customs tasks to run : generate JUnit test reports etc...

Simple POM File
section 1 : project name, version, etc . Output file type : JAR , WAR, ...
section 2 : dependencies :
section 3 : plugins ,

Project Coordinates :
uniqley identify a project
precise info to find your hourse (project)
elements :
group id
atfifact id
version
example of coordinates :
the coordinates of spring :
groupId : org.springframework
artifact : spring-context
version : 6.0.0

    for luv2code(self project)
            groupId ; com.luv2code
            artifact : mycoolapp
            version: 1.0RELEASE
        ...

Adding dependencies
in dep. section:`<dependency></dependency>`
to add dependency
group ID, artifact
verison is optional but recommended for DevOps
GAV : group id, Artivact ID, version

How to find dependecy coordinates ?
visit the project details
go to Meaven central repo (recommneded)
