import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.printf("inserisci la quantità di numeri che vuoi inserire");

        int dim = scanner.nextInt();
        int[] array= new int[dim];

        array = inserimento(scanner,array);

        array = ordinamento(array);

        stampaArray(array);

    }

    private static int[] inserimento(Scanner scanner,int[] array){
        System.out.println("inserisci i numeri");
        for(int i=0;i< array.length;i++){
            int temp;
            do {
                temp = scanner.nextInt();
                if (0 < temp || temp < 30) {
                    array[i] = temp;
                }else{
                    System.out.println("numero non valido reinserisci");
                }
            }while(temp<0||temp>30);

        }
        return array;
    }
    private static int[] ordinamento(int[] array){
        for(int i=0;i< array.length;i++){
            for(int k=0;k< array.length;k++){
                if(array[i]<array[k]&&array[i]%2==0&&array[k]%2==0){
                    int temp=array[k];
                    array[k]=array[i];
                    array[i]=temp;
                }
            }
        }
        return array;
    }
    private static void stampaArray (int[] array){
        for(int i=0;i< array.length;i++){
            System.out.println(array[i]);
        }
    }
}