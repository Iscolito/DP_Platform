import Vue from 'vue'
import Router from 'vue-router'
import MainPage from '@/components/MainPage'
import Login from '@/components/Login'
import Regist from '@/components/regist'
import Knowledge from '@/components/Knowledge'
import info1 from '@/components/info1'
import info1p1 from '@/components/info1p1'
import back from '@/components/Back'
import doctor from '@/components/DoctorPage'
import Userdomain from '@/components/Userdomain'
import Chat from '@/components/chat'
import Chatlist from '@/components/chatlist'
import DChatlist from '@/components/dchatlist'
import DChat from '@/components/dchat'

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
      path: '/regist',
      name: 'regist',
      component: Regist,
      meta: {
        title: '注册',
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
    },
    {
      path: '/userdomain',
      name: 'userdomain',
      component: Userdomain,
      meta: {
        title: '用户管理',
      }
    },
    {
      path: '/chat',
      name: 'chat',
      component: Chat,
      meta: {
        title: '交流区',
      }
    },
    {
      path: '/chatlist',
      name: 'chatlist',
      component: Chatlist,
      meta: {
        title: '交流区',
      }
    },
    {
      path: '/dchatlist',
      name: 'dchatlist',
      component: DChatlist,
      meta: {
        title: '编辑区',
      }
    },
    {
      path: '/dchat',
      name: 'dchat',
      component: DChat,
      meta: {
        title: '编辑区',
      }
    },
  ]
})
