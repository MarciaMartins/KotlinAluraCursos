class Diretor (
    nome: String,
    cpf: String,
    salario: Double,
    val plr: Double,
    senha: Int
): FuncionarioAdmin(nome = nome, cpf = cpf, salario = salario, senha= senha){

    override fun bonificacao(): Double{
        return plr
    }

    override fun impressao(){
        println("======Dados Diretor ======")
        println("Dados - nome ${this.nome}, " +
                "cpf ${this.cpf}, " +
                "salario ${this.salario}, " +
                "bonificação ${this.bonificacao()}")

    }
}