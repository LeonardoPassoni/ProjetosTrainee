angular.module("udemyProject").controller("userController", 
function ($scope, $http, userService, $stateParams,$state,$timeout){
    $scope.user = {};
    $scope.users = [];
    $scope.app = "Cadastro Usuário"
    $scope.teste = "Lista de Usuários"



    console.log($stateParams)

    var loadUsers = function(){
        userService.getUsers().then(function (response) {
            $scope.users = response.data;

        }).catch(function (data) {
            $scope.message = "Aconteceu um problema" + data;
        });
    };

    $scope.addUser = function (user){
        userService.saveUser(user).then(function(data){
            delete $scope.user;
            $scope.message = "Usuario salvo com sucesso";
            $timeout(()=> {
                delete $scope.message
             },5000)
            loadUsers();
        });
        
    };

    $scope.cadastroUsuario = function(id){
        $state.go('cadastroUsuario',{id:id})

    }

    var loadIfExists = function(){
        if($stateParams.id){
            userService.getUser($stateParams.id).then(function(response){
                $scope.user = response.data;
            }

        )}
    }

    $scope.removeUser = function(id){
        userService.removeUser(id).then(function(response){
            loadUsers();
        }).catch(function(response){
          
            $scope.message = "Erro ao excluir o usuário"
            $timeout(()=> {
               delete $scope.message
            },5000)
        })
    }
    loadUsers();
    loadIfExists();
    
});