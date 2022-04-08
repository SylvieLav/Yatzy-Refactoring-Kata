package com.yatzy.refactoringkata;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Yatzy {

    public static int chance(Dice dice) {  
        return dice.roll
        		.stream()
        		.mapToInt(Integer::valueOf)
        		.sum();
    }

    public static int yatzy(Dice dice) {
    	if (dice.roll
    			.stream()
    			.allMatch(dice.roll.get(0)::equals)) {
    		return 50;
    	}
        
        return 0;
    }

    public static int ones(Dice dice) {
    	return score(dice, 1);
    }

    public static int twos(Dice dice) {
    	return score(dice, 2);
    }

    public static int threes(Dice dice) {
    	return score(dice, 3);
    }

    public static int fours(Dice dice) {
    	return score(dice, 4);
    }

    public static int fives(Dice dice) {
    	return score(dice, 5);
    }
    
    public static int sixes(Dice dice) {
    	return score(dice, 6);
    }
    
    private static int score(Dice dice, int n) {
    	return Math.toIntExact(dice.roll
    			.stream()
    			.filter(i -> i == n)
    			.count()*n);
    }
    
    public static int onePair(Dice dice) {
    	return getPairs(dice, 1);
    }
    
    public static int twoPairs(Dice dice) {
    	return getPairs(dice, 2);
    }

    private static int getPairs(Dice dice, int pairs) {
    	List<Integer> list = getListOfMinimumOccurrency(dice, 2);
    	
    	if (list.size() >= pairs) {
    		return list
    				.stream()
    				.skip(Math.max(0, list.size()-pairs))
    				.mapToInt(Integer::valueOf)
    				.sum()*2;
    	}
    	
    	return 0;
    }
    
    public static int threeOfAKind(Dice dice) {
    	return XOfAKind(dice, 3);
    }
    
    public static int fourOfAKind(Dice dice) {
    	return XOfAKind(dice, 4);
    }
    
    private static int XOfAKind(Dice dice, int x) {
    	List<Integer> list = getListOfMinimumOccurrency(dice, x);
    	
    	if (list.size() != 0) {
    		return list.get(0)*x;
    	}
    	
    	return 0;
    }
    
    private static List<Integer> getListOfMinimumOccurrency(Dice dice, int occurrency) {
    	return dice.roll
    			.stream()
    			.sorted()
    			.filter(i -> Collections.frequency(dice.roll, i)>=occurrency)
    			.distinct()
    			.collect(Collectors.toUnmodifiableList());
    }
    
    public static int smallStraight(Dice dice) {
    	return straight(dice, Arrays.asList(1,2,3,4,5));
    }
    
    public static int largeStraight(Dice dice) {
    	return straight(dice, Arrays.asList(2,3,4,5,6));
    }
    
    private static int straight(Dice dice, List listToCompare) {
    	List<Integer> list = dice.roll
    			.stream()
    			.sorted()
    			.collect(Collectors.toList());
    	if (list.equals(listToCompare)) {
    		return dice.roll
    				.stream()
    				.mapToInt(Integer::valueOf)
    				.sum();
    	}
    	
    	return 0;
    }
    
    public static int fullHouse(Dice dice) {
    	List<Integer> list2 = getListOfExactOccurrency(dice, 2);
    	List<Integer> list3 = getListOfExactOccurrency(dice, 3);
    	
    	if (list2.size() != 0 && list3.size() != 0) {
    		return list2.get(0)*2 + list3.get(0)*3;
    	}
    	
    	return 0;
    }
    
    private static List<Integer> getListOfExactOccurrency(Dice dice, int occurrency) {
    	return dice.roll
    			.stream()
    			.sorted()
    			.filter(i -> Collections.frequency(dice.roll, i) == occurrency)
    			.collect(Collectors.toUnmodifiableList());
    }
    
}
