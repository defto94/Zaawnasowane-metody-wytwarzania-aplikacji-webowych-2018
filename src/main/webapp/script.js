  var app = angular.module('myApp', []);
            app.controller('Ctrl', function ($scope, $http) {
                $http.get("/public/magazines")
                        .then(function (response) {
                            $scope.magazines = response.data;
                        });
                 $http.get("/public/required")
                        .then(function (response) {
                            $scope.required = response.data;
                        });        
                        
            });

