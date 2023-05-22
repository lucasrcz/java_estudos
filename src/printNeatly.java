public class printNeatly {
    public static void main(String[] args) {
        int [] vetor = {30,40,70,80,90,100,120};
        printNumbers(vetor);

    }
    public static void printNumbers (int [] vetor){
        for(int i = 0 ; i<vetor.length ; i++){
            if(i != vetor.length - 1){
                System.out.print(vetor[i] + ",");
            }else{
                System.out.print(vetor[i]);
            }
        }
    }
}
