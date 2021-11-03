
function ajaxInit(){
    var xmlhttp;

    try{
        xmlhttp = new XMLHttpRequest();
    }catch(ee){
        try{
            xmlhttp = new ActiveXObject ("Msxml2.XMLHTTP") ;
        }catch(e){
            try{
                xmlhttp = new ActiveXObject ("Microsoft.XMLHTTP") ;
            }catch(E){
                xmlhttp = null;
            }
        }
    }

    return xmlhttp;
}

function carregar(component, nome){
    var ajax = ajaxInit();
    document.getElementById(component).innerHTML = "Carregando...";
        
    //var enviado = nome + campos;
    if(ajax){
        ajax.open('GET',nome,true);
        ajax.onreadystatechange = function(){
            if(ajax.readyState == 4){
                if(ajax.status == 200){
                    document.getElementById(component).innerHTML = ajax.responseText;
                }
            }
        }
    }
                
    ajax.send(null);
}
	
//crio uma função init qu
function chama(){
                
    // pegamos o elemento com id enviar e assim que clicar nele chama a função pega
    document.getElementById("enviar").onclick = pega;
}
            
// crio  a função que pega o valor dos campos
function pega(){
                
    //pego o campo nome
    var pesquisa  = document.getElementById("pesquisa").value;
    var tipo = document.getElementById("tipo").value;
    var chave = document.getElementById("chave").value;        
    // pego o campo idade
    //var idade = document.getElementById("idade").value;
                
    // exibo em um alert só para testar
    //alert(pesquisa + " " + tipo + " " + chave);
    carregar('resultado','Cadastro?pesquisa='+pesquisa+'&tipo='+tipo+'&chave='+chave);
    
}