package com.meilisearch.sdk;

import java.util.HashMap;
import java.util.Map;

public class MultiSearchFederation {
    private Integer limit = null;
    private Integer offset = null;

    public MultiSearchFederation setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    public MultiSearchFederation setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    public Map<String, Integer> toMap() {
        Map<String, Integer> optionsMap = new HashMap<>();
        if (limit != null) {
            optionsMap.put("limit", limit);
        }
        if (offset != null) {
            optionsMap.put("offset", offset);
        }
        return optionsMap;
    }
}
