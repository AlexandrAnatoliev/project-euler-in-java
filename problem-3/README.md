<div id="header" align="center">
    <h1>Problem-3 "Largest Prime Factor"</h1>
</div>

[In English](README.md)

<div id="header" align="center">
    <h3>Problem statement</h3>
</div>

The prime factors of **13195 are 5, 7, 13** and **29**.

What is the largest prime factor of the number **600851475143**?

<div id="header" align="center">
    <h3>Solution algorithm</h3>
</div>

When dividing a number by an integer, we get two divisors at once: the maximum and the minimum. For example, the number **15** can be represented as the product of **3** and **5**. The larger divisor, in turn, can also be decomposed into divisors.

In this case, if you sort the divisors from smaller to larger, then the first divisor found will be a priori minimal and prime. There is also no need to check all the divisors from 2 to the number being factored. It is enough to check the divisors only up to the square root of the number being factored. If there are no divisors of the number up to it, then there will be none further, and the number being checked is prime.

In addition, all even numbers are divisible by **2**. Therefore, having checked the divisibility of a number by **2**, you do not need to check its divisibility by **4**, **6**, etc.

Also, when factoring a number into prime factors, you don't need to check all the factors each time.
For example, we factor the number **13195** and sequentially check its divisibility by **2**, **3** and **5**. We find that **13195 % 5 = 0 ** and reduce the number **13195 / 5 = 2639**.
There is no need to re-check the divisibility of the number **2639** by **2** and **3**, since the number **13195 ( = 2639 * 5)** has already been checked for them earlier.
At the same time, any number can contain several identical factors (the number **12 = 2 * 2 * 3**). Therefore, the number **2639** needs to be checked for divisibility by the numbers **5**, **9**, **11**, etc.
 
<div id="header" align="center">
  <h3>New skills practiced while solving the problem</h3>
</div>

* Command line parameters;
* Divided the code into two classes in two different files;
* Using the constructor, an object was created and calculations were performed using its methods;
* Used the predefined **Long** class and its static method **parseLong()**.
* [Creating JAR files;](https://java-practice.ru/blog/kompilyaciya-java-koda.jsp)
* [Copying files via ssh;](https://java-practice.ru/blog/kopirovanie-fajlov-po-ssh.jsp)
* Change java version;


