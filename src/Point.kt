import kotlin.math.sqrt
import kotlin.math.pow

class Point(x:Double, y: Double) {
    var x=x
    var y=y
    fun distanceToOrigin():Double {
        var d = sqrt(x * x + y * y)
        return d
    }
    fun distance(other:Point):Double{
        var d=sqrt((x-other.x).pow(2)+ (y-other.y).pow(2))
        return d
    }
}