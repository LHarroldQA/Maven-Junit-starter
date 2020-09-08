package com.qa.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.qa.main.Blackjack;

public class BlackjackTest {

    // annotations
	@Ignore
    @BeforeClass
    public static void setup() {
        System.out.println("Before class");
    }
	@Ignore
    @Before
    public void init() {
        System.out.println("Before test");
    }
    @Ignore
    @Test
    public void test1() {
        System.out.println("Test 1");
    }
    @Ignore
    @Test
    public void test2() {
        System.out.println("Test 2");
    }
    @Ignore
    @After
    public void finalise() {
        System.out.println("After test");
    }
    @Ignore
    @AfterClass
    public static void teardown() {
        System.out.println("After class");
    }
    // -----------------------------------

    // assertions
    @Ignore
    @Test
    public void thisEqualsThat() {
        int num = 12;
        int otherNum = num;
        assertEquals(num, otherNum);
    }
    @Ignore
    @Test
    public void thisDoesNotEqualThat() {
        int num = 13;
        int otherNum = 63;
        assertNotEquals(num, otherNum);
    }
    @Ignore
    @Test
    public void thisBoolIsTrueTest() {
        boolean thisBool = true;
        assertTrue(thisBool);
    }
    @Ignore
    @Test
    public void thisIsFalseTest() {
        assertFalse(1 == 2);
    }
    @Ignore
    @Test
    public void objectIsNull() {
        Object obj = null;
        assertNull("Expected: Null Object", obj);
    }
    @Ignore
    @Test
    public void objectIsNotNull() {
        Object obj = "Not Null";
        assertNotNull("Expected: Not Null Object", obj);
    }
    // -----------------------------------

    // blackjack tests
    @Test
    public void dealerBustTest() {
        Blackjack b = new Blackjack();
        assertEquals("Expect player to win with 1, dealer to bust",1, b.play(22, 1));
        System.out.println("Dealer bust test");
    }
    
    @Test
    public void playerBustTest() {
        Blackjack b = new Blackjack();
        assertEquals("Expect dealer to win with 1, player to bust",1, b.play(1, 22));
        System.out.println("Player bust test");
    }
    
    @Test
    public void dealerWinTest() {
        Blackjack b = new Blackjack();
        assertEquals("Expect dealer to win with 21",21, b.play(21, 1));
        System.out.println("Dealer win test");
    }
    
    @Test
    public void playerWinTest() {
        Blackjack b = new Blackjack();
        assertEquals("Expect player to win with 21",21, b.play(1, 21));
        System.out.println("Player win test");
    }
    
    @Test 
    public void compareGamesTrue() {
    	Blackjack game1 = new Blackjack();
    	Blackjack game2 = new Blackjack();
    	assertTrue("True as both games to return 15",game1.play(15, 5) == game2.play(5, 15));
    	System.out.println("Compare games are equal test");
    }
    
    @Test 
    public void compareGamesFalse() {
    	Blackjack game1 = new Blackjack();
    	Blackjack game2 = new Blackjack();
    	assertFalse("False as both games return different values",game1.play(15, 5) == game2.play(5, 16));
    	System.out.println("Compare games are not equal test");
    }
    
    @Test
    public void nullTrueGame() {
        Blackjack b = new Blackjack();
        assertNull(b.play(b.getDealer(),b.getPlayer()));
    	System.out.println("See if outcome is null test");
    }
    
    @Test
    public void nullFalseGame() {
        Blackjack b = new Blackjack();
    	assertNotNull(b.play(21,5));
    	System.out.println("See if outcome is not null test");
    }
}
