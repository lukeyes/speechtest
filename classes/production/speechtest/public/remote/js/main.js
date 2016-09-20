var app = angular.module('myApp', []);
app.controller('formCtrl', ['$scope', '$log', '$http',
function($scope, $log, $http) {

    $scope.textToSend = "Hello World";

   $scope.onSend = function() {
        console.log($scope.textToSend);
        $scope.postToEndpoint();
   }

   $scope.postToEndpoint = function() {

   var dataObj = {
				speech : $scope.textToSend
		};



            console.log(dataObj);

            var url = "/api/v1/speak";


      $http.post(
        url,
         dataObj).
        then(function(response) {
            console.log("Success");
        }, function(response) {
          console.log("fail");
      });
    };

}]);