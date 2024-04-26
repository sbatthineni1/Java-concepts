public enum DaysOfWeek {
    sunday(8), monday(1), tuesday(2), wednesday(3), thursday(4), friday(9), saturday(10);
    final int dayRating;

    DaysOfWeek(int value) {
        this.dayRating = value;
    }
}
