export class Cliente{

    constructor(nome,idade,cpf){
        this.nome = nome
        this.idade = idade
        this.cpf = cpf
    }


    autenticar(senha){
        return true
    }
}