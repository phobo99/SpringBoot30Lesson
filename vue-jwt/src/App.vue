<template>
<div>
    <nav class="navbar navbar-expand navbar-dark bg-dark">
        <a href class="navbar-brand" @click.prevent>bezKoder</a>
        <div class="navbar-nav mr-auto">
            <li class="nav-item">
                <router-link to="/home" class="nav-link">
                    <i class="fas fa-home"></i>Home
                </router-link>
            </li>
            <li v-if="showAdminBoard" class="nav-item">
                <router-link to="/admin" class="nav-link">Admin Board</router-link>
            </li>
            <li v-if="showModeratorBoard" class="nav-item">
                <router-link to="/mod" class="nav-link">Moderator Board</router-link>
            </li>
            <li class="nav-item">
                <router-link v-if="currentUser" to="/user" class="nav-link">User</router-link>
            </li>
        </div>

        <div v-if="!currentUser" class="navbar-nav ml-auto">
            <li class="nav-item">
                <router-link to="/register" class="nav-link">
                    <i class="fas fa-user-plus"></i>Sign Up
                </router-link>
            </li>
            <li class="nav-item">
                <router-link to="/login" class="nav-link">
                    <i class="fas fa-sign-in-alt"></i>Login
                </router-link>
            </li>
        </div>

        <div v-if="currentUser" class="navbar-nav ml-auto">
            <li class="nav-item">
                <router-link to="/profile" class="nav-link">
                    <i class="fas fa-user"></i>
                    {{ currentUser.username }}
                </router-link>
            </li>
            <li class="nav-item">
                <a class="nav-link" href @click.prevent="logOut">
                    <i class="fas fa-sign-out-alt"></i>LogOut
                </a>
            </li>
        </div>
    </nav>
    <div class="container">
        <router-view />
    </div>
</div>
</template>

<script>
export default {
    name: 'App',
    computed: {
        currentUser() {
            return this.$store.state.user
        },
        showAdminBoard() {
            if (this.currentUser && this.currentUser.roles) {
                return this.currentUser.roles.includes('ROLE_ADMIN');
            }

            return false;
        },
        showModeratorBoard() {
            if (this.currentUser && this.currentUser.roles) {
                return this.currentUser.roles.includes('ROLE_MODERATOR');
            }

            return false;
        }

    },
    methods: {
        logOut() {
            this.$store.dispatch('logout');
            this.$router.push("/login");
        }
    }
}
</script>

<style>
#app {
    font-family: Avenir, Helvetica, Arial, sans-serif;
    -webkit-font-smoothing: antialiased;
    -moz-osx-font-smoothing: grayscale;

}
</style>
