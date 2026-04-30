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
    $preco = $_GET["p"];
    echo "O preço do produto é R$ " . number_format($preco, 2);
//    $preco = $preco + ($preco * 10/100);
    $preco += ($preco * 10/100);
    echo "<br> E o novo preço com 10% de aumento será R$ " . number_format($preco, 2);

    $preco -= ($preco * 10/100);
    echo "<br> E o novo preço com 10% de desconto será R$ " . number_format($preco, 2);
    ?>
</div>
</body>
</html>