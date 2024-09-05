package application;

public class ForEach {
    public static void main(String[] args) {

        String[] vect =  new String[] {"Guilherme", "Silvana", "Annaáthaly"};
// Estrututa com for normal
        for (int i = 0; i < vect.length; i++){
            System.out.println(vect[i]);
        }

        System.out.println("---------------------------");
// Estrutura com For each
        for (String obj: vect) {
            System.out.println(obj);
        }
    }
}
