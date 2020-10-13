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
  .container {
    display: flex;
    justify-content: center;
    align-items: center;
    width: 100%;
    height: 100%;
    background-image: url("http://placekitten.com/1920/1080");
    background-size: cover;
  }

  #login-card {
    width: 60%;
    min-width: 40px;
    max-width: 800px;
    padding: 36px 24px;
    border-radius: 12px;
    background-color: rgba(255, 255, 255, 0.6);
  }

  #login-form {
    display: flex;
    flex-direction: column;
    justify-content: center;
    align-items: stretch;
    font-size: 24px;
  }

  #login-form input,
  #login-form label {
    font-size: 18px;
  }

  #login-title {
    text-align: center;
  }

  #login-form input[type="text"],
  #login-form input[type="password"] {
    border: 1px solid #ccc;
    background-color: rgba(255, 255, 255, 0.6);
    border-radius: 4px;
    margin-bottom: 1.2em;
    padding: 0.2em;
  }

  #login-form input[type="button"] {
    color: white;
    border: 1px solid #46b8da;
    border-radius: 4px;
    background-color: #5bc0de;
    padding: 0.2em;
  }
</style>

<script>
    export default {
        name: "Login"
    }
</script>
