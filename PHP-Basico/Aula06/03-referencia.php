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
//    $a = 3;
//    $b = $a;
//    $b += 5;
//    echo "A variavel A vale $a";
//    echo "<br>A variavel B vale $b";

    // & faz referencia a variavel, então b faz referencia ao valor de a
    $a = 3;
    $b = &$a;
    $b += 5;
    echo "A variavel A vale $a";
    echo "<br>A variavel B vale $b";
    ?>
</div>
</body>
</html>