# Homework Assignment 01 -- Software Design & Programming Techniques (WS 2016)
The deadline for this assignment is Oct 16th, 23:59. Hand
in this assignment as zip-file via e-mail to jonathan.brachthaeuser@uni-
tuebingen.de.You can hand in your homework in either english or german.

## Task 1. Read up Generics in Java. 
Read the chapter ["Generics (Updated)"](https://docs.oracle.com/javase/tutorial/java/generics/) up to  "Generic Methods and Bounded Type Parameters" (inclusive). 

Summarize the chapter in your own words (~200) and additionally collect
questions you would like to discuss in the next lab-session.

## Task 2. Program using Generics
1. Create a new Java project
1. Import the `Pair<K, V>` class from the generics tutorial into your project.
2. Program an interface / abstract class `Showable<T>` with a method `String
   show(T t)`.
3. Provide instances for `Showable<String>`, `Showable<Integer>` as static
   members `stringShowable` and `integershowable` on `Showable`.
4. Provide a static method `pairShowable` that returns a `Showable<Pair<S, T>>`
   instance, given instances of `Showable<S>` and `Showable<T>` as arguments.
   The result of invoking `pairShowable(..., ...).show(new Pair<>("Hello World",
   42))` with the correct arguments should be equal to the string `"(\"Hello
   World\", 42)"`.
5. Give some tests for your implementation on strings, integers, pairs of
   strings and integers as well as nested pairs.

## Task 3. Reason about the Design.

Compare the design with having an interface `Showable { String show(); }` which
needs to be implemented by the classes that we want to be "Showable". That is,
we would require `Pair` to implement `Showable` and directly invoke `show` on
a pair, instead of invoking `show` on an instance of `Showable<Pair<String,
Integer>>` with the pair as argument.

Compare the two designs with respect to Extensibility. Consider multiple
scenarios where you want to

1. add new classes and make them "Showable",
2. make existing classes "Showable",
3. adding a second, different implementation of `Showable` for some classes.
