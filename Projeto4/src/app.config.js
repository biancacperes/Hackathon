routing.$inject = ['$stateProvider', '$urlRouterProvider'];

export default function routing($stateProvider, $urlRouterProvider) {
    let homeState = {
        name: 'home',
        url: '/home',
        templateUrl: './modulos/home/home.view.html',
        controller: 'HomeController',
        controllerAs: 'vm'
      }
      $stateProvider.state(homeState);
      
      let condominioState = {
        name: 'condominio',
        url: '/condominio',
        templateUrl: './modulos/condominio/condominio.view.html',
        controller: 'CondominioController',
        controllerAs: 'vm'
      }
      $stateProvider.state(condominioState);
      
      let cadastrarState = {
        name: 'cadastrar',
        url: '/cadastrar',
        templateUrl: './modulos/cadastrar/cadastrar.view.html',
        controller: 'CadastrarController',
        controllerAs: 'vm'
      }
      $stateProvider.state(cadastrarState);
       
      $urlRouterProvider.otherwise('/home')
 
}