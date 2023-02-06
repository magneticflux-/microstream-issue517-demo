package com.example.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Runner(val root: StorageRoot) {
    @GetMapping("/test")
    fun get() {
        println("Loaded value: \"${root.test}\"")
        root.test = "123"
        println("New value: \"${root.test}\"")

        root.storageManager.storeRoot()
    }
}
