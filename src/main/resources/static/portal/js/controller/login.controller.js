app.controller("LoginController", function($scope, $http){
    // 登陆方法
    $scope.userLogin = function() {
        $http({
            method: 'POST',
            url: '/userLogin',
            // params: { id: '1002' },//params作为url的参数
            data: $scope.loginInfo //作为消息体参数
        }).then(function successCallback(response) {
            alert(response.data.resultCode);

            //成功的回调函数获取到数据给scope域
        }, function errorCallback(response) {
            
        });
    }
});