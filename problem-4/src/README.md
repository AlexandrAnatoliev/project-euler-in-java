<div id="header" align="center">
    <h1>problem-4 "Largest Palindrome Product"</h1>
</div>

<div id="header" align="center">
    <h3>Problem statement</h3>
</div>

A palindromic number reads the same both ways. 

The largest palindrome made from the product of **two 2-digit** numbers is **9009 = 91 * 99i**;

Find the largest palindrome made from the product of **two 3-digit** numbers.

<div id="header" align="center">
    <h3>Solving algorithm</h3>
</div>

The program algorithm is based on enumerating the factors and searching for the answer amount them.

Since the factors go from larger to smaller, when searching number the first answer found will stop the cycle **for()**. 
Because each subsequent factor will be less than previous one and the product **fact1 * fact2**, respectively, too. 
The search for **fact1** will stop when the product of the factors **fact1 * fact1** exceeds the already founded maximum **answer** for same reason.

<div id="header" align="center">
    <h3>New skills</h3>
</div>

* wrote docs in English 
* enum and package was used
* the user interface was separated into a class

<div id="header" align="center">
    <h3>Installing, compiling and running the program</h3>
</div>

Use [instruction](../../doc-files/problem-2/compilation-in-java.md)

* Clone the repository to your local computer
```declarative
git clone https://github.com/AlexandrAnatoliev/project-euler-in-java
```
* To compile the program, you need to run the command from the main directory (problem-4/):
```declarative
javac -d bin ./src/problem4/*
```
* Now the compiled files appear in the bin/ folder. Run program by command:
```declarative
java -classpath ./bin problem4.Main 
```
* **Creating JAR-file**
* In the main repository (problem-4/), create a manifest file **manifest.mf**:
```declarative
main-class: problem4.Main
class-path: bin/
```
* Building a jar file:
```declarative
jar -cmf manifest.mf problem4.jar -C bin .
```
* Run a jar file:
```declarative
java -jar problem4.jar 
```