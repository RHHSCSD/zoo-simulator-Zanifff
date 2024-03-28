/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

//QUESTIONS
//the animal class would probably need to have more varibles (HP int, hiearchy int)
//add a method that once health or hunger is 0, delete animal
//expand animal class into predators and prey
//for predators, add a method that checks other animals and determines if touching another animal based on location and size
//if touching prey animal with a lesser heiarchy (cant have cats eating fully grown cows), start filling hunger
//add same checking method for prey
//if touching predator animal, start decreasing health
//if touching plant object, delete plant object and increase hunger
//omnivores just do both



/**
 *
 * @author patri
 */
public class Zoo {
    private Animal animalRoster[] = new Animal[1]; 

    /**
     * @return the animalRoster
     */
    public Animal[] getAnimalRoster() {
        return animalRoster;
    }

    /**
     * @param animalRoster the animalRoster to set
     */
    public void setAnimalRoster(Animal[] animalRoster) {
        this.animalRoster = animalRoster;
    }
    
    /**
     * @param newAnimal the new animal 
     */
    public void addAnimal(Animal newAnimal){
        Animal newArray[] = new Animal[animalRoster.length]; // makes +1 length dummy array
        for(int i = 0; i < animalRoster.length; i++) {
           newArray[i] = animalRoster[i]; // copies array over
        }
        newArray[animalRoster.length] = newAnimal; // adds new animal
        animalRoster = newArray;
    }
    
    /**
     * @param index the index of animalRoster to set/replace
     * @param newAnimal the animal replacing
     */
    public void setAnimalIndex(int index, Animal newAnimal){
        animalRoster[index] = newAnimal;
    }
    
     /**
     * feeds all animals
     */
    public void feedAll(){
        for (Animal i : animalRoster) {
           i.eat();
        }
    }
    
    /**
     * rests all animals
     */
    public void restAll(){
        for (Animal i : animalRoster) {
           i.sleep();
        }
    }
    
    /**
     * moves all animals
     */
    public void moveAll(){
        for (Animal i : animalRoster) {
           i.move();
        }
    }
    
            
   
    /**
     * moves all animals
     */
    public void getAnimalInfo(){
        for (Animal i : animalRoster) {
            System.out.print("" + i.getID() + i.getName() + i.getSpecies() + i.getAge() + i.isMale() + i.getxCoord() + i.getyCoord() + i.getSize() + i.getSpeed() + i.getDirection() + i.getHunger() + i.getFatigue() + i.getImage() + i.getSound() );
        }
    }
}
