import angular from 'angular';

class CondominioService {

    constructor($http) {
        this.$http = $http;
        //const apiBase = "http://localhost:9090/projeto/api";
        const apiBase = "http://localhost:8080";
        this.path =  apiBase + "/condominio";
    }
    
    getCondominios() {
        return this.$http.get(this.path);
    }
    save(condominio){
        this.$http.post(this.path + '/salvar',condominio)
    }
}

export default angular.module('services.condominio-service', [])
.service('condominioService', CondominioService)
.name;