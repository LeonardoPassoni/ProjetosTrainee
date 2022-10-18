import { Conta } from "./Conta.js"

export class ContaPoupanca extends Conta{
    static numeroDeContas = 0

    constructor (agencia,cliente){
        super(agencia,cliente,0)
        ContaPoupanca.numeroDeContas++
    }


  


}