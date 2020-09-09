package com.example.mviexample.model

import com.google.gson.annotations.Expose

class User(

    @Expose
    val email: String? = null,

    @Expose
    val username: String? = null,

    @Expose
    val image: String? = null
)