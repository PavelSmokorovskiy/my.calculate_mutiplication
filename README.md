Calculate mutiplication
=======================
This program computes the multiplication of two large numbers (integers) entered as command line arguments. 
Each number can have any number of digits (up to the maximum length of a CLI argument, try at least 20 digits for each).
It provide two implementations of the algorithm computing the multiplication 
(one of them can use e.g.: BigInteger class another one should implement the algorithm from scratch).
Program allows to choose one of the implementations by arguments.
It is also implements at least one unittest which computes multiplication using both algorithms for
the same inputs and compares results which must be equal.

E.g. for 12345678901234567890*11111111111111111111:
$ ./multiply.sh --alg1 12345678901234567890 11111111111111111111
137174210013717420998628257899862825790

Deliverables
============
Implementation is done in Java.
Additional features:
* clean architecture, layer separation and API design
* delivered as gradle project, when is loaded into IDE (Eclipse or Intellij Idea).
* a unit test are implemented to test partial functionality as well as whole solution.
* delivered as git repository with clean history of commits.
* performance tests aren't provided
* runs in java 9 or 12

Scratch algorithm
============
Based on school mathematics:

            1234
            *
            5678
~~~         ~~~~
1234x8 =    9872;
1234x7 =   8638;
1234x6 =  7404;
1234x5 = 6170;
         ~~~~~~~
         7006652
