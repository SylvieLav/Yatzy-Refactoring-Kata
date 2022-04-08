package com.yatzy.refactoringkata;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class YatzyTest {
	Dice dice;
	int expected;
	int actual;
	
	@Test
    public void Should_Return15_When_RollIs23451OnChance() {
		dice = new Dice(2,3,4,5,1);
        expected = 15;
        actual = Yatzy.chance(dice);
        
        assertEquals(expected, actual);
    }
	
	@Test
    public void Should_Return16_When_RollIs33451OnChance() {
		dice = new Dice(3,3,4,5,1);
        expected = 16;
        actual = Yatzy.chance(dice);
        
        assertEquals(expected, actual);
	}
    
    @Test
    public void Should_Return50_When_RollIs44444OnYatzy() {
    	dice = new Dice(4,4,4,4,4);
        expected = 50;
        actual = Yatzy.yatzy(dice);
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void Should_Return50_When_RollIs66666OnYatzy() {
    	dice = new Dice(6,6,6,6,6);
        expected = 50;
        actual = Yatzy.yatzy(dice);
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void Should_Return0_When_RollIs66663OnYatzy() {
        dice = new Dice(6,6,6,6,3);
        expected = 0;
        actual = Yatzy.yatzy(dice);
        
        assertEquals(expected, actual);
    }

    @Test
    public void Should_Return1_When_RollIs12345OnOnes() {
        dice = new Dice(1,2,3,4,5);
    	expected = 1;
        actual = Yatzy.ones(dice);
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void Should_Return2_When_RollIs12145OnOnes() {
    	dice = new Dice(1,2,1,4,5);
    	expected = 2;
        actual = Yatzy.ones(dice);
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void Should_Return0_When_RollIs62245OnOnes() {
    	dice = new Dice(6,2,2,4,5);
    	expected = 0;
        actual = Yatzy.ones(dice);
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void Should_Return4_When_RollIs12111OnOnes() {
    	dice = new Dice(1,2,1,1,1);
    	expected = 4;
        actual = Yatzy.ones(dice);
        
        assertEquals(expected, actual);
    }

    @Test
    public void Should_Return4_When_RollIs12326OnTwos() {
        dice = new Dice(1,2,3,2,6);
    	expected = 4;
        actual = Yatzy.twos(dice);
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void Should_Return10_When_RollIs22222OnTwos() {
        dice = new Dice(2,2,2,2,2);
    	expected = 10;
        actual = Yatzy.twos(dice);
        
        assertEquals(expected, actual);
    }

    @Test
    public void Should_Return6_When_RollIs12323OnThrees() {
    	dice = new Dice(1,2,3,2,3);
    	expected = 6;
        actual = Yatzy.threes(dice);
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void Should_Return12_When_RollIs23333OnThrees() {
        dice = new Dice(2,3,3,3,3);
    	expected = 12;
        actual = Yatzy.threes(dice);
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void Should_Return12_When_RollIs44455OnFours() {
        dice = new Dice(4,4,4,5,5);
    	expected = 12;
        actual = Yatzy.fours(dice);
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void Should_Return8_When_RollIs44555OnFours() {
        dice = new Dice(4,4,5,5,5);
    	expected = 8;
        actual = Yatzy.fours(dice);
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void Should_Return4_When_RollIs45555OnFours() {
    	dice = new Dice(4,5,5,5,5);
    	expected = 4;
        actual = Yatzy.fours(dice);
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void Should_Return10_When_RollIs44455OnFives() {
    	dice = new Dice(4,4,4,5,5);
    	expected = 10;
        actual = Yatzy.fives(dice);
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void Should_Return15_When_RollIs44555OnFives() {
    	dice = new Dice(4,4,5,5,5);
    	expected = 15;
        actual = Yatzy.fives(dice);
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void Should_Return20_When_RollIs45555OnFives() {
    	dice = new Dice(4,5,5,5,5);
    	expected = 20;
        actual = Yatzy.fives(dice);
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void Should_Return0_When_RollIs44455OnSixes() {
    	dice = new Dice(4,4,4,5,5);
    	expected = 0;
        actual = Yatzy.sixes(dice);
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void Should_Return6_When_RollIs44655OnSixes() {
    	dice = new Dice(4,4,6,5,5);
    	expected = 6;
        actual = Yatzy.sixes(dice);
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void Should_Return18_When_RollIs65665OnSixes() {
    	dice = new Dice(6,5,6,6,5);
    	expected = 18;
        actual = Yatzy.sixes(dice);
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void Should_Return6_When_RollIs34356OnOnePair() {
    	dice = new Dice(3,4,3,5,6);
    	expected = 6;
        actual = Yatzy.onePair(dice);
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void Should_Return10_When_RollIs53335OnOnePair() {
    	dice = new Dice(5,3,3,3,5);
    	expected = 10;
        actual = Yatzy.onePair(dice);
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void Should_Return12_When_RollIs53665OnOnePair() {
    	dice = new Dice(5,3,6,6,5);
    	expected = 12;
        actual = Yatzy.onePair(dice);
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void Should_Return16_When_RollIs33545OnTwoPairs() {
    	dice = new Dice(3,3,5,4,5);
    	expected = 16;
        actual = Yatzy.twoPairs(dice);
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void Should_Return16_When_RollIs33555OnTwoPairs() {
    	dice = new Dice(3,3,5,5,5);
    	expected = 16;
        actual = Yatzy.twoPairs(dice);
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void Should_Return9_When_RollIs33345OnThreeOfAKind() {
    	dice = new Dice(3,3,3,4,5);
    	expected = 9;
        actual = Yatzy.threeOfAKind(dice);
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void Should_Return15_When_RollIs53545OnThreeOfAKind() {
    	dice = new Dice(5,3,5,4,5);
    	expected = 15;
        actual = Yatzy.threeOfAKind(dice);
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void Should_Return9_When_RollIs33335OnThreeOfAKind() {
    	dice = new Dice(3,3,3,3,5);
    	expected = 9;
        actual = Yatzy.threeOfAKind(dice);
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void Should_Return12_When_RollIs33335OnFourOfAKind() {
    	dice = new Dice(3,3,3,3,5);
    	expected = 12;
        actual = Yatzy.fourOfAKind(dice);
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void Should_Return20_When_RollIs55545OnFourOfAKind() {
    	dice = new Dice(5,5,5,4,5);
    	expected = 20;
        actual = Yatzy.fourOfAKind(dice);
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void Should_Return12_When_RollIs33333OnFourOfAKind() {
    	dice = new Dice(3,3,3,3,3);
    	expected = 12;
        actual = Yatzy.fourOfAKind(dice);
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void Should_Return15_When_RollIs12345OnSmallStraight() {
    	dice = new Dice(1,2,3,4,5);
    	expected = 15;
        actual = Yatzy.smallStraight(dice);
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void Should_Return15_When_RollIs23451OnSmallStraight() {
    	dice = new Dice(2,3,4,5,1);
    	expected = 15;
        actual = Yatzy.smallStraight(dice);
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void Should_Return0_When_RollIs12245OnSmallStraight() {
    	dice = new Dice(1,2,2,4,5);
    	expected = 0;
        actual = Yatzy.smallStraight(dice);
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void Should_Return20_When_RollIs62345OnLargeStraight() {
    	dice = new Dice(6,2,3,4,5);
    	expected = 20;
        actual = Yatzy.largeStraight(dice);
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void Should_Return20_When_RollIs23456OnLargeStraight() {
    	dice = new Dice(2,3,4,5,6);
    	expected = 20;
        actual = Yatzy.largeStraight(dice);
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void Should_Return0_When_RollIs12245OnLargeStraight() {
    	dice = new Dice(1,2,2,4,5);
    	expected = 0;
        actual = Yatzy.largeStraight(dice);
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void Should_Return18_When_RollIs62226OnFullHouse() {
    	dice = new Dice(6,2,2,2,6);
    	expected = 18;
        actual = Yatzy.fullHouse(dice);
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void Should_Return0_When_RollIs23456OnFullHouse() {
    	dice = new Dice(2,3,4,5,6);
    	expected = 0;
        actual = Yatzy.fullHouse(dice);
        
        assertEquals(expected, actual);
    }
}
