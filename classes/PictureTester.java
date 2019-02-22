//package com.gradescope.pixlab;
/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */



public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("images/beach.jpg");
    beach.explore(); // comment these out in repl.it
    beach.zeroBlue();
    beach.explore(); // comment these out in repl.it

    // uncomment this in repl.it to test your code!!
    // beach.write("imagesOutput/beach.jpg");
  }

  public static void testFixUnderwater() {
    Picture water = new Picture("images/water.jpg");
    water.fixUnderwater();
    water.explore();
  }

  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }

  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("images/temple.jpg");
    temple.explore();
    int count = temple.mirrorTemple(0);
    System.out.println(count);
    temple.explore();
//    System.out.println(count);
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture(640, 480);
    canvas.createCollage();
    canvas.explore();
  }

//  public static void testFromPic() {
//    Picture canvas = new Picture(640, 480);
//    canvas.fromPic(0, 0 ,0 ,0 );
//    canvas.explore();
//  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("images/swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }

  public static void testEdgeDetection2()
  {
    Picture swan = new Picture("images/swan.jpg");
    swan.edgeDetection2(10);
    swan.explore();
  }

  public static void testMirrorVerticalRightToLeft() {
    Picture motorcycle = new Picture("images/redMotorcycle.jpg");
    motorcycle.mirrorVerticalRightToLeft();
    motorcycle.explore();
  }

  public static void testHorizontal() {
    Picture motorcycle = new Picture("images/redMotorcycle.jpg");
    motorcycle.mirrorHorizontal();
    motorcycle.explore();
  }

  public static void testHorizontalBotToTop() {
    Picture motorcycle = new Picture("images/redMotorcycle.jpg");
    motorcycle.mirrorHorizontalBotToTop();
    motorcycle.explore();
  }

  public static void testMirrorArms() {
    Picture snowman = new Picture("images/snowman.jpg");
    snowman.mirrorArms();
    snowman.explore();
  }

  public static void testMirrorGull() {
    Picture seagull = new Picture("images/seagull.jpg");
    seagull.mirrorGull();
    seagull.explore();
  }

  public static void testCopy() {
    Picture canvas = new Picture(640, 480);
    Picture snowman = new Picture("images/snowman.jpg");
    canvas.copy(snowman, 0, 0);
    canvas.explore();
  }

  public static void testCopy2() {
    Picture canvas = new Picture("images/640x480.jpg");
    Picture snowman = new Picture("images/snowman.jpg");
    canvas.copy2(snowman, 0, 0, 300, 300);
    canvas.explore();
  }

  public static void testMyCollage() {
    Picture canvas = new Picture("images/640x480.jpg");
    canvas.myCollage();
    canvas.explore();
  }

  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testMyCollage();
    //testCopy2();
    //testFromPic();
    //testMirrorGull();
    //testMirrorArms();
    //testMirrorVerticalRightToLeft();
    //testHorizontal();
    //testHorizontalBotToTop();
    //testFixUnderwater();
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}