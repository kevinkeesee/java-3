package lambda_streams;

import java.util.*;

class Animals {
    //This class will be using streams.
    static List<String> animals = Arrays.asList("peacoCK","rabbit","chiwawa","OranguTAN","vipeR","cobra","paNDa","bUffalo","DeeR","maLLard");

    public static void main(String[] args) {
        System.out.println("original animals : " + animals);
        
        LambdaSort lambdaCaps = (animaList, mutate) -> {
        	return capsFirst(animaList, mutate);
        };
        
        LambdaSort lambdaLower = (animaList, mutate) -> {
        	return lowerFirst(animaList, mutate);
        };
        
        LambdaAdd lambdaAdd = (animal) -> {
        	return addAnimal(animal);
        };
        
        LambdaArrange lambdaFlip = (mutate) -> {
        	return flipAnimals(mutate);
        };
        
        LambdaArrange lambdaSort = (mutate) -> {
        	return sortAnimals(mutate);
        };

        //clean up the animals array by using the capsFirst() method. follow instructions in the method definition. 
        List<String> cleaned = lambdaCaps.sort(animals, false);
        System.out.println(cleaned);
       
        //do not modify these addAnimal() method invocations
        addAnimal("rEIndeeR");
        addAnimal("Platypus");
        addAnimal("frOg");
        addAnimal("lEOpArD");
        //---------------------------------------

        lambdaCaps.sort(animals, true);
        System.out.println(animals);

        List<String> lowered = lambdaLower.sort(animals, false);
        System.out.println(lowered);
    }

    static List<String> capsFirst(List<String> animaList, boolean mutate) {
        //clean up the animals list so that the first letter is capitalized, and all the other letters are lowercased. Use a stream to accomplish this task.  Also, the 2nd parameter of this function is a boolean.  use this boolean 'flag' to determine whether or not to 'mutate' the original animals array stored as a static class field.  if the flag is set to 'true', mutate the animals and return the animals out of the function.  if it is false, create a copy of the animals, perform your stream operations on the copy, and return the copy of animals out of the function, WITHOUT modifying the original animals array.
    	if (mutate) {
    		for(int i = 0; i < animaList.size(); i++) {
        		animaList.set(i, animaList.get(i).toLowerCase());
    			char[] array = animaList.get(i).toCharArray();
        		array[0] = Character.toUpperCase(array[0]);
        		animals.set(i, new String(array));
        	}
    		return animals;
    	} else {
    		List<String> copy = new ArrayList<String>(animaList);
    		for(int i = 0; i < copy.size(); i++) {
    			copy.set(i, copy.get(i).toLowerCase());
    			char[] array = copy.get(i).toCharArray();
    			array[0] = Character.toUpperCase(array[0]);
    			copy.set(i, new String(array));
    		}
    		return copy;
    	}
    }

    static String addAnimal(String animal) {
        //add an animal to the animal list.
    	List<String> copy = new ArrayList<String>(animals);
    	copy.add(animal);
    	animals = copy;
        return animal;
    };

    static List<String> lowerFirst(List<String> animaList, boolean mutate) {
        //lowercase the first letter, and uppercase the rest of the letters, using streams.  Also, depending on the value of the boolean flag 'mutate', mutate the original animals list, or perform your stream operations on a 'copy' of the animals list.  return the list out of hte function in both cases.
    	if (mutate) {
    		for(int i = 0; i < animaList.size(); i++) {
        		animaList.set(i, animaList.get(i).toUpperCase());
    			char[] array = animaList.get(i).toCharArray();
        		array[0] = Character.toLowerCase(array[0]);
        		animals.set(i, new String(array));
        	}
    		return animals;
    	} else {
    		List<String> copy = new ArrayList<String>(animaList);
    		for(int i = 0; i < copy.size(); i++) {
    			copy.set(i, copy.get(i).toUpperCase());
    			char[] array = copy.get(i).toCharArray();
    			array[0] = Character.toLowerCase(array[0]);
    			copy.set(i, new String(array));
    		}
    		return copy;
    	}
    }

    static List<String> flipAnimals(boolean mutate) {
        //reverse the order of the animals in the animal list.  If the booleaen parameter is true, reverse the static animals array list by mutating the array.  if the mutate boolean is false, flip a 'copy' of the animals list, then return that list of flipped animals, WITHOUT mutating the static animals array. return the flipped list in both cases.
    	if(mutate) {
    		Collections.reverse(animals);
    		return animals;
    	} else {
    		List<String> copy = new ArrayList<String>(animals);
    		Collections.reverse(copy);
    		return copy;
    	}
    }

    static List<String> sortAnimals(boolean mutate) {
    	//sort the animals in alphabetical order.  If the booleaen parameter is true, mutating the animals list.  if the mutate boolean is false, sort a 'copy' of the animals list, then return that list of sorted animals, WITHOUT mutating the static animals array. return the sorted list in both cases.
    	if (mutate) {
    		animals.sort(Comparator.comparing(String::toString));
    		return animals;
    	} else {
    		List<String> copy = new ArrayList<String>(animals);
    		copy.sort(Comparator.comparing(String::toString));
    		return copy;
    	}
    }
}


@FunctionalInterface
interface LambdaSort {
	List<String> sort(List<String> animaList, boolean mutate);
}

interface LambdaAdd {
	String add(String animal);
}

interface LambdaArrange {
	List<String> arrange(boolean mutate);
}


