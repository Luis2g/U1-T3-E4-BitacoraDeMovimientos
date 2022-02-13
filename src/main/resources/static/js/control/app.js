var app = angular.module('app', []);

app.controller('HouseController', function ($scope, $http, $sce) {

    const raiz = "http://localhost:8080/databaseLog/"



    $scope.user = {};
    $scope.houseForRegistration = {};
    $scope.houseWrapper = {};
    $scope.editedHouse = {};
    $scope.casas = [];
    $scope.houseToDelete = {};
    $scope.log = {};
    $scope.logs = {
        users: [],
        houses: [],
        addresses: [],
        completeHouses: []
    }


    // LOGIN
    $scope.login = () => {
        $http({
            method: 'POST',
            url: raiz + "login",
            data: JSON.stringify($scope.user)
        }).then(function (response) {
            if (response) {
                console.log(response);
                localStorage.setItem("username", response.data.name);
                console.log($scope.user.name);
                window.location.replace('/view/casas.html');
            } else {
                console.log("Sin permisos");
            }
        })
    }


    // Registro de una casa
    $scope.registrarCasa = () => {
        // $scope.houseForRegistration = $scope.formatWrapper($scope.houseForRegistration)

        $http({
            method: 'POST',
            url: raiz + "houses/" + localStorage.getItem("username"),
            data: JSON.stringify($scope.houseWrapper)
        }).then(function (response) {
            $('registroModal').modal('hide');
            $scope.houseWrapper = {};
            if (response) {
                console.log(response);
                $scope.casas.push(response.data);
            } else {
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
        }).then(function (response) {
            if (response) {
                console.log(response);
                $scope.casas = response.data;
            } else {
                console.log("Sin permisos");
            }
        })
    }


    // Consultar casa especifica
    $scope.consultarCasaEspecifica = (idCasa) => {
        $http({
            method: 'GET',
            url: raiz + "houses/" + JSON.stringify(idCasa),
            data: {}
        }).then(function (response) {
            if (response) {
                console.log(response);
                $scope.editedHouse = response.data;
                $scope.editedHouse.address.zipCode = parseInt($scope.editedHouse.address.zipCode, 10)
            } else {
                console.log("Sin permisos");
            }
        })
    }

    // Formatting the wrapper so we can avoid petitions
    $scope.formatWrapper = (house) => (
        {
            "house": {
                "id": house.id,
                "flats": house.flats,
                "description": house.description,
                "available": house.available
            },
            "address": {
                "id": house.address.id,
                "innerNumber": house.address.innerNumber,
                "outterNumber": house.address.outterNumber,
                "zipCode": house.address.zipCode,
                "street": house.address.street,
                "colonia": house.address.colonia,
                "municipio": house.address.municipio,
                "state": house.address.state
            }
        }
    );

    // Modificar casa
    $scope.modificarCasa = () => {

        $scope.updatedHouseWrapper = $scope.formatWrapper($scope.editedHouse);
        console.log($scope.updatedHouseWrapper);

        $http({
            method: 'PUT',
            url: raiz + "houses/" + localStorage.getItem("username"),
            data: JSON.stringify($scope.updatedHouseWrapper)
        }).then(function (response) {
            if (response) {
                console.log("This is the response", response);
                // $scope.houseWrapper = response.data;
                let houseToReplace = response.data;


                console.log(houseToReplace.id);
                $scope.casas.map(casa => {
                    console.log("Entra");
                    console.log(casa.id);
                    if (casa.id === houseToReplace.id) {
                        $scope.casas.splice($scope.casas.indexOf(casa), 1, houseToReplace);
                    }
                })


                Swal.fire({
                    position: 'top-end',
                    icon: 'success',
                    title: 'La acción ha sido realizada exitosamente.',
                    showConfirmButton: false,
                    timer: 2000
                });

            } else {
                console.log("Sin permisos");
            }
        })
    }

    $scope.eliminarCasa = (casaToDelete) => {

        Swal.fire({
            title: 'Eliminar',
            text: "¿Estas seguro que deseas eliminar este registro?",
            icon: 'warning',
            showCancelButton: true,
            confirmButtonColor: '#3085d6',
            cancelButtonColor: '#d33',
            confirmButtonText: 'Eliminar'
        }).then((result) => {
            if (result.isConfirmed) {

                $http({
                    method: 'DELETE',
                    url: raiz + "houses/" + localStorage.getItem("username"),
                    data: JSON.stringify(casaToDelete),
                    headers: { 'Content-Type': 'application/json;charset=utf-8' }
                }).then(() => {

                    $scope.casas.splice($scope.casas.indexOf(casaToDelete), 1)

                    Swal.fire({
                        position: 'top-end',
                        icon: 'success',
                        title: 'La casa se ha eliminado correctamente',
                        showConfirmButton: false,
                        timer: 2000
                    });

                });
            }
        })
    }

    $scope.getLogs = () => {
        $scope.getHouseLogs();
        $scope.getUserLogs();
    }

    $scope.getHouseLogs = async () => {

        await $http({
            method: 'GET',
            url: raiz + "loggedHouses/",
        }).then((response) => {
            console.log(response)
            $scope.logs.houses = response.data;
        });


        await $http({
            method: 'GET',
            url: raiz + "loggedAddresses/",
        }).then((response) => {
            console.log(response)
            $scope.logs.addresses = response.data;
        });

        let completeHouse = {};
        console.log($scope.logs.houses.length);
        for (let i = 0; i < $scope.logs.houses.length; i++) {
            completeHouse = $scope.logs.houses[i];
            completeHouse.address = {};
            completeHouse.address = { ...$scope.logs.addresses[i] };


            $scope.logs.completeHouses.push(completeHouse);
        }
        console.log("Sale del for");

        console.log($scope.logs.completeHouses);

    };

    $scope.getUserLogs = () => {
        $http({
            method: 'GET',
            url: raiz + "controlAccesses",
        }).then((response) => {
            console.log(response)
            $scope.logs.users = response.data;
        });
    }

    $scope.moveToBitacora = () => {
        window.location.replace("http://localhost:8080/view/bitacora.html");
    }

    $scope.moveToCasas = () => {
        window.location.replace("http://localhost:8080/view/casas.html");
    }

    $scope.moveToUsers = () => {
        window.location.replace("http://localhost:8080/view/controlAccess.html");
    }

    $scope.showHouseInformation = (house) => {
        $scope.log = house;
        $('#houseInformation').modal('show');




    }

});