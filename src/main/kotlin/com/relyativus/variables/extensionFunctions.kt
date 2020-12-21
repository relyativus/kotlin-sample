package com.relyativus.variables

/**
 *
 * @author anatolii vakaliuk
 */

//additing function to existing List interface

fun List<String>.printAll() {
    this.forEach { print(it) }
}

fun main(args: Array<String>) {
    listOf<String>("a", "b", "c").printAll()
}