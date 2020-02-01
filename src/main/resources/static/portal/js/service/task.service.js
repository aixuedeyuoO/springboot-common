app.service("TaskService",function($http){

    	this.loadProposals = function(){
    		return $http.get("/tasks").then(function(response) {
    			return response.data;
    		}, function(errResponse) {
    			return errResponse;
    		});
    	}

        this.deleteProposal = function(id){
            return $http.delete("/tasks/"+ id).then(function(response) {
                return response.data;
            }, function(errResponse) {
                return errResponse;
            });
        }

        this.analyzeProposal = function(proposal){
            return $http.put("/tasks/"+ proposal.id, proposal).then(function(response) {
                return response.data;
            }, function(errResponse) {
                return errResponse;
            });
        }

});
