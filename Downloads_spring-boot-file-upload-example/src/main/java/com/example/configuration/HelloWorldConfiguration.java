package com.example.configuration;

import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.dropwizard.Configuration;

public class HelloWorldConfiguration extends Configuration {
    @NotEmpty
    @JsonProperty
    private String template;
    @NotEmpty
    @JsonProperty
    private String defaultName = "Stranger";
    public String getTemplate() {
        return template;
    }
    public String getDefaultName() {
        return defaultName;
    }
}