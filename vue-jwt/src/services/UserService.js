import axios from 'axios'
import AuthenHeader from './AuthenHeader'
const API_URL = "http://localhost:8888/api/test/"

class UserService {
    async getPublicContent(){
        return await axios.get(API_URL + 'all')
    }

    async getUserBoard(){
        return await axios.get(API_URL + 'user',{
            headers:AuthenHeader()
        })
    }

    async getModeratorBoard(){
        return await axios.get(API_URL + 'mod',{
            headers:AuthenHeader()
        })
    }

    async getAdminBoard(){
        return await axios.get(API_URL + 'admin',{
            headers:AuthenHeader()
        })
    }
}
export default new UserService()