package spaceinvadersProject.playground;

import spaceinvadersProject.controller.FallingStarController;

import java.awt.Color;
import java.awt.Graphics2D;

import javashooter.gameobjects.FallingStar;
import javashooter.gameobjects.GameObject;


/**
 * Dummy SpaceInvaders Level.
 *
 */
public class Level1 extends SpaceInvadersLevel {

  public Level1() {
    super();
  }

  
  public String getName() {
    return "Level1" ;
  }



  // kleiner Tipp!
  @Override
  protected String getStartupMessage() {
    return "Get ready for level 1!";
  }
  

}
