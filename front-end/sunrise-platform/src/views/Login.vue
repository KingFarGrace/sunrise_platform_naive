<template>
  <div class="container">
    <div id="login-card">
      <form id="login-form">
        <h2 id="login-title">登录</h2>
        <label for="username">学号</label>
        <input type="text" name="username" id="username" placeholder="学号"/>
        <label for="password">密码</label>
        <input type="password" name="password" id="password" placeholder="密码"/>
        <input type="button" value="登录">
      </form>
    </div>
  </div>
</template>

<style scoped>

</style>

<script>
    export default {
        name: "Login"
    }
</script>
