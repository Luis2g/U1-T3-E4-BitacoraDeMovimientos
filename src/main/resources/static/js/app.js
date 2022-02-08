var app = angular.module('app', []);

app.controller('HouseController', function ($scope, $http) {

    const raiz = "http://localhost:8080/databaseLog/"

    $scope.user = {};

    $scope.login = () => {
        console.log($scope.user);
        $http({
            method: 'POST',
            url: raiz + "login",
            data: JSON.stringify($scope.user)
        }).then(function (response){
            if(response){
                console.log(response);
                window.location.replace('/casas.html');
                alert('Entraste')
            }else{
                console.log("Sin permisos");
            }
        })
    }

});