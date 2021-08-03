fun testaContaDiferentes() {
    var contaCorrente = ContaCorrente(numero = 1, titular = "01 titular")
    var contaPoupanca = ContaPoupanca(numero = 1, titular = "01 titular")

    contaCorrente.deposita(1000.00)
    contaPoupanca.deposita(1000.00)

    contaCorrente.saca(100.00)
    contaPoupanca.saca(100.00)

    contaCorrente.impressao()
    contaPoupanca.impressao()

    contaCorrente.transfere(100.00, contaPoupanca)
    contaCorrente.impressao()
    contaPoupanca.impressao()

    contaPoupanca.transfere(100.00, contaCorrente)
    contaCorrente.impressao()
    contaPoupanca.impressao()
}
