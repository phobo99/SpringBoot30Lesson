import Home from "./components/Home.vue";
import Login from "./components/Login.vue";
import Register from "./components/Register.vue";
import Profile from "./components/Profile.vue";
import BoardUser from "./components/BoardUser.vue"
import BoardAdmin from "./components/BoardAdmin.vue"
import BoardMod from "./components/BoardMod.vue"
import {createRouter,createWebHistory} from 'vue-router'
const routes = [
  {
    name: "home",
    path: "/",
    alias:"/home",
    component: Home,
  },
  {
    name: "login",
    path: "/login",
    component: Login,
  },
  {
    name: "register",
    path: "/register",
    component: Register,
  },
  {
    name: "profile",
    path: "/profile",
    component: Profile,
  },
  {
      name:"user",
      path:"/user",
      component:BoardUser
  },
  {
      name:"admin",
      path:"/admin",
      component:BoardAdmin
  },
  {
      name:"mod",
      path:"/mod",
      component:BoardMod
  }
];
const router = createRouter({
  history: createWebHistory(),
  routes,
});
router.beforeEach((to, from, next) => {
    const publicPages = ['/login', '/register', '/home'];
    const authRequired = !publicPages.includes(to.path);
    const loggedIn = localStorage.getItem('user');
  
    // trying to access a restricted page + not logged in
    // redirect to login page
    if (authRequired && !loggedIn) {
      next('/login');
    } else {
      next();
    }
  });
export default router;
