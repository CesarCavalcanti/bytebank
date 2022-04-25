class Analista(
    name: String,
    cpf: String,
    salary: Double

) : Funcionario(
    name = name,
    cpf = cpf,
    salary = salary
) {
    override fun bonus(): Double{
        return super.bonus() + salary * 0.1
    }

}