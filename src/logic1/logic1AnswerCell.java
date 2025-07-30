package logic1;

public class logic1AnswerCell {
    public static boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (!isAsleep) {
            if (isMorning) {
                if (isMom) {
                    return true;
                }
            } else if (!isMorning) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out .println(answerCell(true, true, true));
        System.out .println(answerCell(true, true, false));
        System.out .println(answerCell(true, false, true));
        System.out .println(answerCell(false, true, true));
        System.out .println(answerCell(false, false, false));
        System.out .println(answerCell(false, false, true));
        System.out .println(answerCell(false, true, false));
        System.out .println(answerCell(true, false, false));
        System.out .println(answerCell(true, true, true));

    }
}
