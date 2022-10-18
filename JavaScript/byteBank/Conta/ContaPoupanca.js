import { Conta } from "./Conta.js"

export class ContaPoupanca extends Conta{
    static numeroDeContas = 0

    constructor (agencia,cliente){
        super(agencia,cliente,0)
        ContaPoupanca.numeroDeContas++
    }

    sacar(valor){
        const taxa = 1.1
         super._sacar(valor,taxa)
     }
  


}