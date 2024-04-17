package lenguajes;

public class Numero {
    int num;            

    public Numero() {
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
     public void suma(){
         if(num %3==0 && num %5!=0){
             System.out.println("Fizz!");
         }else{
             if(num %3!=0 && num %5==0){
                 System.out.println("Buzz!");
             }else{
                 if(num %3==0 && num %5==0){
                     System.out.println("FizzBuzz!");
                 }else{
                     System.out.println("..");
                 }
             }
         }
     }
}
