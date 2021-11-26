package oop.inheritance.ingenico;

public class IngenicoKeyboard {
    private static volatile IngenicoKeyboard keyboard;

    private IngenicoKeyboard(){

    }

    public static IngenicoKeyboard getKeyboard(){
        if(keyboard == null){
            synchronized (IngenicoKeyboard.class){
                if(keyboard == null){
                    keyboard = new IngenicoKeyboard();
                }
            }
        }
        return keyboard;
    }

    /**
     * @return key pressed
     */
    public String get() {
        return "Key pressed";
    }
}
