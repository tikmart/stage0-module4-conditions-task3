package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public static void isEnglishSymbol(char symbol) {

        
        if (symbol == 'a' || symbol == 'b' || symbol == 'c' || symbol == 'd' || symbol == 'e' || symbol == 'f' 
                || symbol == 'g' || symbol == 'h' || symbol == 'i' || symbol == 'j' || symbol == 'k' || 
                symbol == 'l' || symbol == 'm' || symbol == 'n' || symbol == 'o' || symbol == 'p' || symbol == 'q' ||
                symbol == 'q' || symbol == 'r' || symbol == 's' || symbol == 't' || symbol == 'u' ||
                symbol == 'v' || symbol == 'x' || symbol == 'y' || symbol == 'z'){
            System.out.println("English");
        } else if (symbol == 'A' || symbol == 'B' || symbol == 'C' || symbol == 'D' || symbol == 'E' || symbol == 'F'
                || symbol == 'G' || symbol == 'H' || symbol == 'I' || symbol == 'J' || symbol == 'K' ||
                symbol == 'L' || symbol == 'M' || symbol == 'N' || symbol == 'O' || symbol == 'P' || symbol == 'Q' ||
                symbol == 'R' || symbol == 'S' || symbol == 'T' || symbol == 'U' || symbol == 'V' ||
                symbol == 'X' || symbol == 'Y' || symbol == 'Z' ) {

            System.out.println("English");
        }else {
            System.out.println("Non English");
        }
    }

    public static void main(String[] args) {
        isEnglishSymbol('r');
        isEnglishSymbol('R');
        isEnglishSymbol('Ł');
        isEnglishSymbol('ł');

    }
}
