import axios from 'axios'
const API_URL = 'http://localhost:8888/api/auth/';
class AuthenService {
    async login(user){
        return  await axios.post(API_URL+'signin',{
            username:user.username,
            password:user.password
        })
        // .then(res=>{
        //     console.log(JSON.stringify(res.data))
        //     if(res.data.token){
        //         localStorage.setItem("user",JSON.stringify(res.data))
        //     }
            
        //     return JSON.stringify(res.data)
        // }).catch(err=>{
        //     console.log(err.data)
        //     return null
        // })
    }
    logout(){
        localStorage.removeItem("user");
    }

    async register(user){
        return  await axios.post(API_URL+'signup',{
            username:user.username,
            email:user.email,
            password:user.password
        })
    }
}

export default new AuthenService()