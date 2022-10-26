export class Negociacoes {
    constructor() {
        // private negociacoes : Array<Negociacao> = [];
        this.negociacoes = [];
    }
    adiciona(negociacao) {
        this.negociacoes.push(negociacao);
    }
    // listar() : ReadonlyArray<Negociacao>{
    //     return this.negociacoes;
    // }
    listar() {
        return this.negociacoes;
    }
}
