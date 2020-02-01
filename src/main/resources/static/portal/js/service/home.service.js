app.service("HomeService",function($http){
	this.submitProposal = function(proposal){
		return $http.post("/tasks", proposal).then(function(response) {
			return response.data;
		}, function(errResponse) {
			return errResponse;
		});
	}

});
