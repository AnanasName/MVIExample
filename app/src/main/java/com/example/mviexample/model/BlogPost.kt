package com.example.mviexample.model

import com.google.gson.annotations.Expose

data class BlogPost(
    
    @Expose
    val pk: Int? = null,

    @Expose
    val title: String? = null,

    @Expose
    val body: String? = null,

    @Expose
    val image: String? = null
    
)