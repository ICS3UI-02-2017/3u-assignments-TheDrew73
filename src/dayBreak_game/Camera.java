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

    private float x, y;
    
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
    
    public float getX(){
        return x;
    }
    public float getY(){
        return y;    
    }
}
