package Fundamento; 
  //Variables o metodos de clases son static
  //Variables o metodos de instancia no son static.
  //Para acceder a un metodo o variable static es : NombreClass.Metodo
  // o NombreClase.Variable

   class CuentaBancaria{
      public int saldo;
       public static int numero=0;
    }
      
    public class variables {
      
        public static void sumarSaldo(CuentaBancaria cta){
             cta.saldo +=10;
        }
         
        public static void sumarSaldo(int saldo){
            saldo +=10;
        }   
        
        //Crear minio 10 objeto de CuebtaBancaria, probar y probar 
    public static void main(String[] args) {
        
        CuentaBancaria ct1= new CuentaBancaria();
        CuentaBancaria ct2=ct1;
        ct1.saldo=1000;
        
        
        sumarSaldo(ct1);
        sumarSaldo(ct2);
        System.out.println("ct1:" +ct1.saldo);//imprime 1020
        System.out.println("ct2:"+ct2.saldo);//imprime 1020
        
        ct2.saldo=250;
        CuentaBancaria ct3 = ct2;
        sumarSaldo(ct3);
        System.out.println("ct3:" +ct3.saldo);//imprime 260
        
        ct3.saldo=1280;
        CuentaBancaria ct4 = ct3;
        sumarSaldo (ct4);
        System.out.println("ct4:" +ct4.saldo); //imprime 1290
        
        CuentaBancaria ct5 = ct4;
        sumarSaldo (ct5);
        System.out.println("ct5:" +ct5.saldo);//imprime 1300
        
        CuentaBancaria ct6 = new CuentaBancaria();
        ct6.saldo=120;
        CuentaBancaria ct7 = ct2;
        ct7.saldo=1220;
        sumarSaldo (ct6);
        sumarSaldo (ct7);
        System.out.println("ct6:" +ct6.saldo);//imprime 130
        System.out.println("ct7:"+ct7.saldo);//imprime 1230
        
        CuentaBancaria ct8 = ct3;
        sumarSaldo (ct8);
        CuentaBancaria ct9 = ct6;
        sumarSaldo (ct9);
        CuentaBancaria ct10 = new CuentaBancaria();
        ct10.saldo=0;
        sumarSaldo (10);
        System.out.println("ct8:" +ct8.saldo); //imprime 1240
        System.out.println("ct9:" +ct9.saldo); // imprime  140
        System.out.println("ct10:" +ct10.saldo); //imprime 0
 
    }
    
}
