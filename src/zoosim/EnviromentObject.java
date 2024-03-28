/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *
 * @author patri
 */
public class EnviromentObject implements IObject {
    
    private int id;
    private int type; //1 is tree, 2 is rock, 3 is food, etc
    private int xCoord;
    private int yCoord;
    private int size;
    private int direction;
    private Image image;
    
    @Override
    public void turn(int degrees){
        setDirection(getDirection() + degrees);
        if(getDirection() >= 360){ //keeping the numbers nice by finding the smallest equivalent angle
            setDirection(getDirection() - 360);
        } else if(getDirection() <= -360){ // same thing but on the negatives
            setDirection(getDirection() + 360);
        }
    }

    /**
     * wowie mystery method
     * @param x
     * @param y
     */
    @Override
    public void place(int x, int y) {
        //???
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    
    
    /**
     * @return the xCoord
     */
    public int getxCoord() {
        return xCoord;
    }

    /**
     * @param xCoord the xCoord to set
     */
    public void setxCoord(int xCoord) {
        this.xCoord = xCoord;
    }

    /**
     * @return the yCoord
     */
    public int getyCoord() {
        return yCoord;
    }

    /**
     * @param yCoord the yCoord to set
     */
    public void setyCoord(int yCoord) {
        this.yCoord = yCoord;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * @return the direction
     */
    public int getDirection() {
        return direction;
    }

    /**
     * @param direction the direction to set
     */
    public void setDirection(int direction) {
        this.direction = direction;
    }

    /**
     * @return the image
     */
    public Image getImage() {
        return image;
    }

    /**
     * @param image the image to set
     */
    public void setImage(Image image) {
        this.image = image;
    }

    /**
     * @return the type
     */
    public int getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(int type) {
        this.type = type;
    }
    
}
