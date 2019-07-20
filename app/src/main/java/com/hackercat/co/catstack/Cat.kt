package com.hackercat.co.catstack

class Cat(UID: Int, level: Int = 0, x: Int, y: Int, picked: Boolean){
    private var UID = UID
    private var level = level
    private var x = x
    private var y = y
    private var picked = picked

    fun getUID(): Int{return UID}
    fun getLevel(): Int{return level}
    fun getX(): Int{return x}
    fun getY(): Int{return y}
    fun getPicked(): Boolean{return picked}
    fun setLevel(){level++}
    fun setX(x: Int){this.x = x}
    fun setY(y: Int){this.y = y}
    fun setPicked(picked: Boolean){this.picked = picked}
}