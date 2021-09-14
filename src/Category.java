public enum Category {
    
    FOUNDATION("FDN"), LIPSTICK("LIP"), NOT_APPLICABLE("N/A");

    private String abbreviation;

    Category(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }
}
