var App = angular.module('gpaApp', []);
App.controller('gpaAppController', function($scope, $http, $window ) {
    var formLogin = {
        login :"",
        password:""
    }
    $scope.init = function() {}
    $scope.init();
    $scope.validaLogin = function(login,password) {
        formLogin.login = login;
        formLogin.password = password;
        /*$http.get('https://oc-129-144-158-115.compute.oraclecloud.com/rest/venda-online/v1/corretores/validar-corretora?corretora=2123&cep=123').success(function(response, status, headers, config) {
              if (response.status === true) {
                  console.log(response);
                  }else{
                  console.log(response);
              }
              console.log(response);
          }).error(function(response, status, headers, config) {});
         */
        console.log(formLogin);
        if(formLogin.login == "weblogic" && formLogin.password == "welcome1"){
            window.sessionStorage.setItem('token', 'autenticado');
            window.location.href = "formSearch.html"
        }
    };

});
