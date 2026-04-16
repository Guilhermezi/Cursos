<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Funcoes Aritimetricas em PHP</title>
    <link rel="stylesheet" href="_css/estilo.css">
    <style>
        h2 {
            font: 12pt Arial;
            color: #131b28;
        }
    </style>
</head>
<body>
<div>
    <?php
    $v1 = $_GET["x"];
    $v2 = $_GET["y"];
    echo "<h2>Valores recebidos: $v1 e $v2</h2>";
    echo "O valor Absoluto de $v2 e ".abs($v2);
    echo "<br/>O valor de $v1<sup>$v2</sup> e ".pow($v1, $v2);
    echo "<br/> A raiz de $v1 e ".sqrt($v1);
    echo "<br/> O valor de $v2 arredpndado e ".round($v2); //ceil floor
    echo "<br/> a parte inteira de $v2 e".intval($v2);
    echo "<br/> O valor de $v1 em moeda e R$".floatval($v1); .number_format($v1, 2, ",", ".")


    ?>
</div>
</body>
</html>