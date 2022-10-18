import { Cliente } from "../Cliente.js"
import { Conta } from "./Conta.js"

export class ContaCorrente extends Conta{

    static numeroDeContas = 0

    constructor (agencia,cliente){
       super(agencia,cliente,0)
        ContaCorrente.numeroDeContas++
    }

    sacar(valor){
        let valorComtaixa = 1.1 * valor

        if(valorComtaixa <= this.saldo){
            this._saldo -= valorComtaixa
            return valor
        }
    }
    
  
}
