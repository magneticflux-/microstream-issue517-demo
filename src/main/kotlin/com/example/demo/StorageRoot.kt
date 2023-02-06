package com.example.demo

import one.microstream.integrations.spring.boot.types.Storage
import one.microstream.storage.types.StorageManager
import org.springframework.beans.factory.annotation.Autowired

@Storage
class StorageRoot {
    val test3 = false
    val test4 = 4
    @Autowired
    @Transient
    lateinit var storageManager: StorageManager
    var test: String = ""
    //var test2: Int = 0
}
