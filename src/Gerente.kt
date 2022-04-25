class Gerente(
    name: String,
    cpf: String,
    salary: Double,
    val senha: Int

) : Funcionario(
    name = name,
    cpf = cpf,
    salary = salary
) {
    override fun bonus(): Double{
        return super.bonus() + salary
    }

    fun autentica(senha: Int): Boolean{
        if(this.senha == senha){
            return true
        }
        return false
    }
}