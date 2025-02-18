import kotlin.math.pow

class Quadrato (lato:Double):Polygon(lato){
    override fun area():Double{
        return measure.pow(2)
    }
}