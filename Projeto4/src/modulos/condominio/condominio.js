import angular from 'angular';
import uirouter from 'angular-ui-router';

import CondominioController from './condominio.controller';

import condominioService from '../../servicos/condominio.service';

export default angular.module('myApp.condominio', [uirouter, condominioService])
  .controller('CondominioController', CondominioController)
  .name;

  