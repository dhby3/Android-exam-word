package com.example.middleexam

data class Commodity(
    val id: Int,
    val name:String,
    val price:Double,
    val quantity:Int,
    val description:String
)
data class Equipment(
    val id: Int,
    val name:String,
    val type: String,
    val status:String,
    val manufacturer:String
)

object UserData{
    val commodityList = listOf(
        Commodity(1,"商品1",100.0,10,"这是商品1"),
        Commodity(2,"商品2",200.0,20,"这是商品2"),
        Commodity(3,"商品3",300.0,30,"这是商品3"),
    )
    val equipmentList = listOf(
        Equipment(1,"物品1","类型A","可用","制造商1"),
        Equipment(2,"物品2","类型B","可用","制造商2"),
        Equipment(3,"物品3","类型C","可用","制造商3"),
    )
}
