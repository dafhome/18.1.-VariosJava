public class CaracterresMinusculas {
    public static void main(String[] args) throws Exception {
        for (char x = 'A'; x<='z'; x++){
            if(x <= 'Z'|| x>='a'){
                System.out.print(x+" ");
            }
        }
        System.out.println();
    }
}

