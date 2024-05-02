package lenguajes;

public class Numero {
    int numero;            

    public Numero() {
    }

    public int getNum() {
        return numero;
    }

    public void setNum(int num) {
        this.numero = num;
    }
     public void suma(){
         if(numero %3==0 && numero %5!=0){
             System.out.println("Fizz!");
         }else{
             if(numero %3!=0 && numero %5==0){
                 System.out.println("Buzz!");
             }else{
                 if(numero %3==0 && numero %5==0){
                     System.out.println("FizzBuzz!");
                 }else{
                     System.out.println("..");
                 }
             }
         }
     }
}
