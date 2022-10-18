import { Cliente } from "../Cliente.js"
import { ContaCorrente } from "../Conta/ContaCorrente.js"
import { ContaPoupanca } from "../Conta/ContaPoupanca.js"

const cliente = new Cliente("Leonardo", 23, "101.956.784-85")
const cliente1 = new Cliente("ABCDEF", 25, "98.584.254-85")

const contaCorrente = new ContaCorrente(1010, cliente,0)

const contaPoupanca = new ContaPoupanca(2020, cliente1,100)


contaCorrente.depositar(100)
contaPoupanca.depositar(100)
contaCorrente.transferir(80,contaPoupanca)


console.log(contaCorrente)
console.log(contaPoupanca)


console.log("Numero de Contas Correntes: ", ContaCorrente.numeroDeContas)
console.log("Numero de Contas Poupanças: ", ContaPoupanca.numeroDeContas)



