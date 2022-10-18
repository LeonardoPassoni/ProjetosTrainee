import { SistemaAutenticacao } from "../Autenticacao/SistemaAutenticao.js"
import { Cliente } from "../Cliente.js"
import { Conta } from "../Conta/Conta.js"
import { ContaCorrente } from "../Conta/ContaCorrente.js"
import { ContaPoupanca } from "../Conta/ContaPoupanca.js"
import { ContaSalario } from "../Conta/ContaSalario.js"
import { Diretor } from "../Funcionario/Diretor.js"
import { Gerente } from "../Funcionario/Gerente.js"

const cliente = new Cliente("Leonardo", 23, "101.956.784-85")
const cliente1 = new Cliente("ABCDEF", 25, "98.584.254-85")

const contaCorrente = new ContaCorrente(1010, cliente,0)

const contaPoupanca = new ContaPoupanca(2020, cliente1,100)

const contaSalario = new ContaSalario(cliente1)


contaCorrente.depositar(100)
contaPoupanca.depositar(100)
contaCorrente.transferir(80,contaPoupanca)

contaSalario.depositar(1000)


console.log(contaCorrente)
console.log(contaPoupanca)

console.log("Numero de Contas Correntes: ", ContaCorrente.numeroDeContas)
console.log("Numero de Contas Poupanças: ", ContaPoupanca.numeroDeContas)

console.log(contaSalario)

const diretor = new Diretor("Diretor",5000,"546.465.565-76")
console.log(diretor)

diretor.cadastrarSenha("123")
console.log(SistemaAutenticacao.login(diretor,"123"))

const gerente = new Gerente("Gerente",15000,"546.465.565-76")
console.log(gerente)
gerente.cadastrarSenha("12345")
console.log(SistemaAutenticacao.login(gerente,"12345"))