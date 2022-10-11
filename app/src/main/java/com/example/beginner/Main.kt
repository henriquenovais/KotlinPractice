package com.example.beginner

fun main (args:Array<String>){
    problem2_level1_extremely_basic(5,5)
}

fun problem1_level1_hello_world(){
    println("Hello World!")
}

fun problem2_level1_extremely_basic(a: Int, b: Int){
    println("${a+b}")
    val sc = Scanner(System.`in`);

    val a: String = sc.next();
    val b: String = sc.next();

    println("X = " + (a.toInt() + b.toInt()));
}