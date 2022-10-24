import { Conta } from "./Conta.js"

export class ContaSalario extends Conta{
    constructor(cliente){
        super(0,cliente,0)
    }

    sacar(valor){
        const taxa = 1.01
        super._sacar(valor)
    }
}