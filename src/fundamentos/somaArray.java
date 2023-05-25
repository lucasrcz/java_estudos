package fundamentos;
public class somaArray {
    public static void main(String[] args) {
        int [] primeiroArray = {10,30,40,50};
        int total = sumOfNumbersInArray(primeiroArray);
        System.out.println(total);
    }
    public static int sumOfNumbersInArray(int [] vetor){
        int sum = 0;
        for(int numero : vetor){
            sum += numero ;
        }
        return sum;
    }
    
}
