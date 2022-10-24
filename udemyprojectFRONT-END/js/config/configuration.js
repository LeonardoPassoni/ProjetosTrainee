angular.module("udemyProject").config(['$stateProvider',function($stateProvider){


    $stateProvider
    .state('listaUsuarios',{
        url: '/lista',
        templateUrl : 'view/listarUsuario.html',
        controller : 'userController'
    })

    .state('cadastroUsuario',{
        url:'/cadastro',
        templateUrl : 'view/cadastroUsuario.html',
        controller : 'userController',
        params : {
            id : null
        }
    })
}])  