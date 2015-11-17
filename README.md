# algo
General algorithm problems from the internet/books that don't fit anywhere else nicely.

Basically, non-OJ algorithm problems, since I already have online judge repositories both here and on bitbucket (private).
I will provide a source for problems where possible and known.

## Index
* [Arrays](#arrays)
* [Graphs](#graphs)
  * [Binary Trees](#binary-trees)
* [Linked Lists](#linked-lists)
* [Math Based](#math-based)
* [Strings](#strings)
* [How to run tests](#how-to-run-tests)
* [TODO](#todo)

## Arrays
* [Find the most frequent integer in an array](https://github.com/munyari/algo/blob/master/src/MostFrequent.java) - [Source](http://redd.it/20ahfq)
* [Find the common elements of 2 int arrays](https://github.com/munyari/algo/blob/master/src/CommonElem.java) - [(Source)](http://redd.it/20ahfq)
* [Merge two sorted arrays](https://github.com/munyari/algo/blob/master/src/Merge.java) - [(Source)](https://firecode.io)
* [Implement Insertion Sort on an array of integers](https://github.com/munyari/algo/blob/master/src/InsertionSort.java)

## Graphs
### Binary Trees
* [Find the sum of all elements in a binary tree](https://github.com/munyari/algo/blob/master/src/BinSum.java) - [(Source)](https://firecode.io)
* [Find the height of a binary tree](https://github.com/munyari/algo/blob/master/src/BinHeight.java) - [(Source)](https://firecode.io)
* [Implement a recursive postorder traversal](https://github.com/munyari/algo/blob/master/src/PostOrder.java) - [(Source)](https://firecode.io)
* [Implement an recursive inorder traversal](https://github.com/munyari/algo/blob/master/src/Inorder.java) - [(Source)](https://firecode.io)
* [Implement an iterative preorder traversal](https://github.com/munyari/algo/blob/master/src/PreorderI.java) - [(Source)](https://firecode.io)
* [Count the number of leaves on a binary tree](https://github.com/munyari/algo/blob/master/src/CountLeaves.java) - [(Source)](https://firecode.io)
* [Check whether two binary trees are identical](https://github.com/munyari/algo/blob/master/src/IdenticalBinTree.java) - [(Source)](https://firecode.io)
* [Construct a postorder traversal iteratively](https://github.com/munyari/algo/blob/master/src/PostOrderIterative.java) - [(Source)](https://firecode.io)

## Linked Lists
* [Delete the node at a particular position in a linked list.](https://github.com/munyari/algo/blob/master/src/DeleteAtMiddle.java) - [(Source)](https://firecode.io)
* [Reverse a singly linked list.](https://github.com/munyari/algo/blob/master/src/ReverseLinked.java) - The Algorithm Design Manual
* [Detect a cycle in a linked list (Hint: Floyd's cycle finding algorithm)](https://github.com/munyari/algo/blob/master/src/TortoiseHare.java) - [(Source)](https://firecode.io)

## Math Based
* [Write a method `pow(x, n)` that returns the value of x raised to the power of n](https://github.com/munyari/algo/blob/master/src/Pow.java) - [(Source)](https://firecode.io)
* [Write a method that calculates the Hamming Weight of a number](https://github.com/munyari/algo/blob/master/src/HammingWeight.java) - CodeAbbey - [Wikipedia](https://en.wikipedia.org/wiki/Hamming_weight)

## Strings
* [Find the first non-repeated character in a String](https://github.com/munyari/algo/blob/master/src/NonRepeat.java) - [(Source)](http://redd.it/20ahfq)
* [Find the most frequent integer in an array](https://github.com/munyari/algo/blob/master/src/FrequentInt.java) - [(Source)](http://redd.it/20ahfq)
* [Return all permutations of a given string](https://github.com/munyari/algo/blob/master/src/StringPermutations.java) - [(Source)](https://firecode.io)

## How to run tests

Ensure that you have [JUnit](http://junit.org/) installed and in working order.

`cd` to the parent directory of algo.

Compile the class to be tested:

````
    $ javac algo/src/Merge.java
````
	
Compile test with junit jar file:

````
    $ javac -cp .:/opt/junit-4.12/junit-4.12.jar algo/test/MergeTest.java
````

Run the test:

````
    $ java -cp .:/opt/junit-4.12/junit-4.12.jar:/opt/junit-4.12/hamcrest-core-1.3.jar org.junit.runner.JUnitCore algo.test.MergeTest
````

On my own system, I've made these two steps more convenient with two aliases: `junitc` to compile and `junit` to run with the appropriate classpaths.


## TODO
* [X] Add JUnit testing to all sections
* [ ] Add tests to most frequent integer
* [X] Graph section in README
* [X] Binary search section in README (under graph)
* [X] Math section in README
* [ ] Put each section into its own folder
