<?php

$id = $_POST['id'];

$check = $_POST['check'];

$dados = array($check);
$status_entrega = array("Status_da_entrega" => $dados);
$dados_json = json_encode($status_entrega);
        
$fp = fopen("./files/".$id.".json", "a");
//$fp = fopen(".\files\".$id.".json", "a");
$escreve = fwrite($fp, $dados_json);
fclose($fp);

//Muda o nome do arquivo para _ok.json se a confirmação foi realizada com sucesso
if (strcmp($check, "confirmado") == 0){
    rename("./files/".$id.".json","./files/".$id."_ok.json");
}

$result="0";
echo json_encode($result);

?>