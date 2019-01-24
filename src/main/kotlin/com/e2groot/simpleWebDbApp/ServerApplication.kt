package com.e2groot.simpleWebDbApp

import com.e2groot.simpleWebDbApp.guice.ServerModule
import com.hubspot.dropwizard.guice.GuiceBundle
import io.dropwizard.Application
import io.dropwizard.setup.Bootstrap
import io.dropwizard.setup.Environment

class ServerApplication:Application<ServerConfiguration>() {

    override fun initialize(bootstrap: Bootstrap<ServerConfiguration>?) {
        //super.initialize(bootstrap)
        var guiceBundle: GuiceBundle<ServerConfiguration> = GuiceBundle.newBuilder<ServerConfiguration>()
            .addModule(ServerModule())
            .setConfigClass(ServerConfiguration::class.java)
            .enableAutoConfig(name)
            .build()
        bootstrap?.addBundle(guiceBundle)
    }

    override  fun run(configuration: ServerConfiguration, environment: Environment) {
        println("The server says, \"${configuration.message}\"!!!")

    }
}