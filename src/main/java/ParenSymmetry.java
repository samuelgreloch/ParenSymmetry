import java.util.Arrays;
import java.util.List;

public class ParenSymmetry {

    public Boolean isBalanced(String s) {
        return null;

       // click command b on tet when you go to test
    }

    private void checkFile(String filename) {
        // open file named filename

        // for each line in the file
            // read the line
            // print whether or not the line's parenthesis are balanced

        // CLOSE the file
    }

    public static void main(String[] args) {
        ParenSymmetry ps = new ParenSymmetry();

        Boolean b0 = ps.isBalanced("()");
        printResult(b0, true);

        String[] falseStrings = {"(", "((", ")", "", "(()())((())))"};
        Boolean falses = true;
        for (String strToTest : falseStrings) {
            falses = ps.isBalanced(strToTest);
        }
        printResult(falses, false);

        String[] trueStrings = {"()", "(())", "(((())))", "", "(()())((()))", "(   )", "( () ( ) )"};
        Boolean trues = false;
        for (String strToTest : trueStrings) {
            trues = ps.isBalanced(strToTest);
        }
        printResult(trues, true);

    }

    private static void printResult(Boolean b0, boolean b) {
        if (b0 == null) {
            System.out.println("Null Failure");
            return;
        }
        if (b0 == b) {
            System.out.println("Success");
        } else {
            System.out.println("Failure");
        }
    }




}

//para -1
// theses -1
//tack number of para track number these
//if the differnce goes negative we know we are unbalanced
// for each c in string -s
// if ( == parens++
// if ) === c, thesis++
// if (thesis -parens > 0)(thesis > parens) return false
//empty if s == "" return false //known as a short circuit case
// func is-balanced2(s)
//if s=="" return false
//parens = 0 thesis = 0
// if parens == thesis return ture
//else return fasle
//create a buffer reader