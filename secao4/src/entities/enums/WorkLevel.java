package entities.enums;

public enum WorkLevel {

   JUNIOR(1),
   MID_LEVEL(2),
   SENIOR(3);

   private final int valor;

   WorkLevel(int valorOpcao){
       valor = valorOpcao;
   }
}
