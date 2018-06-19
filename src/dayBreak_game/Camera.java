/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dayBreak_game;

/**
 *
 * @author watsa9604
 */
public class Camera {

    protected float x, y;
    
    public Camera(float x, float y){
        this.x = x;
        this.y = y;
    }
    public void setX(float x){
        this.x = x;
    }
    public void setY(float y){
        this.y = y;
    }
    
    public int getX(){
        return (int)x;
    }

    public int getY(){
        return (int)y;    
    }
}
