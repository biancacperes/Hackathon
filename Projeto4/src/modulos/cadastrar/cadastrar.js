import angular from 'angular';
import uirouter from 'angular-ui-router';

import CadastrarController from './cadastrar.controller';

import condominioService from '../../servicos/condominio.service';

export default angular.module('myApp.cadastrar', [uirouter, condominioService])
  .controller('CadastrarController', CadastrarController)
  .name;



  