var pages = {
        name: "pages",
        abstract: true,
        views: {
            'fillpage': {
                templateUrl: 'scripts/app/base-layout/views/main.html',
                controller: 'mainController'
            }
        }
};
		 
app.config(['$stateProvider', '$httpProvider', '$logProvider', '$urlRouterProvider', function ($stateProvider, $httpProvider, $log, $urlRouterProvider) {
	$urlRouterProvider.otherwise('/');
}]);


