import processing.core.PApplet;

public class main extends PApplet{

    public static void main(String[] args) {
        PApplet.main("main");
    }

int[] liste = {7,2,10,5,6,4,9,1,3,8};

    public void setup(){
        display(0, liste);

    }
    public void settings(){
        size(1500,1000);
    }
    public void display(int place, int[] liste){
        int value = liste[place];

        rect(place*10+20,height,10,-20*value);
        if (place<liste.length-1){
            display(++place,liste);
        }
    }
    public void shuffle(int[] liste){
        
        if (){
            shuffle();
        }
    }





}
