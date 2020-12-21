package com.relyativus.variables

/**
 *
 * @author anatolii vakaliuk
 */
data class Test(val a: String, val b: Int?)

fun main(args: Array<String>) {
    val test1 = Test("qwe", null)

    test1.a + " qwe" //works because a can't be null

//    test1.b+2 //compilation error, because b is nullable
    (test1.b?:0) + 2 //works with Elvis operator


//    var test2 = Test(null, 3) //compilation error. //a property cannot be null

}






