/* global fetch */

function mostraPrevisao(myform)
{
    event.preventDefault(); //evitar a submissão/reload da página    
   
    var httpRequest = new XMLHttpRequest();
    httpRequest.open("post","./ServletGeraPrevisao");
    var formData = new FormData(myform); //para recuperar os parâmetros do form
    const data = new URLSearchParams();

    for (const pair of formData)   //inserindo os parâmetros individualmente
        data.append(pair[0], pair[1]);
    
    httpRequest.send(data); // enviando os parâmetros junto com a chamada do servlet
    httpRequest.onreadystatechange = function () 
    {
        if (httpRequest.readyState === 4 && httpRequest.status === 200)  
           document.getElementById("previsao").innerHTML=httpRequest.responseText;
        
    };    
}

function mostraSigno(myform)
{
    event.preventDefault(); //evitar a submissão/reload da página    
   
    var httpRequest = new XMLHttpRequest();
    httpRequest.open("post","./ServletGeraSigno");
    var formData = new FormData(myform); //para recuperar os parâmetros do form
    const data = new URLSearchParams();

    for (const pair of formData)   //inserindo os parâmetros individualmente
        data.append(pair[0], pair[1]);
    
    httpRequest.send(data); // enviando os parâmetros junto com a chamada do servlet
    httpRequest.onreadystatechange = function () 
    {
        if (httpRequest.readyState === 4 && httpRequest.status === 200)  
           document.getElementById("signo").innerHTML=httpRequest.responseText;
        
    };   
}

function mostraImagem(myform)
{
    event.preventDefault(); //evitar a submissão/reload da página    
   
    var httpRequest = new XMLHttpRequest();
    httpRequest.open("post","./ServletGeraImagem");
    var formData = new FormData(myform); //para recuperar os parâmetros do form
    const data = new URLSearchParams();

    for (const pair of formData)   //inserindo os parâmetros individualmente
        data.append(pair[0], pair[1]);
    
    httpRequest.send(data); // enviando os parâmetros junto com a chamada do servlet
    httpRequest.onreadystatechange = function () 
    {
        if (httpRequest.readyState === 4 && httpRequest.status === 200)  
           document.getElementById("imagem").src = innerHTML=httpRequest.responseText;
        
    };   
}