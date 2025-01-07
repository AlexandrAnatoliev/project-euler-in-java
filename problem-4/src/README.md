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


