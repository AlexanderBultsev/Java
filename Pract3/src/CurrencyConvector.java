import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyConvector {
    Locale sourceLocale;
    Locale targetLocale;
    NumberFormat numberFormat;
    public CurrencyConvector(Locale sourceLocale, Locale targetLocale) {
        this.sourceLocale = sourceLocale;
        this.targetLocale = targetLocale;
        this.numberFormat = NumberFormat.getCurrencyInstance(targetLocale);
    }
    public void changeSourceLocale(Locale sourceLocale) {
        this.sourceLocale = sourceLocale;
    }

    public void changeTargetLocale(Locale targetLocale) {
        this.targetLocale = targetLocale;
        this.numberFormat = NumberFormat.getCurrencyInstance(targetLocale);
    }

    public String convect(double value) {
        switch (sourceLocale.toString()) {
            case "fr_FR":
                value *= 1.07;
                break;
            case "ja_JP":
                value *= 0.006792;
                break;
            case "en_US":
                value *= 1;
        }

        switch (targetLocale.toString()) {
            case "fr_FR":
                value /= 1.07;
                break;
            case "ja_JP":
                value /= 0.006792;
                break;
            case "en_US":
                value /= 1;
                break;
        }
        return numberFormat.format(value);
    }

    @Override
    public String toString() {
        return "CurrencyConvector{" +
                "sourceLocale=" + sourceLocale +
                ", targetLocale=" + targetLocale +
                '}';
    }

    public static void main(String[] args) {
        double value = 12.34;
        CurrencyConvector convector = new CurrencyConvector(Locale.FRANCE, Locale.US);
        System.out.println(convector);
        System.out.println(convector.convect(value));

        convector.changeSourceLocale(Locale.JAPAN);
        System.out.println(convector);
        System.out.println(convector.convect(value));

        convector.changeTargetLocale(Locale.FRANCE);
        System.out.println(convector);
        System.out.println(convector.convect(value));
    }
}
