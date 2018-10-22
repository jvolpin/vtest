package Utils.PageUtils;

public enum Purposes {
    ACQUISITION("Acquisition finance"),
    CASHFLOW("Cash flow/working capital"),
    PROPERTY_DEVELOPMENT("Commercial bridging"),
    PROPERTY_PURCHASE("Property purchase");

    private String property;

    Purposes(String property) {
        this.property = property;
    }

    public String getProperty() {
        return property;
    }

}
