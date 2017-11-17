/**
 * Created by enHui.Chen on 2017/9/26 0026.
 */
// 定义模块，进行注入
var uiApp= angular.module("uiApp",["ui.router"]);
// 配置模块
uiApp.config(function ($stateProvider,$urlRouterProvider) {
    //路由配置
    $urlRouterProvider.otherwise("person");
    $stateProvider
        .state('person',{//设置路由名称
            url:'/person',// 设置请求路径
            templateUrl: '/views/person.html',// 设置文件真实位置
            controller: 'PersonController'// 设置控制器
        })
        .state('some',{
            url: '/some',
            templateUrl: '/views/some.html',
            controller: 'SomeController'
        });
});