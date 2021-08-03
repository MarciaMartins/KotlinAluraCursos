abstract class FuncionarioAdmin (
    nome: String,
    salario: Double,
    cpf: String,
    val senha: Int
):Funcionario (nome = nome, cpf= cpf, salario = salario),
Autenticavel{

    override fun autentica(senha: Int): Boolean {
        if (this.senha == senha) return true
        return false
    }


}