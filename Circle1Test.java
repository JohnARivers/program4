
/***
* John Rivers
* Program 4 / junit
* JUnit testing class for Circle1 (and Circle)
*
***/

import org.junit.*;

public class Circle1Test
{
   // Data you need for each test case
   private Circle1 circle1;
   // need new circle for testing intersects
   private Circle1 circle1b;

// 
// Stuff you want to do before each test case
//
@Before
public void setup()
{
   //System.out.println("\nTest starting...");
   circle1 = new Circle1(1,2,3);
   // need new circle for testing intersects
   circle1b = new Circle1(2,4,6);
}

//
// Stuff you want to do after each test case
//
@After
public void teardown()
{
   //System.out.println("\nTest finished.");
}

//
// Test a simple positive move
//
@Test
public void simpleMove()
{
   Point p;
   //System.out.println("Running test simpleMove.");
   p = circle1.moveBy(1,1);
   Assert.assertTrue(p.x == 2 && p.y == 3);
}

// 
// Test a simple negative move
//
@Test
public void simpleMoveNeg()
{
   Point p;
   //System.out.println("Running test simpleMoveNeg.");
   p = circle1.moveBy(-1,-1);
   Assert.assertTrue(p.x == 0 && p.y == 1);
}

// 
// Test a simple move of 0 for both parameters
//
@Test
public void simpleMoveNone()
{
   Point p;
   //System.out.println("Running test simpleMoveNeg.");
   p = circle1.moveBy(0,0);
   Assert.assertTrue(p.x == 1 && p.y == 2);
}

//
// Test a simple scale
//
@Test
public void simpleScale()
{
   double r = 2;
   r = circle1.scale(r);
   Assert.assertTrue(r == 6);
}

//
// Test intersects
//
@Test
public void simpleIntersects()
{
   Assert.assertTrue(circle1.intersects(circle1b));
}

/*** NOT USED
public static void main(String args[])
{
   try {
      org.junit.runner.JUnitCore.runClasses(
               java.lang.Class.forName("Circle1Test"));
   } catch (Exception e) {
      System.out.println("Exception: " + e);
   }
}
***/

}

