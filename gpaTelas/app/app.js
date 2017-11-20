var app = angular.module('angularTable', ['angularUtils.directives.dirPagination']);

app.controller('listdata', function($scope, $http) {
  $scope.init = function() {
    $scope.token = window.sessionStorage.getItem('token');
    if ($scope.token !== 'autenticado') {
      window.location.href = "login.html"
    }
  }
  $scope.init();
  $scope.products = [{
      'linha': 1,
      'enviar': true,
      'plu': 'testePLU',
      'desvincula': 'SIM',
      'ean': '2134234',
      'descricao': 'teste',
      'dataChegada': 'teste',
      'subCategoria': 'teste',
      'atributo2': 'teste',
      'atributo3': 'teste',
      'atributo4': 'teste',
      'atributo5': 'teste'
    },
    {
      'linha': 2,
      'enviar': true,
      'plu': 'testePLU',
      'desvincula': 'SIM',
      'ean': '2134234',
      'descricao': 'teste',
      'dataChegada': 'teste',
      'subCategoria': 'teste',
      'atributo2': 'teste',
      'atributo3': 'teste',
      'atributo4': 'teste',
      'atributo5': 'teste'
    },
    {
      'linha': 3,
      'enviar': true,
      'plu': 'testePLU',
      'desvincula': 'SIM',
      'ean': '2134234',
      'descricao': 'teste',
      'dataChegada': 'teste',
      'subCategoria': 'teste',
      'atributo2': 'teste',
      'atributo3': 'teste',
      'atributo4': 'teste',
      'atributo5': 'teste'
    },
    {
      'linha': 4,
      'enviar': true,
      'plu': 'testePLU',
      'desvincula': 'SIM',
      'ean': '2134234',
      'descricao': 'teste',
      'dataChegada': 'teste',
      'subCategoria': 'teste',
      'atributo2': 'teste',
      'atributo3': 'teste',
      'atributo4': 'teste',
      'atributo5': 'teste'
    },
    {
      'linha': 5,
      'enviar': true,
      'plu': 'testePLU',
      'desvincula': 'SIM',
      'ean': '2134234',
      'descricao': 'teste',
      'dataChegada': 'teste',
      'subCategoria': 'teste',
      'atributo2': 'teste',
      'atributo3': 'teste',
      'atributo4': 'teste',
      'atributo5': 'teste'
    },
    {
      'linha': 6,
      'enviar': true,
      'plu': 'testePLU',
      'desvincula': 'SIM',
      'ean': '2134234',
      'descricao': 'teste',
      'dataChegada': 'teste',
      'subCategoria': 'teste',
      'atributo2': 'teste',
      'atributo3': 'teste',
      'atributo4': 'teste',
      'atributo5': 'teste'
    },
    {
      'linha': 7,
      'enviar': true,
      'plu': 'testePLU',
      'desvincula': 'SIM',
      'ean': '2134234',
      'descricao': 'teste',
      'dataChegada': 'teste',
      'subCategoria': 'teste',
      'atributo2': 'teste',
      'atributo3': 'teste',
      'atributo4': 'teste',
      'atributo5': 'teste'
    },
    {
      'linha': 8,
      'enviar': true,
      'plu': 'testePLU',
      'desvincula': 'SIM',
      'ean': '2134234',
      'descricao': 'teste',
      'dataChegada': 'teste',
      'subCategoria': 'teste',
      'atributo2': 'teste',
      'atributo3': 'teste',
      'atributo4': 'teste',
      'atributo5': 'teste'
    },
    {
      'linha': 9,
      'enviar': true,
      'plu': 'testePLU',
      'desvincula': 'SIM',
      'ean': '2134234',
      'descricao': 'teste',
      'dataChegada': 'teste',
      'subCategoria': 'teste',
      'atributo2': 'teste',
      'atributo3': 'teste',
      'atributo4': 'teste',
      'atributo5': 'teste'
    },
    {
      'linha': 10,
      'enviar': true,
      'plu': 'testePLU',
      'desvincula': 'SIM',
      'ean': '2134234',
      'descricao': 'teste',
      'dataChegada': 'teste',
      'subCategoria': 'teste',
      'atributo2': 'teste',
      'atributo3': 'teste',
      'atributo4': 'teste',
      'atributo5': 'teste'
    },
    {
      'linha': 11,
      'enviar': true,
      'plu': 'testePLU',
      'desvincula': 'SIM',
      'ean': '2134234',
      'descricao': 'teste',
      'dataChegada': 'teste',
      'subCategoria': 'teste',
      'atributo2': 'teste',
      'atributo3': 'teste',
      'atributo4': 'teste',
      'atributo5': 'teste'
    },
    {
      'linha': 12,
      'enviar': true,
      'plu': 'testePLU',
      'desvincula': 'SIM',
      'ean': '2134234',
      'descricao': 'teste',
      'dataChegada': 'teste',
      'subCategoria': 'teste',
      'atributo2': 'teste',
      'atributo3': 'teste',
      'atributo4': 'teste',
      'atributo5': 'teste'
    },
    {
      'linha': 13,
      'enviar': true,
      'plu': 'testePLU',
      'desvincula': 'SIM',
      'ean': '2134234',
      'descricao': 'teste',
      'dataChegada': 'teste',
      'subCategoria': 'teste',
      'atributo2': 'teste',
      'atributo3': 'teste',
      'atributo4': 'teste',
      'atributo5': 'teste'
    },
    {
      'linha': 14,
      'enviar': true,
      'plu': 'testePLU',
      'desvincula': 'SIM',
      'ean': '2134234',
      'descricao': 'teste',
      'dataChegada': 'teste',
      'subCategoria': 'teste',
      'atributo2': 'teste',
      'atributo3': 'teste',
      'atributo4': 'teste',
      'atributo5': 'teste'
    },
    {
      'linha': 15,
      'enviar': true,
      'plu': 'testePLU',
      'desvincula': 'SIM',
      'ean': '2134234',
      'descricao': 'teste',
      'dataChegada': 'teste',
      'subCategoria': 'teste',
      'atributo2': 'teste',
      'atributo3': 'teste',
      'atributo4': 'teste',
      'atributo5': 'teste'
    },
    {
      'linha': 16,
      'enviar': true,
      'plu': 'testePLU',
      'desvincula': 'SIM',
      'ean': '2134234',
      'descricao': 'teste',
      'dataChegada': 'teste',
      'subCategoria': 'teste',
      'atributo2': 'teste',
      'atributo3': 'teste',
      'atributo4': 'teste',
      'atributo5': 'teste'
    },
    {
      'linha': 17,
      'enviar': true,
      'plu': 'testePLU',
      'desvincula': 'SIM',
      'ean': '2134234',
      'descricao': 'teste',
      'dataChegada': 'teste',
      'subCategoria': 'teste',
      'atributo2': 'teste',
      'atributo3': 'teste',
      'atributo4': 'teste',
      'atributo5': 'teste'
    },
    {
      'linha': 18,
      'enviar': true,
      'plu': 'testePLU',
      'desvincula': 'SIM',
      'ean': '2134234',
      'descricao': 'teste',
      'dataChegada': 'teste',
      'subCategoria': 'teste',
      'atributo2': 'teste',
      'atributo3': 'teste',
      'atributo4': 'teste',
      'atributo5': 'teste'
    }
  ];




  $scope.sort = function(keyname) {
    $scope.sortKey = keyname;
    $scope.reverse = !$scope.reverse; 
  }


  $scope.editingData = {};

  for (var i = 0, length = $scope.products.length; i < length; i++) {
    $scope.editingData[$scope.products[i].linha] = false;
  }


  $scope.modify = function(product) {
    $scope.editingData[product.linha] = true;
  };


  $scope.update = function(product) {
    $scope.editingData[product.linha] = false;
  };
});
