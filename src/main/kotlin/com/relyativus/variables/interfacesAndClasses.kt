package com.relyativus.variables

import java.util.*

/**
 *
 * @author anatolii vakaliuk
 */
fun main(args: Array<String>) {
    A(3).printValues()
    A(3, "override").printValues()
    val immutableDataA = ImmutableDataA(3, "c", false)
    println(
        "Immutable details: a=${immutableDataA.a}, b=${immutableDataA.b}, c=${immutableDataA.c}," +
                " hashCode=${immutableDataA.hashCode()}, toString=${immutableDataA.toString()}"
    )
    val mutable = MuttableDataA(3, "c", false)
    mutable.a = 4
}

class A(private val b: Int, private val c: String = "defaultValue") {
    fun printValues() {
        println("b=$b")
        println("c=$c")
    }
}

//all args constructor + getter + toString + //equalsAndHashcode
data class ImmutableDataA(val a: Int, val b: String, val c: Boolean)

//all args constructor + getter + toString + //equalsAndHashcode + setter
data class MuttableDataA(var a: Int, var b: String, var c: Boolean)

abstract class Shape {
    abstract fun area(): Double
}

class Circle : Shape() {
    override fun area(): Double {
        TODO("Not yet implemented")
    }
}

interface IShape {
    val koef: Int
    fun area()
    fun randomKoef() = Random(-2).nextInt() * koef
}

class ProperCircle() : IShape {
    override val koef: Int get() = -1

    override fun area() {
        TODO("Not yet implemented")
    }
}