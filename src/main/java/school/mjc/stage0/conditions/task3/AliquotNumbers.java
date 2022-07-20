package school.mjc.stage0.conditions.task3;

public class AliquotNumbers {
    public static void isFirstAliquot(int first, int second) {


        if (second % first == 0) {

            System.out.println("Aliquot");
        } else {
            System.out.println("Not Aliquot");
        }

    }

    public static void main(String[] args){
        isFirstAliquot(5,25);
        isFirstAliquot(25,5);


    }
}
