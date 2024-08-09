import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'

     import users from '@/views/modules/users/list'
    import baoxiu from '@/views/modules/baoxiu/list'
    import beiwanglu from '@/views/modules/beiwanglu/list'
    import chengji from '@/views/modules/chengji/list'
    import dictionary from '@/views/modules/dictionary/list'
    import jishiben from '@/views/modules/jishiben/list'
    import jisuanjizhuanyeruanjian from '@/views/modules/jisuanjizhuanyeruanjian/list'
    import jisuanjizhuanyeruanjianCollection from '@/views/modules/jisuanjizhuanyeruanjianCollection/list'
    import jisuanjizhuanyeruanjianLiuyan from '@/views/modules/jisuanjizhuanyeruanjianLiuyan/list'
    import kecheng from '@/views/modules/kecheng/list'
    import kechengCollection from '@/views/modules/kechengCollection/list'
    import kechengLiuyan from '@/views/modules/kechengLiuyan/list'
    import laoshi from '@/views/modules/laoshi/list'
    import sushe from '@/views/modules/sushe/list'
    import susheGuiqin from '@/views/modules/susheGuiqin/list'
    import susheRenruan from '@/views/modules/susheRenruan/list'
    import yinyue from '@/views/modules/yinyue/list'
    import yinyueCollection from '@/views/modules/yinyueCollection/list'
    import yinyueLiuyan from '@/views/modules/yinyueLiuyan/list'
    import yonghu from '@/views/modules/yonghu/list'
    import config from '@/views/modules/config/list'
    import dictionaryBanji from '@/views/modules/dictionaryBanji/list'
    import dictionaryBaoxiu from '@/views/modules/dictionaryBaoxiu/list'
    import dictionaryBeiwanglu from '@/views/modules/dictionaryBeiwanglu/list'
    import dictionaryGuiqin from '@/views/modules/dictionaryGuiqin/list'
    import dictionaryJishiben from '@/views/modules/dictionaryJishiben/list'
    import dictionaryJisuanjizhuanyeruanjian from '@/views/modules/dictionaryJisuanjizhuanyeruanjian/list'
    import dictionaryJisuanjizhuanyeruanjianCollection from '@/views/modules/dictionaryJisuanjizhuanyeruanjianCollection/list'
    import dictionaryKecheng from '@/views/modules/dictionaryKecheng/list'
    import dictionaryKechengCollection from '@/views/modules/dictionaryKechengCollection/list'
    import dictionarySex from '@/views/modules/dictionarySex/list'
    import dictionaryShangxia from '@/views/modules/dictionaryShangxia/list'
    import dictionaryYinyue from '@/views/modules/dictionaryYinyue/list'
    import dictionaryYinyueCollection from '@/views/modules/dictionaryYinyueCollection/list'





//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    } ,{
        path: '/users',
        name: '管理信息',
        component: users
      }
    ,{
        path: '/dictionaryBanji',
        name: '班级',
        component: dictionaryBanji
    }
    ,{
        path: '/dictionaryBaoxiu',
        name: '报修状态',
        component: dictionaryBaoxiu
    }
    ,{
        path: '/dictionaryBeiwanglu',
        name: '备忘录类型',
        component: dictionaryBeiwanglu
    }
    ,{
        path: '/dictionaryGuiqin',
        name: '归寝状态',
        component: dictionaryGuiqin
    }
    ,{
        path: '/dictionaryJishiben',
        name: '记事本类型',
        component: dictionaryJishiben
    }
    ,{
        path: '/dictionaryJisuanjizhuanyeruanjian',
        name: '计算机专业相关的软件类型',
        component: dictionaryJisuanjizhuanyeruanjian
    }
    ,{
        path: '/dictionaryJisuanjizhuanyeruanjianCollection',
        name: '收藏表类型',
        component: dictionaryJisuanjizhuanyeruanjianCollection
    }
    ,{
        path: '/dictionaryKecheng',
        name: '课程类型',
        component: dictionaryKecheng
    }
    ,{
        path: '/dictionaryKechengCollection',
        name: '收藏表类型',
        component: dictionaryKechengCollection
    }
    ,{
        path: '/dictionarySex',
        name: '性别类型',
        component: dictionarySex
    }
    ,{
        path: '/dictionaryShangxia',
        name: '上下架',
        component: dictionaryShangxia
    }
    ,{
        path: '/dictionaryYinyue',
        name: '音乐类型',
        component: dictionaryYinyue
    }
    ,{
        path: '/dictionaryYinyueCollection',
        name: '收藏表类型',
        component: dictionaryYinyueCollection
    }
    ,{
        path: '/config',
        name: '轮播图',
        component: config
    }


    ,{
        path: '/baoxiu',
        name: '宿舍报修',
        component: baoxiu
      }
    ,{
        path: '/beiwanglu',
        name: '备忘录',
        component: beiwanglu
      }
    ,{
        path: '/chengji',
        name: '成绩',
        component: chengji
      }
    ,{
        path: '/dictionary',
        name: '字典',
        component: dictionary
      }
    ,{
        path: '/jishiben',
        name: '记事本',
        component: jishiben
      }
    ,{
        path: '/jisuanjizhuanyeruanjian',
        name: '计算机专业相关的软件',
        component: jisuanjizhuanyeruanjian
      }
    ,{
        path: '/jisuanjizhuanyeruanjianCollection',
        name: '计算机专业相关的软件收藏',
        component: jisuanjizhuanyeruanjianCollection
      }
    ,{
        path: '/jisuanjizhuanyeruanjianLiuyan',
        name: '计算机专业相关的软件留言',
        component: jisuanjizhuanyeruanjianLiuyan
      }
    ,{
        path: '/kecheng',
        name: '课程',
        component: kecheng
      }
    ,{
        path: '/kechengCollection',
        name: '课程收藏',
        component: kechengCollection
      }
    ,{
        path: '/kechengLiuyan',
        name: '课程留言',
        component: kechengLiuyan
      }
    ,{
        path: '/laoshi',
        name: '老师',
        component: laoshi
      }
    ,{
        path: '/sushe',
        name: '宿舍',
        component: sushe
      }
    ,{
        path: '/susheGuiqin',
        name: '宿舍归寝',
        component: susheGuiqin
      }
    ,{
        path: '/susheRenruan',
        name: '宿舍人员',
        component: susheRenruan
      }
    ,{
        path: '/yinyue',
        name: '音乐',
        component: yinyue
      }
    ,{
        path: '/yinyueCollection',
        name: '音乐收藏',
        component: yinyueCollection
      }
    ,{
        path: '/yinyueLiuyan',
        name: '音乐留言',
        component: yinyueLiuyan
      }
    ,{
        path: '/yonghu',
        name: '用户',
        component: yonghu
      }


    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
