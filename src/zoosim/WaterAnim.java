/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *
 * @author patri
 */
public class WaterAnim extends Animal implements ISwimmable {
    
    private boolean canBreathe;
    private boolean canSurface = true;
    

    /**
     * @return the canBreathe
     */
    public boolean isCanBreathe() {
        return canBreathe;
    }

    /**
     * @param canBreathe the canBreathe to set
     */
    public void setCanBreathe(boolean canBreathe) {
        this.canBreathe = canBreathe;
    }

    /**
     * @return the canSurface
     */
    @Override
    public boolean canSurface() {
        return canSurface;
    }

    /**
     * @param canSurface the canSurface to set
     */
    public void setCanSurface(boolean canSurface) {
        this.canSurface = canSurface;
    }
    
}
