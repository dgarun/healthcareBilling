app.config(['$stateProvider', '$httpProvider', '$logProvider', '$urlRouterProvider', function ($stateProvider, $httpProvider, $log, $urlRouterProvider) {
	
	
	$stateProvider
	.state('login', {
        url: '/',
        views: {
            'fillpage': {
                templateUrl: 'scripts/app/base-layout/views/main.html',
                controller: 'mainController'
            }
        }
    });
	
	$urlRouterProvider.otherwise('/');
}]);


