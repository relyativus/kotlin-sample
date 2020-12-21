package com.relyativus.variables

/**
 *
 * @author anatolii vakaliuk
 */

fun numberToString(number: Int) = number.toString()

val adhocFunction: (Int) -> String = { number -> number.toString() }

fun main(args: Array<String>) {
    println(numberToString(2) == adhocFunction(2))
}