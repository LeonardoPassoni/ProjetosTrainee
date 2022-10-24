import { Cliente } from "../Cliente.js"
import { Conta } from "./Conta.js"

export class ContaCorrente extends Conta{

    static numeroDeContas = 0

    constructor (agencia,cliente){
       super(agencia,cliente,0)
        ContaCorrente.numeroDeContas++
    }

    sacar(valor){
       const taxa = 1.2
        super._sacar(valor,taxa)
    }
    
  
}
