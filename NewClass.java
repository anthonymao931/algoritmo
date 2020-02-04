
public class NewClass {
    public static void main(String[] args){
        int contador =0;
        for(int i=1; i<100000000; i+=2){
            contador=contador+i;
        }
        System.out.println(contador);
    }
}
