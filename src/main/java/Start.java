import processing.core.PApplet;

public class Start extends PApplet{

    public static void main(String[] args) {
        PApplet.main("Start");
    }




int[] liste = {7,2,5,10,6,4,9,1,3,8};
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
        int value = liste[place];

        rect(place*10+20,height,10,-20*value);
        if (place<liste.length-1){
            display(++place,liste);
        }
    }
   // public void shuffle(int[] liste){

        //if (){
          //  shuffle();
        //}
  //  }

    public int findMin(int[] liste,int pointer) {



        if(pointer==liste.length-1){
            return liste[pointer];
        }
        int min = findMin(liste,pointer+1);

            if(min>liste[pointer]){
                return liste[pointer];

        }else
        return min;
    }


    public int[] swap(int[] liste,int pointer,int minPointer){
        int[] domoMrPlonty = liste;
        int cool1 = liste[pointer];
        int cool2 = liste[minPointer];
        domoMrPlonty[pointer]=cool2;
        domoMrPlonty[minPointer]=cool1;
       return domoMrPlonty;
    }

    @Override
    public void mouseClicked() {
       swap(liste,pointer,findMin(liste,pointer));
        pointer++;
        if(pointer==10)
            pointer=0;
    }
}
