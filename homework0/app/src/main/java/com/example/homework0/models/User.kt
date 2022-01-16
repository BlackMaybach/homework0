package com.example.homework0.models

import java.io.Serializable

data class User(
    var name : String,
    var miniDesc : String,
    var fullDesc: String,
    var dateStart: String,
    var dateEnd: String,
    var text: String
): Serializable
