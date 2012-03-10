package com.example.hellodropwizard;

import com.yammer.dropwizard.config.HttpConfiguration;
import org.codehaus.jackson.annotate.JsonProperty;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

public class EnvHttpConfiguration extends HttpConfiguration {

    @Min(1025)
    @Max(65535)
    @JsonProperty
    private int port = 8080;

    public int getPort() {
        return (System.getenv("PORT") == null) ? port : Integer.parseInt(System.getenv("PORT"));
    }
    
}
