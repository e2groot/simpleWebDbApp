package com.e2groot.simpleWebDbApp

import com.google.inject.Inject
import javax.inject.Named
import javax.ws.rs.GET
import javax.ws.rs.Path

@Path("/hello")
class HelloResource {

    private var _message: String

    @Inject
    constructor (@Named("message") message: String) {
        this._message = message
    }

    @GET
    fun hello():String {
        return _message;
    }
}