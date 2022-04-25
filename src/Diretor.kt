class Diretor(
    name: String,
    cpf: String,
    salary: Double,
    val senha: Int,
    val plr: Double

) : Funcionario(
    name = name,
    cpf = cpf,
    salary = salary
) {
    override fun bonus(): Double{
        return super.bonus() + salary + plr
    }

    fun autentica(senha: Int): Boolean{
        if(this.senha == senha){
            return true
        }
        return false
    }
}