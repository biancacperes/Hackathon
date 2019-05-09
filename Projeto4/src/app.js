'use strict';

import angular from 'angular'
import uirouter from 'angular-ui-router';
var blockUI = require('angular-block-ui');

import 'bootstrap';
import './scss/app.scss';

import routing from './app.config';

import condominio from './modulos/condominio/condominio.js';
import home from './modulos/home/home.js';
import cadastrar from './modulos/cadastrar/cadastrar.js';

angular
.module('myApp', [
  uirouter,
  blockUI,
  condominio, 
  cadastrar,
  home
])
.config(routing);