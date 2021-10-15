fun main(){
    println(SimpleAgent("Israel").toString())
    //println(SimpleAgent("Israel").act())
    SimpleAgent("Israel")

    val env = FoodEnvironment(SimpleAgent("Charlie"))

    for (i in 1..10){
        env.step()
        println(env.animal)
    }

}