package modelo;

public class Array {

   // private int[] array = new int[50];


    public int[] preencheArray(){
        int [] array = new int[50];

        for (int i = 0; i < 50 ;i++){
            array[i] = i + 10;
        }
        return array;
    }


//    public void preencheArray(){
//        for (int i = 0; i < 50 ;i++){
//           this.array[i] = i + 10;
//     }
//    }

    public void imprimeArray(int[] array){

        for (int i = 0; i < 50; i++)
            System.out.println( "Posição " + i + ": " + array[i]);
    }
}
