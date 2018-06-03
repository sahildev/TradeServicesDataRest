package com.example.ts.TradeServicesDataRest.domain;

public enum Region {
    Central("Central"), Southern("Southern"), Northern("Northern"), Varies("Varies");
    private String label;
    private Region(String label) {
        this.label = label;
    }
    public static Region findByLabel(String byLabel) {
        for(Region r: Region.values()) {
            if (r.label.equalsIgnoreCase(byLabel))
                return r;
        }
        return null;
    }
}
