<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="../Aula06/_css/estilo.css">
</head>
<body>
<div>
    <?php
    $atual = $_GET["aa"];
    echo "O ano atual é $atual e o ano anterior é " . --$atual . " O proximo ano é " . ++ $atual ;
    ?>
</div>
</body>
</html>