public class Lasagna {
    private final int _cookTime = 40;
    public int expectedMinutesInOven() {
        return _cookTime;
    }

    public int remainingMinutesInOven(int elapsed) {
        return expectedMinutesInOven() - elapsed;
    }

    public int preparationTimeInMinutes(int layers) {
        return layers * 2;
    }

    public int totalTimeInMinutes(int layers, int elapsed) {
        return preparationTimeInMinutes(layers) + elapsed;
    }
}
