public class Laboratorio2 {
    public static void main(String[] args){
        boolean condition = true;
        while(condition){
            switch(Vista.menuDeOpciones()){
                case 1:
                    System.out.println("Ingresaste la opcion 1 \n\n");
                case 9:
                    condition = false;
            };
        }
    }
}
