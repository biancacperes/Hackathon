import { inherit } from "@uirouter/core";

export default class CondominioController {

  constructor(condominioService) {
    var vm = this;
    this.name = 'Condominio';

    init();

    function init(){
      condominioService.getCondominios().then(function abc(resp) {
        vm.condominios = resp.data;
      });
    }
  }
  
}
CondominioController.$inject = ['condominioService'];
