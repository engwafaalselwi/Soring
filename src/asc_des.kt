fun main(){
    val list = listOf(8,4,7,1,2,3,0,5,6)
    println(" Asc Sorting : ")

    val Asc_Sorting = list.sorted()
    println (Asc_Sorting)

    println("Dec Sorting")
    val Dec_Sorting = list.sortedDescending()
    println(Dec_Sorting)
}