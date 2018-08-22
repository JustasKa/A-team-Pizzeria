package lt.baltictalents.pizzeria;

enum Sauce {
    MILD("švelnus"), SPICY("aštrus"), MIX("miksas");

    Sauce(String description) {
        this.description = description;
    }

    private final String description;

    String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return description;
    }
}