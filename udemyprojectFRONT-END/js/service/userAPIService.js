angular.module("udemyProject").factory("userService", function($http){

    var _getUsers = function(){
        return $http.get("http://localhost:8080/users");
    };

    var _getUser = function(id){
        return $http.get( `http://localhost:8080/users/${id}`)
    }

    var _saveUser = function(user){
        if(user.id){
            return $http.put(`http://localhost:8080/users/${user.id}`, user);
        }
        return $http.post(`http://localhost:8080/users/`, user);    
    };

    var _removeUser = function(id){
        return $http.delete(`http://localhost:8080/users/${id}`);
    }
    return {
        getUsers : _getUsers,
        saveUser : _saveUser,
        getUser : _getUser,
        removeUser: _removeUser

    }
})