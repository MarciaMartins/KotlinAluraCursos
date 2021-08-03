class Gerente (
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int
): FuncionarioAdmin(nome = nome, cpf = cpf, salario = salario, senha = senha)
{


    override fun bonificacao(): Double {
        return salario

    }
    override fun impressao(){
        println("======Dados Gerente ======")
        println("Dados - nome ${this.nome}, " +
                "cpf ${this.cpf}, " +
                "salario ${this.salario}, " +
                "bonificação ${this.bonificacao()}")

    }
}