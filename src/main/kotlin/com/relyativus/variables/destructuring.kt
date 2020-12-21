package com.relyativus.variables

/**
 *
 * @author anatolii vakaliuk
 */
data class Person(val firstName: String, val lastName: String)

fun main(args: Array<String>) {
    val person = Person("Anatolii", "Vakaliuk")
    val (firstName, lastName) = person
    println("Hi $firstName $lastName")
}
