package com.example.hellodropwizard;

import com.example.hellodropwizard.resources.HelloWorldResource;
import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.bundles.AssetsBundle;
import com.yammer.dropwizard.config.Environment;

import java.io.File;

public class HelloWorldService extends Service<HelloWorldConfiguration> {

    public static void main(String[] args) throws Exception {
        new HelloWorldService().run(args);
    }

    private HelloWorldService() {
        super("hello-world");
        addBundle(new AssetsBundle());
    }

    @Override
    protected void initialize(HelloWorldConfiguration configuration,
                              Environment environment)         {
        final String template = configuration.getTemplate();
        final String defaultName = configuration.getDefaultName();
        environment.addResource(new HelloWorldResource(template, defaultName));
    }

}