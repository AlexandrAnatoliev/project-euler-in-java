<div id="header" align="center">
    <h1>problem-5 "Smallest Multiple"</h1>
</div>

<div id="header" align="center">
    <h3>Problem statement</h3>
</div>

**2520**  is the smallest number that can be divided by each of the numbers from **1** to **10** without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from
**1** to **20**?

<div id="header" align="center">
    <h3>Solving algorithm</h3>
</div>


<div id="header" align="center">
    <h3>New skills</h3>
</div>


<div id="header" align="center">
    <h3>Installing, compiling and running the program</h3>
</div>

Use [instruction](../../doc-files/problem-2/compilation-in-java.md)

* Clone the repository to your local computer

```declarative
git clone https://github.com/AlexandrAnatoliev/project-euler-in-java
```

* To compile the program, you need to run the command from the main directory (problem-5/):

```declarative
javac -d bin ./src/solve5/*
```

* Now the compiled files appear in the bin/ folder. Run program by command:

```declarative
java -classpath ./bin solve5.Main 
```

* **Creating JAR-file**
* In the main repository (problem-5/), create a manifest file **manifest.mf**:

```declarative
main-class: solve5.Main
class-path: bin/
```

* Building a jar file:

```declarative
jar -cmf manifest.mf problem5.jar -C bin .
```

* Run a jar file:

```declarative
java -jar problem5.jar 
```
