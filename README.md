# [Project-Euler](https://projecteuler.net)
My solutions to project euler questions. 
[My profile](https://projecteuler.net/profile/a.luo123.png)

###[Problem 67](https://projecteuler.net/problem=67)/[18](https://projecteuler.net/problem=18) - Maximum Sum Paths 1 && 2

The biggest worry with this problem was efficiency. Given that brute force would not be a sustainable option for Problem 67, I went straight for a more elegant solution. The end result was inspired by my solution to [Problem 14](https://projecteuler.net/problem=14), the Longest Collatz Sequence. I had two jagged arrays, one for the original numbers from the triangle and another for the max sum paths. This way, I would store max sums as I find them, essentially building it from the bottom up. Finding the max sum of the upper layer would be the simple matter of comparing the two sums just below it. 

Relevant files: [MaxSumPath.java](MaxSumPath.java), [p067_triangle.txt](p067_triangle.txt), [sample1.txt](sample1.txt)

###[Problem 25](https://projecteuler.net/problem=25) - 1000-digit Fibonacci number

Having already implemented a Fibonacci generator in [Problem 2](https://projecteuler.net/problem=2), now I needed one that could accommodate a thousand digit numbers. I simply used the Java Class BigInteger. Alternatively, I could have used strings and reinvent the BigInteger class. 

Relevant files: [Fibo1000.java](Fibo1000.java)

###[Problem 20](https://projecteuler.net/problem=20) - Factorial Digit Sum

This problem simply used the digit sum function and the factorial function I had already written for [Problem 16](https://projecteuler.net/problem=16) and [Problem 15](https://projecteuler.net/problem=15) respectively. I did not have to worry about integer overflow because it was written in Racket with dynamic typing.

Relevant files: [usefulFunctions.rkt](usefulFunctions.rkt)

###[Problem 17](https://projecteuler.net/problem=17) - Number Letter Counts

For this problem, I had a number of cases to take into account and change the program behaviour accordingly. I also individually counted the number of letters for each case, which could be improved by using the String `length()` method. Luckily I made no mistakes in the letter count, but it definitely would have made the code more readable and easier to write.

Relevant files: [Euler17.java](Euler17.java)

###[Problem 16](https://projecteuler.net/problem=16) - Power Digit Sum

I used the Racket built in exponent function as well as my own digit sum function I wrote for other programs.

Relevant files: [usefulFunctions.rkt](usefulFunctions.rkt)

###[Problem 15](https://projecteuler.net/problem=15) - Lattice Paths

Solved using combinatorics, namely my own `choose` function

Relevant files: [usefulFunctions.rkt](usefulFunctions.rkt)

###[Problem 14](https://projecteuler.net/problem=14) - Longest Collatz Sequence

Initially I tried to do this in a brute force method. However, brute force got way too long. Then I realized that if I had a number like 40, the length would just be 1 + the length of 20. So I stored every number into an array, and would look up numbers as I encountered them trying to calculate other numbers. I did not know how high it would go, so if a number got bigger than one million I would go back to brute force. Then I just found the maximum element of the array.

Relevant files: [Euler14.java](Euler14.java)

###[Problem 13](https://projecteuler.net/problem=13) - Large Sum

Working in Java, I used the `double` variable type because I only needed the first 10 digits so precision was not as important.

Relevant files: [Euler13.java](Euler13.java), [euler13numbers.txt](euler13numbers.txt)

###[Problem 12](https://projecteuler.net/problem=12) - Highly Divisible Triangular number

Here I needed a method to count divisors of a number. I started out by finding prime factors, which I had done in [Problem 3](https://projecteuler.net/problem=3). It turns out, that there is a relationship between prime factors and normal divisors. It is basically a combinations problem; how many ways can I make a divisor given these prime factors? Say I have a number like 36. 36 is 2*2*3*3. So then I have three powers of 2 to work with `(2^0, 2^1, 2^2)`, and three powers of 3 `(3^0, 3^1, 3^2)`. The end result is 9 total divisors. For 36 that's 1 `(2^0 * 3^0)`, 2 `(2^1 * 3^0)`, 3 `(2^0 * 3^1)`, 4 `(2^2 * 3^0)`, 6 `(2^1 * 3^1)`, 9 `(2^0 * 3^2)`, 12 `(2^2 * 3^1)`, 18 `(2^1 * 3^2)` and 36 `(2^2 * 3^2)`. 

Relevant files: [Euler12.java](Euler12.java)

###[Problem 11](https://projecteuler.net/problem=11) - Largest Product in a Grid

Very brute force method of solving this one. For each position, I calculated the product horizontally, diagonally, and vertically, while checking for array out-of-bounds errors. If I were to try this again, I would use a similar approach to the the one I used for [Problem 67](https://projecteuler.net/problem=67)/[18](https://projecteuler.net/problem=18), storing the products and updating them so I don't need to redo calculations.

Relevant files: [euler11.cc](euler11.cc), [euler11grid.txt](euler11grid.txt)

###[Problem 10](https://projecteuler.net/problem=10) - Summation of Primes



Relevant files: [Euler10.java](Euler10.java)

###[Problem 9](https://projecteuler.net/problem=9) - Special Pythagorean Triplet
Relevant files: [euler9.cc](euler9.cc)

###[Problem 8](https://projecteuler.net/problem=8) - Largest Product in a Series
Relevant files: [euler8.cc](euler8.cc), [euler8number.txt](euler8number.txt)

###[Problem 7](https://projecteuler.net/problem=7) - 10001st Prime
Relevant files: [euler7.cc](euler7.cc)

###[Problem 6](https://projecteuler.net/problem=6) - Sum Square Differences
Relevant files: [euler6.cc](euler6.cc)

###[Problem 5](https://projecteuler.net/problem=5) - Smallest Multiple
Relevant files: [euler5.cc](euler5.cc)

###[Problem 4](https://projecteuler.net/problem=4) - Largest Palindrome Product
Relevant files: [euler4.rkt](euler4.rkt)

###[Problem 3](https://projecteuler.net/problem=3) - Largest Prime Factor
Relevant files: [euler3.cc](euler3.cc)

###[Problem 2](https://projecteuler.net/problem=2) - Even Fibonacci Numbers
Relevant files: [euler2.cc](euler2.cc)

###[Problem 1](https://projecteuler.net/problem=1) - Multiples of 3 and 5
Relevant files: [euler1.cc](euler1.cc)
