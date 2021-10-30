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
    name: 'Home',
    data(){
        return{
            content:""
        }
    },
    mounted(){
        UserService.getPublicContent().then(
            res=>{
                this.content = res.data;
            }
        ).catch(error=>{
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
