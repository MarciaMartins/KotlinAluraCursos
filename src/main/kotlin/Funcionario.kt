abstract class Funcionario(
    val nome: String,
    val salario: Double,
    val cpf: String
    ) {
    abstract fun bonificacao(): Double


    open fun impressao(){
        println("======Dados Funcionario ======")
        println("Dados - nome ${this.nome}, " +
                "cpf ${this.cpf}, " +
                "salario ${this.salario}, " +
                 "bonificação ${this.bonificacao()}")

    }



}

