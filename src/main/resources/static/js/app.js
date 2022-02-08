var app = angular.module('app', []);

app.controller('HouseController', function ($scope, $http) {

    const raiz = "http://localhost:8080/databaseLog/"

    $scope.user = {};
    $scope.houseWrapper = {};


// LOGIN
    $scope.login = () => {
        $http({
            method: 'POST',
            url: raiz + "login",
            data: JSON.stringify($scope.user)
        }).then(function (response){
            if(response){
                console.log(response);
                window.location.replace('/casas.html');
            }else{
                console.log("Sin permisos");
            }
        })
    }
    
    
    // Registro de una casa
    $scope.registrarCasa = () => {
		console.log($scope.houseWrapper);
		$http({
            method: 'POST',
            url: raiz + "houses/"+"Diego",
            data: JSON.stringify($scope.houseWrapper)
        }).then(function (response){
            if(response){
                console.log(response);
                location.reload();
            }else{
                console.log("Sin permisos");
            }
        })
	}
	
	// Consultar casas
	$scope.consultarCasas = () => {
		$http({
            method: 'GET',
            url: raiz + "houses",
            data: {}
        }).then(function (response){
            if(response){
                console.log(response);
                $scope.casas = response.data;
            }else{
                console.log("Sin permisos");
            }
        })
	}
	
	
	// Consultar casa especifica
	$scope.consultarCasaEspecifica = (idCasa) => {
		$http({
            method: 'GET',
            url: raiz + "houses/"+JSON.stringify(idCasa),
            data: {}
        }).then(function (response){
            if(response){
                console.log(response);
                $scope.houseWrapper = response.data;
            }else{
                console.log("Sin permisos");
            }
        })
	}
	
	// Modificar casa
	$scope.modificarCasa = () => {
		$http({
            method: 'GET',
            url: raiz + "houses/"+JSON.stringify(idCasa),
            data: {}
        }).then(function (response){
            if(response){
                console.log(response);
                $scope.houseWrapper = response.data;
            }else{
                console.log("Sin permisos");
            }
        })
	}

});