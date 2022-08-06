enum class Sport { HIKE, RUN, TOURING_BICYCLE, E_TOURING_BICYCLE }

data class Summary(val sport: Sport, val distance: Int)

fun main() {
    /* val sportStats = listOf(Summary(Sport.HIKE, 92),
         Summary(Sport.RUN, 77),
         Summary(Sport.TOURING_BICYCLE, 322),
         Summary(Sport.E_TOURING_BICYCLE, 656))

     // Code to print the top sport by distance excluding eBikes.

     val data = sportStats.sortedBy {
         it.distance
     }.filter {
         it.sport!=Sport.E_TOURING_BICYCLE // Excluded eBikes
     }.asReversed()
     println(data.first())*/

    val a: A = A()
    val b1: A = B()
    val b2: B = B()

    /*println(a.x)*/
    println(b1.x)
   /* println(b2.x)

    a.print()
    b1.print()
    b2.print()*/
}


open class A {
    open val x = 10

    open fun print() {
        println(x)
    }
}

class B : A() {
    override val x = 20

    override fun print() {
        println(x)
    }
}

