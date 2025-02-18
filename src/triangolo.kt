import kotlin.math.pow

class triangolo(lato:Double):Polygon(lato) {
    override fun area():Double{
        return measure.pow(2)/2
    }
}