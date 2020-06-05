package KotlinCode

import java.util.*
import kotlin.collections.ArrayList

data class Points(var x: Int, var y: Int, var `val`: Int)

class CollectionsKotlin{
    public fun test(){
        /*
        == : so sanh dia chi va gia trie 2 kieu du lieu nguyen thuy
        equal: so sanh doi tuong, ko phai kieu du lieu nguyen thuy
         */
        var point = Points(2,3,4);
        var point1 = Points(2,3,4);
        println(" ${point.x} ${point.y} ${point.`val`}");
        println("equal = ${point.x == point1.x}")
    }
    public fun collections() {
        var list: MutableList<Points> = mutableListOf();
        list.add(Points(2,13,434))
        list.add(Points(-1,33,43344))
        list.add(Points(-1,32,43442))
        list.add(Points(22,43,4341))
        list.add(Points(12,53,1434))
        list.add(Points(3,3,434))
        println("============List point before sort ===========")
        for(i in list.indices){
            println(list.get(i).toString());
        }
        list.forEach{
            it -> println(" element = "+it.`val`);
        }

        list.forEachIndexed{
            index, points -> ("element index = "+index +" points x = "+points.x);1
        }

        println("============List point after sort ===========")
        list.sortBy { it.x }
        //   list.groupBy {it.value  }.toSortedMap()
        for(i in list.indices){
            println("list to string" + list.get(i).toString());
        }

        println("=======================Group by======================");
        //group by: group original collection by key, return map of group of key with associated list of corresponding elements;
        //preserve the iteration order of key produced from the collection

        var listX = list.groupBy { it.x }
        println("list group buy point x "+ listX);

        var names = listOf("thaomoc","thu","Peter","Hoa","john kennedy");
        var  namesLength = names.groupBy { it.length }
        println("names group by length "+ namesLength);
        println("names key group by length "+ namesLength.keys);

        for( key in  namesLength.keys){
            println(" k: " + key +" list value = "+ namesLength[key]);
        }
        for( key in  namesLength.keys){
            println("first value of list " + namesLength[key]?.get(0))
        }
    }

    fun collectionSort(){
        var list: MutableList<Points> = mutableListOf();
        list.add(Points(2,13,434))
        list.add(Points(-1,33,43344))
        list.add(Points(22,132,43442))
        list.add(Points(-1,32,11143442))
        list.add(Points(22,32,43442))
        list.add(Points(-1,32,43442))
        list.add(Points(22,43,4341))
        list.add(Points(12,53,1434))
        list.add(Points(3,3,434))

        list.groupBy { it.x }.toSortedMap().entries.forEach {
            //it.value.sortedBy { it2 -> it2.y };
            //println( "List i = "+ it.toString())
            println("key : "+ it.key+" value = "+it.value)
/*            it.value.sortedBy { it.`val` }.sortedByDescending{it.y}.forEach {
               println(it.`val`);
            }*/
            println("after sort");
            var list1 = it.value.sortedBy{it.`val`}.sortedByDescending  { it.y}
            println("after sort "+list1);
        }

        println("map = "+list.map{it.`val`});
    }

    fun collectionSort2(){
        var list: MutableList<Points> = mutableListOf();
        list.add(Points(2,13,434))
        list.add(Points(-1,33,43344))
        list.add(Points(22,132,43442))
        list.add(Points(-1,32,11143442))
        list.add(Points(22,32,43442))
        list.add(Points(22,32,434842))
        list.add(Points(-1,32,43442))
        list.add(Points(22,43,4341))
        list.add(Points(12,53,1434))
        list.add(Points(3,3,434))

        list.groupBy{it.x}.forEach{
            println(" print " + it);
        }

/*
        list.groupBy{it.x}.entries.forEach{
            println(" print entry " + it);
            it.value.sortedWith(compareBy({it.y},{it.`val`}))
            println(" print entry after sorte " + it.value));
        }
*/

        var valueList = arrayListOf<List<Int>>()
        list.groupBy{it.x}.entries.forEach {
                var sortedList = it.value.sortedWith(compareBy({it.y},{it.`val`}))
            println("sorted list = "+sortedList);
            println("x value     = "+it.value);
                valueList.add(sortedList.map { it.`val` })
             //   println("sort = "+it.value);

        }

        for(i in 0..valueList.size - 1)
            println("value list = ${valueList.get(i)}")
     //   println("map = "+list.map{it.`val`});
    }

    public fun test4 (){
        var list = mutableListOf<Pair<Int,Int>>();
        list.add(Pair(4,234))
        list.add(Pair(1,34))
        list.add(Pair(1,24))
        list.add(Pair(1,124))
        list.add(Pair(1,4))
        list.add(Pair(2,234))
        list.add(Pair(5,234))
        list.sortWith(compareBy({it.first},{it.second}))
        for(i in list.indices)
            println(list.get(i))
    }


}

