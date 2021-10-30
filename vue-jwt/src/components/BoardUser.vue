<template>
<div class="container">
    <header class="jumbotron">
        <h3>{{content}}</h3>
    </header>
</div>
</template>

<script>
import UserService from '../services/UserService'
export default {
    name:'BoardUser',
    data(){
        return{
            content:''
        }
    },
    mounted(){
        UserService.getUserBoard().then(res=>{
            this.content = res.data
        },error=>{
            this.content =
          (error.response && error.response.data) ||
          error.message ||
          error.toString();
        })
    }
}
</script>

<style scoped>

</style>
