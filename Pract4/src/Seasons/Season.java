package Seasons;

public enum Season {
    WINTER(-7),
    AUTUMN(8),
    SUMMER(24) {
        @Override
        public String getDescription() {
            return "Теплое время года";
        }
    },
    SPRING(12);

    private final double averageTemperature;

    private Season(double averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public String getDescription() {
        return "Холодное время года";
    }

    public static void main(String[] args) {
        for (Season season : Season.values()) {
            System.out.println(season + ": " + season.getDescription() + " Средняя температура: " + season.averageTemperature);
        }
    }
}
