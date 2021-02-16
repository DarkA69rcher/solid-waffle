import java.util.Random;

public class Tests {
    static int p=10;
    public static void main(String[] args) {

        int[][] pole = new int[p][p];
        generazion(pole);
        sortirovka(pole);
        vozvrat(pole);
    }
    static void sortirovka(int[][] pole){
        for (int i=0;i<p;i++){
            for (int g=0;g<p;g++){
                if (pole[i][g]==9){
                   if(i!=p-1){
                       if (pole[i+1][g]==9){

                       }else {
                           pole[i+1][g]++;
                       }
                   }
                    if(i!=0){
                        if (pole[i-1][g]==9){

                        }else {
                            pole[i-1][g]++;
                        }
                    }
                    if(g!=p-1){
                        if (pole[i][g+1]==9){

                        }else {
                            pole[i][g+1]++;
                        }
                    }
                    if(g!=0){
                        if (pole[i][g-1]==9){

                        }else {
                            pole[i][g-1]++;
                        }
                    }
                    if(i!=p-1&&g!=p-1){
                        if (pole[i+1][g+1]==9){

                        }else {
                            pole[i+1][g+1]++;
                        }
                    }
                    if(i!=p-1&&g!=0){
                        if (pole[i+1][g-1]==9){

                        }else {
                            pole[i+1][g-1]++;
                        }
                    }
                    if(i!=0&&g!=p-1){
                        if (pole[i-1][g+1]==9){

                        }else {
                            pole[i-1][g+1]++;
                        }
                    }
                    if(i!=0&&g!=0){
                        if (pole[i-1][g-1]==9){

                        }else {
                            pole[i-1][g-1]++;
                        }
                    }
                }
            }
        }
    }
    static void generazion(int[][] pole){
        int random = 0;
        for (int i=0;i<p;i++){
            for (int g=0;g<p;g++){
                if (zapolnenie(random)==2||zapolnenie(random)==3){
                    pole[i][g]=9;
                }
            }
        }
    }
    static void vozvrat(int[][] pole){
        int random = 0;
        for (int i=0;i<p;i++){
            for (int g=0;g<p;g++){
                System.out.print(pole[i][g]);
                }
            System.out.println(" ");
            }
        }
    static int zapolnenie(int i){
        Random random = new Random();
        return i=random.nextInt(6);
    }
}
