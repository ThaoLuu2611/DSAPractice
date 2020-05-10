import JavaCode.*

fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
    var s1 = mutableSetOf<Int>();
    var s = mutableSetOf<Int>();
    for( num in nums1)
        s1.add(num);
    for(num2: Int in nums2)
    {
        if(s1.contains(num2))
            s.add(num2);
    }
    var arr = IntArray(s.size);
    var i = 0;
    for( n in s)
        arr[i] = n;
    return arr;

}

fun main(){
    var myCollection = Algorithm();
    //myCollection.sumTwoString();
    //var isValinDrom = myCollection.validPalindrome(
    //        "aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga");
   // System.out.println(isValinDrom);
    var bfs = BreadthFirstSearch();
    //bfs.printTree();
    var dfs = DepthFirstSearch();
    dfs.printDFS();

    var stackExample = StackExample();
    //stackExample.printStack();
    var queueExample = QueueExample();
    //queueExample.printQueue();
    var divideTwoInt = DevideTwoInt();
    divide(10, 3);
}

fun divide(dividend: Int, divisor: Int): Int {
    var isNegative:Boolean = false
    if(dividend < 0 && divisor > 0 || dividend > 0 && divisor < 0)
        isNegative = true;
    var dividendAbs: Long = Math.abs(dividend.toLong());
    var divisorAbs: Long = Math.abs(divisor.toLong());
    if(divisorAbs == 1.toLong()){
        if(isNegative)
            return -dividendAbs.toInt();
        else{
            if(dividendAbs >= Int.MAX_VALUE)
                return Int.MAX_VALUE;
            else
                return dividendAbs.toInt();
        }
    }
    var quotion = 1;
    var result = quotion;5
    var track = divisorAbs;
    while(track + track <= dividendAbs){
        track += track;
        quotion += quotion;
        result += quotion;
        if(track + track > dividendAbs){
            if(dividendAbs - track >= divisorAbs){
                dividendAbs = dividendAbs - track;
                track = divisorAbs;
                quotion = 1;
                result += quotion;
            }
            else
                break;
        }
    }

    return if(isNegative)  -result else result;
}



