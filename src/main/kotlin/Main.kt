
fun main() {
    val minhaConta = Conta(123, "Fulano de Tall", 2000.0, 500.0)
    minhaConta.depositar(500.0)
    minhaConta.sacar(1500.0)
    println("Saldo da conta: R$${minhaConta.saldo}")
}

class Conta(val numero: Int, val titular: String, var saldo: Double, val limite: Double) {

    fun depositar(valor: Double) {
        saldo += valor
        println("Depósito de R$${valor} realizado com sucesso!")
    }

    fun sacar(valor: Double) {
        if (saldo + limite >= valor) {
            saldo -= valor
            println("Saque de R$${valor} realizado com sucesso!")
        } else {
            println("Saldo insuficiente para realizar o saque!")
        }
    }
}