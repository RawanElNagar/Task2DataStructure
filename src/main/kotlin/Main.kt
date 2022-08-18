import java.util.Scanner
fun main() {
    val scn = Scanner(System.`in`)
    val mylist = mutableListOf<String>()
    println("Enter the size you want:")
    var size = scn.nextInt()
    scn.nextLine()

    while (size> 0){
        println("Enter any name ")
        val input = scn.nextLine()
        mylist.add(input)
        size--
    }
    val filteredlista  =mylist.filter {
        it.contains(other = "A")
    }
    println(filteredlista)
    filteredlista.forEach(){
        println("look ${it.uppercase()}")
    }

    val filteredlistb=mylist.filter {
        it.contains(other = "M")
    }
    println(filteredlistb)
    filteredlistb.forEach(){
        println("look ${it.uppercase()}")
    }

    println(mylist)
}