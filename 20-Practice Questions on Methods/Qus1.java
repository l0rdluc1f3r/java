public class Qus1 {
    public  static void main(String[] args){
        multiplication(3);
    }
    static void multiplication(int n){
        for(int i=1;i<=10;i++){
        System.out.format("%d x %d = %d\n" , n,i,n*i);
        }
    }
}
