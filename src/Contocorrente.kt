public class Contocorrente(saldo:Double) {
    var saldo=saldo
        private set
        public get

    fun deposita(denaro:Double){
        saldo+=denaro
    }

    fun preleva(denaro:Double){
        if(denaro>=saldo){
            saldo-=denaro
        }
    }
}