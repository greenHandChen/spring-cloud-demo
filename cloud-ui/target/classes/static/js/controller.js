/**
 * Created by enHui.Chen on 2017/9/26 0026.
 */
// 控制器的编写
uiApp.controller('PersonController', function ($scope, $http) {
    // 设置数据模型
    $scope.people = '';
    $scope.errorMsg = '';

    // 定义点击方法
    $scope.getMessageResponse = function (personName) {
        $http.post('/personDispatch', personName).success(function (data) {
            $scope.people = data;
            $scope.errorMsg = '';
        }).error(function () {
            $scope.errorMsg = 'error people request!';
        });
    }
});

uiApp.controller('SomeController', function ($scope, $http) {
    $scope.str = "";
    $scope.errorMsg = "";

    $scope.getSome = function () {
        $http.get('/someDispatch').success(function (data) {
            $scope.str = data;
            $scope.errorMsg = "";
        }).error(function () {
            $scope.errorMsg = 'error some request!';
        });
    }
});