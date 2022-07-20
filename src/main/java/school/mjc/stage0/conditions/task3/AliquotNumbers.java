package school.mjc.stage0.conditions.task3;

public class AliquotNumbers {
    public void isFirstAliquot(int first, int second) {
        first = 5;
        second = 25;


        if (second % first == 0) {

            System.out.println("Aliquot");
        } else {
            System.out.println("Not Aliquot");
        }

    }
}
