import processing.core.PApplet;

public class Start extends PApplet{

    public static void main(String[] args) {
        PApplet.main("Start");
    }




int[] liste = {1,2,3,4,5,6,7,8,9,10};
    int pointer = 0;


    public void setup(){ }

    @Override
    public void keyPressed() {
        if(key == 'S'||key == 's'){
            shuffle(liste,0,20);
            pointer = 0;
            println(liste);
        }
    }

    @Override
    public void draw() {
        clear();
        display(0, liste);
        textAlign(CENTER);
        textSize(20);
        text("Shuffel on S \nLeft click for sorting" , width/2,100);

    }

    public void settings(){
        size(1500,1000);
    }
    public void display(int place, int[] liste){
        double value = liste[place];

        rect(place*60+400,height-100,50, (float) (-20*value));
        if (place<liste.length-1){
            display(++place,liste);
        }
    }
        public int[] shuffle(int[] liste,int c,int end){

int r1= (int) random(liste.length);
int r2= (int) random(liste.length);
        int cool1 = liste[r1];
        int cool2 = liste[r2];
        liste[r2]=cool1;
        liste[r1]=cool2;
        if(c<end){
            return shuffle(liste, c+1,end);
        }else
            return liste;
        }


    public static int findMin(int[] liste, int startIndex, int slutIndex) {
        int min;
        if (startIndex == slutIndex) {
            return startIndex;
        }else{
      min =  findMin(liste, startIndex+1, slutIndex);



            if (liste[min] > liste[startIndex]) {
                return startIndex;

            }else
            return min;
        }}



    public int[] swap(int[] liste, int pointer, int minPointer){


        println(minPointer);
        int cool1 = liste[pointer];
        int cool2 = liste[ minPointer];
        liste[minPointer]=cool1;
        liste[pointer]=cool2;

       return liste;
    }

    @Override
    public void mouseClicked() {
  liste= swap(liste,pointer, findMin(liste,pointer,liste.length-1));
  if(pointer<liste.length-1)
  pointer++;
    }
}
