package com.example.hellodropwizard;

import com.yammer.dropwizard.config.Configuration;
import com.yammer.dropwizard.config.HttpConfiguration;
import org.codehaus.jackson.annotate.JsonProperty;
import org.hibernate.validator.constraints.NotEmpty;

public class HelloWorldConfiguration extends Configuration {

    @NotEmpty
    @JsonProperty
    private String template;

    @NotEmpty
    @JsonProperty
    private String defaultName = "Stranger";

    private HttpConfiguration httpConfiguration = new EnvHttpConfiguration();

    
    public String getTemplate() {
        return template;
    }

    public String getDefaultName() {
        return defaultName;
    }

    @Override
    public HttpConfiguration getHttpConfiguration() {
        return httpConfiguration;
    }
}