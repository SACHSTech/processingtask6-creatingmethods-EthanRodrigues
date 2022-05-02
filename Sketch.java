import processing.core.PApplet;

/**
* A code that draws flowers and houses and prints the screen area using methods
* @author: Ethan Rodrigues
*/
public class Sketch extends PApplet {
	
  public void settings() {
    
   size(400, 400);
  }

  public void setup() {
    
   // background colour
   background(210, 255, 173);
    
   // Print the total screen area using the totalArea method
   System.out.println("The total screen area is:" + totalArea(400,400) + "pixels");
  }

  public void draw() {
    
    // draw flowers using integer values specefied in the brackets and the drawFlower method
    drawFlower(300, 300, 10);
    drawFlower(100, 100, 50);
    drawFlower(200, 200, 20);
    
    // draw houses using integer values specefied in the brackets and the drawHouse method
    drawHouse(100, 200, 30);
    drawHouse(300, 100, 200);
    drawHouse(60, 300, 100);
  }
  
  /**
  * Draws a flower on the screen
  *  
  * @param intFlowerX the x value location of the flower
  * @param intFlowerY the y value location of the flower
  * @param intSize the size of the flower
  * 
  */
  public void drawFlower(int intFlowerX, int intFlowerY, int intSize) {
    
    int intDistance = (intSize / 2);
    fill(50, 168, 141);
    ellipse(intFlowerX - intDistance, intFlowerY - intDistance, intSize, intSize);
    ellipse(intFlowerX + intDistance, intFlowerY - intDistance, intSize, intSize);
    ellipse(intFlowerX - intDistance, intFlowerY + intDistance, intSize, intSize);
    ellipse(intFlowerX + intDistance, intFlowerY + intDistance, intSize, intSize);
    fill(255, 183, 0);
    ellipse(intFlowerX, intFlowerY, intSize, intSize);
  }

  /**
  * Draws a house on the screen
  *  
  * @param intHouseX the x value location of the house
  * @param intHouseY the y value location of the house
  * @param intColour the colours of the house
  * 
  */
  public void drawHouse(int intHouseX, int intHouseY, int intColour) {
    
    fill(intColour);
    rect(intHouseX, intHouseY, 50, 50);
  
    fill(intColour - 100);
    triangle(intHouseX, intHouseY, intHouseX + 50, intHouseY , intHouseX + 25, intHouseY - 30);
  
    fill(intColour - 50);
    rect(intHouseX + 10, intHouseY + 30, 15, 20);
  }

  /**
  * Calculates the screen area based on values specefied in the method above
  *  
  * @param intHorizontal the x value location of the house
  * @param intHorizontal is the width of the screen
  * @param intVertical is the height of the screen
  * @return the total area of the screen
  * 
  */
  public int totalArea(int intHorizontal, int intVertical) {
    
    return intHorizontal * intVertical;
  }
  
}
  