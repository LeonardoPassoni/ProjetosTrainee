import { Cliente } from "../Cliente.js"

export class Conta{

    constructor (agencia,cliente,saldo){
        if(this.constructor == Conta){
            throw new Error("A Classe Conta é abstrata")
        }
        this.agencia = agencia
        this.cliente = cliente
        this.saldo = saldo
    }
  
  
    set cliente(cliente){
        if(cliente instanceof Cliente){
            this._cliente = cliente
        }
    }

    get cliente(){
        return this.cliente
    }

    
    get saldo(){
        return this._saldo
    }

    set saldo(saldo){
        this._saldo = saldo
    }

    sacar(valor){
       throw new Error("Metodo Abstrato")
        
    }

    _sacar(valor,taxa){
        valor = valor * taxa
        if(valor <= this.saldo){
            this._saldo -= valor
            return valor
        }

    }

    depositar(valor){
        if(valor <= 0)
            return
        
        this._saldo += valor    
    }

    transferir(valor,conta){
        this.sacar(valor)
        conta.depositar(valor)
    }


}