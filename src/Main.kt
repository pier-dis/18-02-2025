
fun main() {
    var p = Point(2.8, 1.5)
    var x=readln().toDouble()
    var y=readln().toDouble()
    var p2= Point(x, y)
    var volume=Cilinder(3.0,5.0)
    var area=Cilinder(3.0,5.0)
    println("x: ${p.x}, y: ${p.y}")
    println("La distanza tra il punto e l'origine e' ${p.distanceToOrigin()}")
    println("La distanza tra il punto e l'origine e' ${p.distance(p2)}")
    println("volume del cilindro: ${volume.calcolaVolume()}")
    println("l'area del cilindro: ${area.calcolaAreaSuperficiale()}")
}