package com.learningjava.wotapi.api.model.dto;

import com.learningjava.wotapi.api.model.RequestBase;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class PlayerSearchRequest extends RequestBase {
    @NotBlank(message = "Name is required")
    @Size(min = 3, message = "Name must be at least 3 characters long")
    private String name;

    public PlayerSearchRequest(String name, String region) {
        super(region);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
