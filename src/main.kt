fun main() {
    println("Bem vindo ao Bytebank")

    testaComportamentosConta()

    val cesar = Funcionario(
        name = "Cesar",
        cpf = "111.111.111-11",
        salary = 5000.00
    )

    println("Name =  ${cesar.name}, Salary = ${cesar.salary}, bonus = ${cesar.bonus}" )
}

