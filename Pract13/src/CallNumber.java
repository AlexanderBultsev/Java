public class CallNumber {
    StringBuffer callNumber;

    public CallNumber(String callNumber) {
        this.callNumber = new StringBuffer(callNumber);
    }

    public boolean format() {
        if (callNumber.charAt(0) == '+' && callNumber.length() > 11) {
            StringBuffer formattedCallNumber = new StringBuffer();
            int fNI = callNumber.length() - 10;
            formattedCallNumber.append("+").append(callNumber.substring(1, fNI)).append(" ").append(callNumber.substring(fNI, fNI + 3)).append("-").append(callNumber.substring(fNI + 3, fNI + 6)).append("-").append(callNumber.substring(fNI + 6, fNI + 10));
            callNumber = formattedCallNumber;
            return true;
        }
        else if (callNumber.charAt(0) == '8' && callNumber.length() == 11) {
            StringBuffer formattedCallNumber = new StringBuffer();
            formattedCallNumber.append("+7 ").append(callNumber.substring(1, 4)).append("-").append(callNumber.substring(4, 7)).append("-").append(callNumber.substring(7, 11));
            callNumber = formattedCallNumber;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "callNumber: " + callNumber;
    }

    public static void main(String[] args) {
        CallNumber n1 = new CallNumber("89161362244");
        System.out.println("\n" + n1);
        System.out.println("Отформатировано: " + n1.format());
        System.out.println(n1);

        CallNumber n2 = new CallNumber("+1239161362244");
        System.out.println("\n" + n2);
        System.out.println("Отформатировано: " + n2.format());
        System.out.println(n2);

        CallNumber n3 = new CallNumber("12456");
        System.out.println("\n" + n3);
        System.out.println("Отформатировано: " + n3.format());
        System.out.println(n3);

        CallNumber n4 = new CallNumber("+99942");
        System.out.println("\n" + n4);
        System.out.println("Отформатировано: " + n3.format());
        System.out.println(n4);
    }
}
