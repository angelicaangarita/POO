<?php
    require_once 'car.php';
    require_once 'uberX.php';
    require_once 'account.php';

    $uberX = new UberX("CVFSDD", new Account("Andres Herrera", "123AFD"), "Chevrolet", "Spark");
    $uberX ->printDataCar();

?>