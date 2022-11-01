import Vue from 'vue'
import Router from 'vue-router'
import MainPage from '@/components/MainPage'
import Login from '@/components/Login'
import Knowledge from '@/components/Knowledge'
import info1 from '@/components/info1'
import info1p1 from '@/components/info1p1'
import back from '@/components/Back'
import doctor from '@/components/DoctorPage'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'mainpage',
      component: MainPage,
      meta: {
        title: '主页',
      }
    },
    {
      path: '/login',
      name: 'login',
      component: Login,
      meta: {
        title: '登录',
      }
    },
    {
      path: '/knowledge',
      name: 'knowledge',
      component: Knowledge,
      meta: {
        title: '医疗科普',
      }
    },
    {
      path: '/knowledge/info1',
      name: 'info1',
      component: info1,
      meta: {
        title: '医疗科普',
      }
    },
    {
      path: '/knowledge/info1/p1',
      name: 'info1p1',
      component: info1p1,
      meta: {
        title: '医疗科普',
      }
    },
    {
      path: '/back',
      name: 'back',
      component: back,
      meta: {
        title: '后台',
      }
    },
    {
      path: '/doctor',
      name: 'doctor',
      component: doctor,
      meta: {
        title: '医生主页',
      }
    }
  ]
})
