public class ContainersDouble {
    public static void main(String[] args) {
        double a = 1.12;
        Double aDouble = Double.valueOf(a);

        String b = "2.34";
        Double bDouble = Double.parseDouble(b);

        Double cDouble = 3.45;
        boolean bl = (cDouble != 0);
        byte bt = cDouble.byteValue();
        char cr = cDouble.toString().charAt(0);
        double db = cDouble.doubleValue();
        float ft = cDouble.floatValue();
        int in = cDouble.intValue();
        long lg = cDouble.longValue();
        short st = cDouble.shortValue();
        System.out.println("boolean: " + bl +
        "\nbyte " + bt +
        "\nchar " + cr +
        "\ndouble " + db +
        "\nfloat " + ft +
        "\nint " + in +
        "\nlong " + lg +
        "\nshort " + st);

        String sDouble = "Doubles: " + Double.toString(aDouble) + " " + bDouble.toString() + " " + cDouble;
        System.out.println(sDouble);
    }
}
