var app = angular.module('proposalApp', ['ui.mask','ngRoute']);

app.config(['$routeProvider', function($routeProvider, $provide) {

	$routeProvider
		.when('/', {
			templateUrl : 'portal/templates/home.html',
			controller: 'HomeController'
		})
        .when('/tasks', {
            templateUrl : 'portal/templates/task.html',
            controller: 'TaskController'
        })
		.otherwise({
			redirectTo: '/'
		});

}]);
