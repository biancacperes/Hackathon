import { inherit } from "@uirouter/core";

export default class CadastrarController {

  constructor(condominioService) {
    var vm = this;
    
    vm.save = save;
 

    function save(){
        debugger
        vm.condominio;
        condominioService.save(vm.condominio);
    }
  }
  
}
CadastrarController.$inject = ['condominioService'];