public class op {
    public static void main(String[] args){
        Runnable a= new Threat1();
        Thread al = new Thread(a);
        al.start();
        Runnable b= new Threat2();
        Thread alv = new Thread(b);
        alv.start();
    }
}
