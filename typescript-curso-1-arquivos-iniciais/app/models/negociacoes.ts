import { Negociacao } from "./negociacao.js";

export class Negociacoes{
    // private negociacoes : Array<Negociacao> = [];
    private negociacoes : Negociacao[] = [];
    

    adiciona( negociacao : Negociacao) : void {
        this.negociacoes.push(negociacao);
    }

    // listar() : ReadonlyArray<Negociacao>{
    //     return this.negociacoes;
        
    // }

    listar() : readonly Negociacao[]{
        return this.negociacoes;
        
    }


}