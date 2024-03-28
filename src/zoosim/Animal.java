/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *
 * @author patrick
 */
public class Animal implements IEntity {
    private int ID;
    private String name;
    private String species;
    private boolean male;
    private int age;
    private int xCoord;
    private int yCoord;
    private int size;
    private double speed; //has to actually modify between 0 and 10
    private int direction; // in whole degrees
    private double hunger;  // max 100
    private double fatigue; // max 100
    private Image image;
    private String sound;
    
    // getters, setters ----------------------------------------------------
    
    /**
     * @return the ID
     */
    public int getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the species
     */
    public String getSpecies() {
        return species;
    }

    /**
     * @param species the species to set
     */
    public void setSpecies(String species) {
        this.species = species;
    }

    /**
     * @return the male
     */
    public boolean isMale() {
        return male;
    }

    /**
     * @param male the male to set
     */
    public void setMale(boolean male) {
        this.male = male;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
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
     * @return the speed
     */
    public double getSpeed() {
        return speed;
    }

    /**
     * @param speed the speed to set
     */
    public void setSpeed(double speed) {
        this.speed = speed;
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
     * @return the hunger
     */
    public double getHunger() {
        return hunger;
    }

    /**
     * @param hunger the hunger to set
     */
    public void setHunger(double hunger) {
        this.hunger = hunger;
    }

    /**
     * @return the fatigue
     */
    public double getFatigue() {
        return fatigue;
    }

    /**
     * @param fatigue the fatigue to set
     */
    public void setFatigue(double fatigue) {
        this.fatigue = fatigue;
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
    public void Image(Image image) {
        this.image = image;
    }

    /**
     * @return the sound
     */
    public String getSound() {
        return sound;
    }

    /**
     * @param sound the sound to set
     */
    public void setSound(String sound) {
        this.sound = sound;
    }
    
    // actual methods --------------------------------------------------
    /**
     * Prints out sound of animal
     */
    @Override
    public void makeSound() {
        System.out.println(getSound());
    }
    
    /**
     * moves the animals coordinates based on its direction
     */
    @Override
    public void move() {
        double radians = ((double)(getDirection()) * Math.PI / 180) ;
        int moveX;
        int moveY;
        moveX = (int) (Math.cos(radians) * getSpeed());
        moveY = (int) (Math.sin(radians) * getSpeed());
        setxCoord(getxCoord() + moveX);
        setyCoord(getyCoord() + moveY);
        //for testing
        System.out.println("X: moved by " + moveX + " to " + getxCoord());
        System.out.println("Y: moved by " + moveY + " to " + getyCoord());
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
     * resets animals hunger to full
     */
    @Override
    public void eat(){
        setHunger(100.0);
        System.out.println(getName() + " hunger restored to full");
    }
    
    /**
     * resets animals fatigue to full
     */
    @Override
    public void sleep(){
        setFatigue(100.0);
        System.out.println(getName() + " fatigue restored to full");
    }
    /**
     * turns the animal anticlockwise
     * @param degrees the amount of degrees to turn if positive
     */
    @Override
    public void turn(int degrees){
        setDirection(getDirection() + degrees);
        if(getDirection() >= 360){ //keeping the numbers nice by finding the smallest equivalent angle
            setDirection(getDirection() - 360);
        } else if(getDirection() <= -360){ // same thing but on the negatives
            setDirection(getDirection() + 360);
        }
    }
    
}
