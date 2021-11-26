package oop.inheritance.ingenico;

public class IngenicoPrinter {
    private static volatile IngenicoPrinter printer;

    private IngenicoPrinter(){

    }

    public static IngenicoPrinter getPrinter(){
        if(printer == null){
            synchronized (IngenicoPrinter.class){
                if(printer == null){
                    printer = new IngenicoPrinter();
                }
            }
        }
        return printer;
    }

    /**
     * Prints a message on the current line at the specified horizontal position
     *
     * @param x       horizontal offset
     * @param message Message to be printed
     */
    public void print(int x, String message) {

    }

    /**
     * Add a line break to the paper
     */
    public void lineFeed() {
    }

}
