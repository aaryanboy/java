public class Aeroplane extends Fmachine {
  int code;
  String name;
  int capacity;  
  public void getdata(int code, String name, int capacity){
    this.code=code;
    this.name=name;
    this.capacity=capacity;
  }
  public void putdata(){
    System.out.println("code is "+code);
    System.out.println("name is "+name);
    System.out.println("capacity is "+capacity);
  }
    
}
