public class Lasagna {
    public static int expectedMinutesInOven() {
        return 40;
    }

    public static int remainingMinutesInOven(int actualMinutes) {
        actualMinutes = expectedMinutesInOven();
        return actualMinutes;
    }

    public static int preparationTimeInMinutes(int numberOfLayers) {
        return numberOfLayers;
    }

    public static int totalTimeInMinutes(int actualMinutes, int numberOfLayers) {
        return remainingMinutesInOven(actualMinutes) + preparationTimeInMinutes(numberOfLayers);
    }
}
