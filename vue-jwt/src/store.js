import {createStore} from 'vuex'
import createPersistedState from "vuex-persistedstate";
import AuthenService from './services/AuthenService'
const user = localStorage.getItem("user")
const initialState = user?{login:true,user}:{login:false,user:null}
import router from './router'
export const store = createStore({

    state(){
        return{
            login:initialState.login,
            user:initialState.user
        }
    },
    getters:{

    },
    mutations:{
       
        loginSuccess(state,user){
            state.login = true
            state.user = user
        },
        loginFailure(state){
            state.login = false,
            state.user = {}
        },
        logout(state){
            state.user = null
            state.login = false
            AuthenService.logout()
        },
        // register(state,user){
        //     state.login = false
        //     AuthenService.register(user)
        // },
        registerSuccess(state){
            state.login = true
            router.push("/login")
        },
        registerFailure(state){
            state.login = false
        }
    },
    actions:{
        login({commit},user){
            AuthenService.login(user).then(res=>{
                localStorage.setItem("user",JSON.stringify(res.data))
                commit('loginSuccess',res.data)
                router.push("/profile")
            }).catch(err=>{
                Promise.reject(err)
                console.log(err.message)
                commit('loginFailure')
            })
        },
        
        logout(context){
            context.commit('logout')
        },
        register({commit},user){
            AuthenService.register(user).then(()=>{
                commit("registerSuccess");
                
            }).catch(err=>{
                Promise.reject(err)
                console.log(err.message)
                commit('registerFailure')
            })
        }
    },
    plugins: [createPersistedState()]


})