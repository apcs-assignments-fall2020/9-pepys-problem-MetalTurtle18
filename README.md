# Pepys Problem

In this assignment, you'll be writing three methods to find out the answer of the Pepys Problem. 

In 1693, Samuel Pepys and Isaac Newton discussed a math problem. They wondered which of the following had the greatest chance of success:
* Rolling six dice and getting at least one 6
* Rolling twelve dice and getting at least two 6's
* Rolling eighteen dice and getting at least three 6's

You will write code to solve this problem empirically. You will write three total methods.

The first method is probabilityOneSix(). This method takes no input, and calculates the probability that you will get at least one 6 when rolling six dice. To get a good estimate for this probability, you should run this experiment at least 10,000 times. The method will return the probability as a double representing the percentage of trials that were successful. For example, if 75.5% of the trials were successful, the method would return 75.5. The method has the following signature: public static double probabilityOneSix() {}

The other two methods probabilityTwoSixes() and probabilityThreeSixes() are similar, except that they calculate the probability that you will get at least two 6's when rolling twelve dice or the probability that you will get at least three 6's when rolling eighteen dice.

Your main method should call the three methods that you've written. 

<br />
<br />

Add code to [MyMain.java](src/main/java/MyMain.java) to do the desired thing.

## Run your code with:
```shell script
make run
```

## Run your tests with:
```shell script
make test
```