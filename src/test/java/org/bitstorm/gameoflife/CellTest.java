/*
 * Copyright 2007-2012 by MediData AG
 * ALL RIGHTS RESERVED
 * 
 * $Id$
 */
package org.bitstorm.gameoflife;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Rule;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Ignore;
import org.junit.rules.TestName;


/**
 *
 * @author koa
 */
public class CellTest {

   @Rule
   public TestName name = new TestName();


   public CellTest() {
   }


   @BeforeClass
   public static void setUpClass() throws Exception {
   }


   @AfterClass
   public static void tearDownClass() throws Exception {
   }


   @Before
   public void setUp() {
      System.out.println("--- testing " + name.getMethodName() + "() ---");
   }


   @After
   public void tearDown() {
      //log.info("end testing " + name.getMethodName());      
   }



   /**
    * Test of equals method, of class Cell.
    */
   @Test
   public void testEquals() {
      Cell c1 = new Cell(2, 3);
      Cell c2 = new Cell(2, 3);
      
      assertThat(c1, equalTo(c2));
      assertThat(c1, is(c2));
   }


   /**
    * Test of hashCode method, of class Cell.
    */
   @Test
   @Ignore
   public void testHashCode() {
      System.out.println("hashCode");
      Cell instance = null;
      int expResult = 0;
      int result = instance.hashCode();
      assertEquals(expResult, result);
      // TODO review the generated test code and remove the default call to fail.
      fail("The test case is a prototype.");
   }


}
