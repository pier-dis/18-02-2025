class ComplexNumber(real: Double,imaginary: Double){
    var real=real
    var imaginary=imaginary

    operator fun plus(other:ComplexNumber) : ComplexNumber{
        val real=this.real+other.real
        val imaginary=this.imaginary+other.imaginary
        return ComplexNumber(real, imaginary)
    }

    override fun toString(): String {
        return "reale: ${real},imaginary: ${imaginary}"
    }
}