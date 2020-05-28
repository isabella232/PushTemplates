package com.clevertap.pushtemplates;

enum TemplateType {

    BASIC("pt_basic"),
    AUTO_CAROUSEL("pt_carousel"),
    MANUAL_CAROUSEL("pt_manual_carousel"),
    RATING("pt_rating"),
    FIVE_ICONS("pt_five_icons"),
    PRODUCT_DISPLAY("pt_product_display"),
    TIMER("pt_timer"),
    INPUT_BOX("pt_input");


    private final String templateType;

    TemplateType(String type) {
        this.templateType = type;
    }

    static TemplateType fromString(String type){
        switch (type){
            case "pt_basic" : return BASIC;
            case "pt_carousel" : return AUTO_CAROUSEL;
            case "pt_manual_carousel" : return MANUAL_CAROUSEL;
            case "pt_rating" : return RATING;
            case "pt_five_icons" : return FIVE_ICONS;
            case "pt_product_display" : return PRODUCT_DISPLAY;
            case "pt_timer" : return TIMER;
            case "pt_input" : return INPUT_BOX;
            default: return null;
        }
    }


    @SuppressWarnings("NullableProblems")
    @Override
    public String toString() {
        return templateType;
    }
}
