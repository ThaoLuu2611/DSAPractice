package KotlinCode

data class Points(var x: Int, var y: Int, var value: Int)

class CollectionsKotlin{
    public fun test(){
        /*
        == : so sanh dia chi va gia trie 2 kieu du lieu nguyen thuy
        equal: so sanh doi tuong, ko phai kieu du lieu nguyen thuy
         */

        var point = Points(2,3,4);
        var point1 = Points(2,3,4);
        println(" ${point.x} ${point.y} ${point.value}");
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
        for(i in list.indices){
            println(list.get(i).toString());
        }

        println("sort collection");
        //   list.groupBy {it.value  }.toSortedMap()
        for(i in list.indices){
            println(list.get(i).toString());
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
}

