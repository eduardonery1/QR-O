<?php

$id = $_POST['id'];

$nome_cliente = $_POST['nome_cliente'];
$endereco_recebimento = $_POST['endereco_recebimento'];
$endereco_entrega = $_POST['endereco_entrega'];

$dados = array($id,$nome_cliente,$endereco_recebimento,$endereco_entrega);
$dados_entrega = array("Dados_da_entrega" => $dados);
$dados_json = json_encode($dados_entrega);
        
$fp = fopen("./files/".$id.".json", "a");
//$fp = fopen(".\files\".$id.".json", "a");
$escreve = fwrite($fp, $dados_json);
fclose($fp);

$result="0";
echo json_encode($result);

?>