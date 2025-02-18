class Cilinder (r : Double, h : Double){
    val r=r
    val h=h
    fun calcolaVolume():Double{
        var v= 3.14*r*r*h
        return v
    }
    fun calcolaAreaSuperficiale(): Double{
        var a=2*3.14*r*(r+h)
        return a
    }
}