package oop.inheritance.ingenico;

public class IngenicoDisplay {
    private static volatile IngenicoDisplay display;

    private IngenicoDisplay(){

    }

    public static IngenicoDisplay getDisplay(){
        if(display == null){
            synchronized (IngenicoDisplay.class){
                if(display == null){
                    display = new IngenicoDisplay();
                }
            }
        }
        return display;
    }

    /**
     * Prints a message to specied position
     *
     * @param x       horizontal position
     * @param y       vertical position
     * @param message message to be printed
     */
    public void showMessage(int x, int y, String message) {
    }

    /**
     * Clears the screen
     */
    public void clear() {

    }
}
