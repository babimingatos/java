public class MyClass {
    
   static int num= 0; //Varivel de classe ou Atributo
    
    public static void main(String args[]) {
        
        System.out.println(num);
        somaMais3(5);
        System.out.println(num);
    }
    
    static void somaMais3 (int numero) {
        num=numero+=3; 
    }
    
    
}
