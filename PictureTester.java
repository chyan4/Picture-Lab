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
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture redMotor = new Picture("images/redMotorcycle.jpg");
    redMotor.explore();
    redMotor.mirrorVertical();
    redMotor.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("images/temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("images/640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("images/swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void testKeepOnlyBlue()
  {
	  Picture blueEyes = new Picture("images/White Lightning.jpg");
	  blueEyes.keepOnlyBlue();
	  blueEyes.explore();
  }
  
  public static void testNegate()
  {
	  Picture water = new Picture("images/water.jpg");
	  water.negate();
	  water.explore();
  }
  
  public static void testGrayscale()
  {
	  Picture water = new Picture("images/water.jpg");
	  water.grayscale();
	  water.explore();
  }
  
  public static void testFixUnderwater()
  {
	  Picture water = new Picture("images/water.jpg");
	  water.fixUnderwater();
	  water.explore();
  }
  
  public static void testMirrorVerticalRightToLeft()
  {
	  Picture redMotor = new Picture("images/redMotorcycle.jpg");
	  redMotor.mirrorVerticalRightToLeft();
	  redMotor.explore();
  }
  
  public static void testMirrorHorizontal()
  {
	  Picture redMotor = new Picture("images/redMotorcycle.jpg");
	  redMotor.mirrorHorizontal();
	  redMotor.explore();
  }
  
  public static void testMirrorHorizontalBotToTop()
  {
	  Picture redMotor = new Picture("images/redMotorcycle.jpg");
	  redMotor.mirrorHorizontalBotToTop();
	  redMotor.explore();
  }
  
  public static void testMirrorDiagonal()
  {
	  Picture redMotor = new Picture("images/redMotorcycle.jpg");
	  redMotor.mirrorDiagonal();
	  redMotor.explore();
  }
  
  public static void testMirrorArms()
  {
    Picture snowman = new Picture("images/snowman.jpg");
    snowman.explore();
    snowman.mirrorArms();
    snowman.explore();
  }
  
  public static void testMirrorGull()
  {
    Picture seagull = new Picture("images/seagull.jpg");
    seagull.explore();
    seagull.mirrorGull();
    seagull.explore();
  }
  
  public static void testCopy()
  {
	  Picture flowerOne = new Picture("images/flower1.jpg");
	  flowerOne.copyWithBounds(flowerOne,0,0,0,50,0,75);
	  flowerOne.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    testZeroBlue();
    testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    testNegate();
    testGrayscale();
    testFixUnderwater();
    testMirrorVertical();
    testMirrorVerticalRightToLeft();
    testMirrorHorizontal();
    testMirrorHorizontalBotToTop();
    testMirrorTemple();
    testMirrorArms();
    testMirrorGull();
    testMirrorDiagonal();
    testCollage();
    testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}