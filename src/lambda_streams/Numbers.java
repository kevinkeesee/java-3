package lambda_streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Numbers {
    static List<Integer> nums = Arrays.asList(10,100,1000,5,50,500,3,30,300,7,70,700,1,10,100,25,250,2500);

    public static void main(String[] args) {
        //Part I :complete the static class methods that have been set up in this Numbers class java file.  Use streams to compute the results wheever possible.
        System.out.println(nums);

        //Part II - refactor all of the class methods to accept lambda expressions. You can put the lambda functions directly inside the method calls, or defined them first, then pass them into the methods. give them the same names as the static methods, but add the word 'lambda' in front of every lambda function:
        /* e.g.

        added(() -> {});

        OR

        lambdaAdd = () -> {};
        added(lambdaAdd);

        isOdd(() -> {});

        OR

        lambdaOdd = () -> {};
        isOdd(lambdaOdd);
        etc...

        */
        
        LambdaCalcReInt lambdaAppend = (num) -> {
        	return append(num);
        };
        
        System.out.println(lambdaAppend.calc(55));
        System.out.println(nums);
        
        LambdaCalcInt lambdaOdd = (num) -> {
        	return isOdd(num);
        };
        
        LambdaCalcInt lambdaEven = (num) -> {
        	return isEven(num);
        };
        
        lambdaOdd.calc(6);
        lambdaEven.calc(1);
        
        LambdaCalcInt lambdaPrime = (num) -> {
        	return isPrime(num);
        };
        
        lambdaPrime.calc(3);
        lambdaPrime.calc(4);
        
        LambdaCalcNull lambdaAdded = () -> {
        	return added();
        };
        
        System.out.println(lambdaAdded.calc());
        
        LambdaCalcNull lambdaSubtracted = () -> {
        	return subtracted();
        };
        
        LambdaCalcNull lambdaMultiplied = () -> {
        	return multiplied();
        };
        
        System.out.println(lambdaMultiplied.calc());
        
        LambdaCalcNull lambdaDivided = () -> {
        	return divided();
        };
        
        LambdaCalcNull lambdaMax = () -> {
        	return findMax();
        };
        
        System.out.println(lambdaMax.calc());
        
        LambdaCalcNull lambdaMin = () -> {
        	return findMin();
        };
        
        System.out.println(lambdaMin.calc());
        
        LambdaCalcInts lambdaCompare = (num1, num2) -> {
        	return compare(num1, num2);
        };
        
    }

    static boolean isOdd(int i) {
        //determine if the value at the index i is odd.  return true if yes, return false if  no.
    	if(nums.get(i) % 2 == 1) {
    		System.out.println(nums.get(i) + " is odd.");
    		return true;
    	}
    	System.out.println(nums.get(i) + " is even.");
        return false;
    }

    static boolean isEven(int i) {
        //determine if the value at the index i is even.  return true if yes, return false if  no.
    	if(nums.get(i) % 2 == 0) {
    		System.out.println(nums.get(i) + " is even.");
    		return true;
    	}
    	System.out.println(nums.get(i) + " is odd.");
        return false;
    }

    static boolean isPrime(int i) {
         //determine if the value at the index i is a prime number.  return true if yes, return false if no.
    	if(nums.get(i) <= 1) {
    		System.out.println(nums.get(i) + " is too small.");
    		return false;
    	}
    	
    	for (int n = 2; n < nums.get(i); n++) {
    		if (nums.get(i) % n == 0) {
    			System.out.println(nums.get(i) + " is not prime.");
    			return false;
    		}
    	}
    	System.out.println(nums.get(i) + " is prime.");
    	return true;
    }

    static int added() {
        //add all the elements in the list.  return the sum.
        return nums.stream().mapToInt(Integer::intValue).sum();
    }

    static int subtracted() {
        //subtract all the elements in the list. return the remainder.
    	return nums.stream().mapToInt(Integer::intValue).sum() * -1;
    }

    static int multiplied() {
        //multiply all the elements in the list. and return the product.
    	int product = 1;
    	
    	for (int i = 0; i < nums.size(); i++) {
    		product *= nums.get(i);
    	}
        return product;
    }

    static int divided() {
        //multiply all the elements in the list. and return the product.
    	int product = 1;
    	
    	for (int i = 0; i < nums.size(); i++) {
    		product /= nums.get(i);
    	}
        return product;
    }

    static int findMax() {
         //return the maximum value in the list.
        return nums.stream().max(Integer::compare).get();
    }

    static int findMin() {
        //return the minimum value in the list.
    	return nums.stream().min(Integer::compare).get();
    }

    static int compare(int i, int j) {
        //compare the values stored in the array at index position i and j.  
        //if the value at i is greater, return 1.  if the value at j is greater, return -1.  if the two values are equal, return 0.
    	if(nums.get(i) > nums.get(j)) {
    		return 1;
    	} else if (nums.get(i) < nums.get(j)) {
    		return -1;
    	}
    	
        return 0;
    }

    static int append(int n) {
        //add a new value to the values list. return that value after adding it to the list.
    	List<Integer> addedNums = new ArrayList<Integer>(nums);
    	addedNums.add(n);
    	nums = addedNums;
    	return n;
    }
}

@FunctionalInterface
interface LambdaCalcInt {
	boolean calc(int num);
}

interface LambdaCalcReInt {
	int calc(int num);
}

interface LambdaCalcInts {
	int calc(int num1, int num2);
}

interface LambdaCalcNull {
	int calc();
}

