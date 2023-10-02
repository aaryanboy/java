public class Solution{
    public boolean isPalendrone(int a){
        int b=a;
        int c=0;
         while(b!=0){
            c=c*10 +(b%10);
            b=b/10;

        }
        return c==a;
    }
    
    public void isArmstrong(int b){

        double c=b;
        int h=b;
        double a=0;
        double t;
        String f= Integer.toString(b);
        double d=f.length();
         while(h!=0.000){
            t=(h%10);
              a=a+ Math.pow(t,d);
            h=h/10;

                     }
            if (a==b) {
                System.out.println("ÿes");
        
                
               }else{
                 System.out.println("not ÿes");
               }
        }
      
    }
    
    


