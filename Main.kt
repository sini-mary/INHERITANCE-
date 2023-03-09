fun main() {
    var vehicle=Car("Audi","q5","Silver",6)
     vehicle.carry(11)
     vehicle.identity()
var calculate=  vehicle.calculateParkingFees(2)
    println(calculate)


    var bus=Bus("Isuzu","single deck","black",50)

      println(bus.maxTripfare(100.5))
    println(bus.calculateParkingFees(10))




}
open class vehicles(var make: String,var model:String,var color: String,var capacity:Int) {
    fun carry(people: Int) {
        if (people == 10) {
            println("carrying $people number of pasengers")
        } else {
            println("Over capacity by  number of people")
        }
    }

    fun identity() {

        println("I am $color $make $model")
    }

  open fun calculateParkingFees(hours: Int): Int {
        var fees = hours * 20
        return (fees)
    }
}
open class Car( make: String, model:String, color: String, capacity:Int):vehicles(make,model,color,capacity){


}
class Bus( make:String, model:String,color:String,capacity:Int):vehicles(make,model,color,capacity) {
    fun maxTripfare(fare: Double): Double {
        var fare = capacity * 100.0
        return fare
    }


    override fun calculateParkingFees(hours: Int): Int {
      return  capacity*hours
    }


}

