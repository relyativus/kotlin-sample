package com.relyativus.variables

import java.util.*

/**
 *
 * @author anatolii vakaliuk
 */
//outer function
fun main(args: Array<String>) {
    println("Aloha")
    SampleClass().sampleFunction("a") { stringValue -> stringValue.toInt() }
    Factory.getInstance()
}

class SampleClass {
    //class member function
    fun sampleFunction(a: String, converter: (String) -> Int): Boolean = converter(a) > 0
}

//factory method
object Factory {
    fun getInstance(): Int {
        return Random(System.currentTimeMillis()).nextInt()
    }
}