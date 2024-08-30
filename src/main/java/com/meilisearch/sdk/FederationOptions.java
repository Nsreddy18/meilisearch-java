package com.meilisearch.sdk;

import java.util.HashMap;
import java.util.Map;
import lombok.ToString;

@ToString
public class FederationOptions {

    private Double weight = null;

    public FederationOptions setWeight(Double weight) {
        this.weight = weight;
        return this;
    }

    public Map<String, Double> toMap() {
        Map<String, Double> optionsMap = new HashMap<>();
        if (weight != null) {
            optionsMap.put("weight", weight);
        }
        return optionsMap;
    }
}
