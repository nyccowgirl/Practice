public enum Inventory {

    IN_STOCK("AVAIL"), OUT_OF_STOCK("OUT"), DISCONTINUED("DISC"),
    NOT_APPLICABLE("N/A");

    private String abbreviation;

    Inventory(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }
}
