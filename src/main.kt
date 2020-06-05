import JavaCode.*
import KotlinCode.CollectionsKotlin
import KotlinCode.CombinationsSumKotlin
import java.util.Scanner;


fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
    var s1 = mutableSetOf<Int>();
    var s = mutableSetOf<Int>();
    for (num in nums1)
        s1.add(num);
    for (num2: Int in nums2) {
        if (s1.contains(num2))
            s.add(num2);
    }
    var arr = IntArray(s.size);
    var i = 0;
    for (n in s)
        arr[i] = n;
    return arr;
}

fun main() {


    System.out.println("BreadFirstSearch 1");
    System.out.println("DeptFirstSearch 2");
    System.out.println("DevideTwoInt 3");
    System.out.println("SubArraySum 4");
    System.out.println("KClosestPoint 5");
    System.out.println("StackExample 6");
    System.out.println("QueueExample 7");
    System.out.println("Lamda Express 8");
    System.out.println("Stream 9");
    System.out.println("Fraction to Decimal 10");
    System.out.println("Merge intervals 11 ");
    System.out.println("Combination sum 12");
    System.out.println("Collection 13")
    System.out.println("Three sum list 14")
    System.out.println("Collection kotlin 15")
    System.out.println("Set read only file 16")

    var case: Int;
    var reader = Scanner(System.`in`);
    println("\nEnter case\n");

    var i = reader.nextInt();
    var myCollection = Algorithm();

    when (i) {
        1 -> {
            var bfs = BreadthFirstSearch();
            bfs.printTree()
        }
        2 -> {
            var dfs = DepthFirstSearch();
            dfs.printDFS();
        }
        3 -> {
            var divideTwoInt = DevideTwoInt();
        }
        4 -> {
            var subArraySum = SubArraySum();
        }
        5 -> {
            var kClosestPoint = KClosestPoint()
            kClosestPoint.example()
        }
        6 -> {
            var stackExample = StackExample()
        }
        7 -> {

            var queueExample = QueueExample();
           // queueExample.printQueue();
            queueExample.printPriorityQueue();
        }
        8 -> {
            var lambdaExp = LambdaExp();
            lambdaExp.callImplementation();
            lambdaExp.lambdaWithoutParameter();
            lambdaExp.lambdaWithParameter();
            lambdaExp.printList()
        }
        9 -> {
            var stream = StreamExp();
            stream.printStream();
        }
        10 -> {
            var divideFraction = DivideFraction();
            divideFraction.printFraction()
        }

        11 -> {
            var mergeIntervals = MergeIntervals();
            mergeIntervals.printMergeIntervals();
        }

        12 -> {
           var combinationsSum = CombinationsSum();
        //    combinationsSum.test();

            var combinationsSumKotlin = CombinationsSumKotlin();
            combinationsSum.test();

        }
        13 -> {
            var collection = MyCollections();
            //collection.testCollections();
            collection.oldSort();
        }

        14 -> {
            var threeSum = ThreeSum();
            threeSum.test();
        }
        15 -> {
            var collectionsKotlin = CollectionsKotlin();
            //collectionsKotlin.test();
            //collectionsKotlin.collections();
           // collectionsKotlin.collectionSort()
            //collectionsKotlin.collectionSort2()
            collectionsKotlin.test4()
        }
        16 -> {
            var readOnlyFile = ReadOnlyFile();
            readOnlyFile.createFile()
        }
    }
}






