
/***
* John Rivers
* Program 4 / junit
* JUnit testing class for Circle2 (and Circle)
*
***/

import org.junit.*;

public class Circle2Test
{
   // Data you need for each test case
   private Circle2 circle2;
   // need new circle for testing intersects
   private Circle2 circle2b;

// 
// Stuff you want to do before each test case
//
@Before
public void setup()
{
   //System.out.println("\nTest starting...");
   circle2 = new Circle2(1,2,3);
   // need new circle for testing intersects
   circle2b = new Circle2(2,4,6);
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
   p = circle2.moveBy(1,1);
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
   p = circle2.moveBy(-1,-1);
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
   p = circle2.moveBy(0,0);
   Assert.assertTrue(p.x == 1 && p.y == 2);
}

//
// Test a simple scale
//
@Test
public void simpleScale()
{
   double r = 2;
   r = circle2.scale(r);
   Assert.assertTrue(r == 6);
}

//
// Test intersects
//
@Test
public void simpleIntersects()
{
   Assert.assertTrue(circle2.intersects(circle2b));
}

/*** NOT USED
public static void main(String args[])
{
   try {
      org.junit.runner.JUnitCore.runClasses(
               java.lang.Class.forName("Circle2Test"));
   } catch (Exception e) {
      System.out.println("Exception: " + e);
   }
}
***/

}

