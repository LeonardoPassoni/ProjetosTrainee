export class SistemaAutenticacao {

    static login(auttenticavel, senha) {
        return auttenticavel.autenticar(senha)
    }
}