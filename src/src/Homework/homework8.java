package src.Homework;

public class homework8 {
    public static void main(String[] args) {

    }
}

enum Color implements COLOR{
    red(255,0,0),blue(0,0,255),black(0,0,0),yellow(255,255,0),green(0,255,0);

    private int redValue;
    private int greenValue;
    private int blueValue;

    Color(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }


    @Override
    public void show() {

    }
}

interface COLOR{
    void show();
}