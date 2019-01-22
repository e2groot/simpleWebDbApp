package com.e2groot.simpleWebDbApp.guice

import com.e2groot.simpleWebDbApp.ServerConfiguration
import com.google.inject.Binder
import com.google.inject.Module
import com.google.inject.Provides
import javax.inject.Named

class ServerModule: Module {
    override fun configure(binder: Binder?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    @Provides
    @Named("message")
    fun provideMessage(serverConfiguration: ServerConfiguration) : String {
        return serverConfiguration.message
    }
}