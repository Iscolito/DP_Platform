import Vue from 'vue'
import Router from 'vue-router'
import MainPage from '@/components/MainPage'
import Login from '@/components/Login'
import Knowledge from '@/components/Knowledge'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'mainpage',
      component: MainPage,
      meta: {
        title: '主页',
        keepAlive: true // 需要缓存
      }
    },
    {
      path: '/login',
      name: 'login',
      component: Login,
      meta: {
        title: '登录',
        keepAlive: false // 需要缓存
      }
    },
    {
      path: '/knowledge',
      name: 'knowledge',
      component: Knowledge,
      meta: {
        title: '医疗科普',
        keepAlive: true // 需要缓存
      }
    }
  ]
})
