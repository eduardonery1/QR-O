<?php

$path = "./files/";
$diretorio = dir($path);

$entregas = array();
$temp = array();
while($arquivo = $diretorio -> read()){
    $pattern = '/_ok/';
    if (!preg_match($pattern, $arquivo)){
        //$json=);
        //$temp =$json;//->Dados_da_entrega;
        array_push($entregas,json_decode(file_get_contents($path.$arquivo)));
    }
}

echo json_encode($entregas);

?>