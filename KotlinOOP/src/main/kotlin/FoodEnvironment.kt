import kotlin.random.Random

 class FoodEnvironment(vararg ags : Actor): Environment(*ags) {

     val scores: MutableMap<Actor, Int> = mutableMapOf()
     var animal: String? = null

     init {
         ags.map { agent -> scores.put(agent, 0) }
     }

    override fun step() {
        val randomValue = Random.nextDouble()
        animal = (if (randomValue > 0.5) {
        } else { "Rabbit"}).toString()

        super.step()
        println(randomValue)

    }

     override fun processAction(agent: Actor, act: Action) {
         if (act is HuntAction) {
         } else if (act is ForageAction) {
             scores[agent] = scores.getOrDefault(agent, 0)+1

         }

     }

     override fun sense(agent: Actor) {

     }

 }