package Convertable;

public class TemperatureConvertor implements Convertable {
    double temperature;
    String measureUnit;

    public TemperatureConvertor(double temperature, String measureUnit) {
        this.temperature = temperature;
        switch (measureUnit) {
            case ("K"), ("F"), ("C"):
                this.measureUnit = measureUnit;
                break;
            default:
                System.out.println("Неверная целевая единица измерения");
        }

    }

    @Override
    public void convert(String measureUnit) {
        switch (this.measureUnit) {
            case ("K") :
                temperature = temperature - 273;
                break;
            case ("F") :
                temperature = (temperature - 32) / 1.8;
                break;
            case ("C") :
                break;
            default:
                System.out.println("Неверная исходная единица измерения");
        }
        switch (measureUnit) {
            case ("K") :
                this.temperature = temperature + 273;
                this.measureUnit = measureUnit;
                break;
            case ("F"):
                this.temperature = temperature * 1.8 + 32;
                this.measureUnit = measureUnit;
                break;
            case ("C"):
                this.measureUnit = measureUnit;
                break;
            default:
                System.out.println("Неверная целевая единица измерения");
        }
    }

    @Override
    public String toString() {
        return "TemperatureConvertor{" +
                "temperature=" + temperature +
                ", measureUnit='" + measureUnit + '\'' +
                '}';
    }

    public static void main(String[] args) {
        TemperatureConvertor tc = new TemperatureConvertor(100, "C");
        System.out.println(tc);
        tc.convert("F");
        System.out.println(tc);
        tc.convert("K");
        System.out.println(tc);
    }
}
