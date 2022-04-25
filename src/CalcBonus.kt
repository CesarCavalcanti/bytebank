class CalcBonus {
    var total: Double = 0.0
        private set

    fun register(funcionario: Funcionario){
        this.total += funcionario.bonus()
    }
}