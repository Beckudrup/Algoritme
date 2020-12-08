import processing.core.PApplet;

public class Start extends PApplet{

    public static void main(String[] args) {
        PApplet.main("Start");
    }




int[] liste = {3,78,1,14,9,2,8,25,10,6};
int pointer = 0;


    public void setup(){ }

    @Override
    public void draw() {
        clear();
        display(0, liste);

    }

    public void settings(){
        size(1500,1000);
    }
    public void display(int place, int[] liste){
        double value = liste[place];

        rect(place*10+20,height,10, (float) (-20*value));
        if (place<liste.length-1){
            display(++place,liste);
        }
    }
   // public void shuffle(int[] liste){

        //if (){
          //  shuffle();
        //}
  //  }

    public static int min(int[] elements, int index) {

        if (index == elements.length - 1) {
            return elements[index];
        }else{

        int val = min(elements, index + 1);

        if (elements[index] < val)
            return elements[index];
        else
            return val;}
    }


    public int[] swap(int[] liste, int pointer, double minPointer){
        int cool1 = liste[pointer];
        int cool2 = liste[(int) minPointer];
        liste[(int) minPointer]=cool1;
        liste[pointer]=cool2;

       return liste;
    }

    @Override
    public void mouseClicked() {
        println(pointer);
       swap(liste,pointer,min(liste,pointer));
        pointer++;
        if(pointer==liste.length)
            pointer=0;
    }
}
