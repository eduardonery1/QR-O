<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <meta charset="UTF-8">
        <title></title>
    </head>
    <body>
        <?php
        // put your code here
        ?>
        <form action="cadastro.php" method="post">
            id:  <input type="text" name="id" /><br />
            Nome:  <input type="text" name="nome_cliente" /><br />
            End1: <input type="text" name="endereco_recebimento" /><br />
            End2: <input type="text" name="endereco_entrega" /><br />
            <input type="submit" name="submit" value="Go!" />
        </form>
        
        <BR>
        <form action="confirmacao.php" method="post">
            id:  <input type="text" name="id" /><br />
            Confirmação:  <input type="text" name="check" /><br />
            <input type="submit" name="submit" value="Go!" />
        </form>
        
        <?php include('disponibilidade.php') ?>
    </body>
</html>
