angular.module("udemyProject").directive("uiAlert" , function(){
    return{
        templateUrl : 'view/alert.html',
        replace : true,
        transclude : true

    }
})