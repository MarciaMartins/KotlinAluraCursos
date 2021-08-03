class Analista (
    nome: String,
    cpf: String,
    salario: Double
 ): Funcionario(nome = nome, cpf = cpf, salario = salario) {

    override fun bonificacao(): Double {
        return salario *0.1
    }

    override fun impressao(){
        println("======Dados Analista ======")
        println("Dados - nome ${this.nome}, " +
                "cpf ${this.cpf}, " +
                "salario ${this.salario}, " +
                "bonificação ${this.bonificacao()}")

    }
}