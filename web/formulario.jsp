<%@page import="java.io.RandomAccessFile"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Horoscopo</title>
        <link rel="stylesheet" type="text/css" href="css//css.css">
        <script defer src="js/validacoes.js" type="text/javascript"></script>
    </head>
    <body class="main-bg">
        <div class="nav">
            <div class="nav-btn">
              <label for="nav-check">
                <span></span>
                <span></span>
                <span></span>
              </label>
            </div>

            <div class="nav-links">
              <a href="InvalidaSessao" >Logout</a>
            </div>
        </div>
        <div  class="login-container text-c animated flipInX">
                <div>
                    <h1 class="logo-badge text-whitesmoke"><span class="fa fa-user-circle"></span></h1>
                </div>
                    <h3 class="text-whitesmoke">Bem-Vindo ao horóscopo</h3>
                    <p class="text-whitesmoke">Selecione a data de nascimento</p>
                <div class="container-content">
                    <form method='post' onsubmit="mostraPrevisao(this); mostraSigno(this); mostraImagem(this);">
                        <div class="form-group">
                            <input type="date" name="data" id="data" class="form-control" placeholder="Data de Nascimento">
                        </div>
                        <button type="submit" class="form-button button-l margin-b">Gerar Previsão</button>
                    </form>
                    <h1 style="color:white;" id="signo"></h1>
                    <p style="color:white;" id="previsao"></p>
                </div>

                <img src="" id="imagem">
                
        </div>
    </body>
</html>
