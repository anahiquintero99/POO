<?php
require_once("car.php");
require_once("UberX.php");
require_once("account.php");

$uberX = new UberX("QUGA132", new Account("Anahi Quintero", "ABCE123"), "chevrolet", "Spark");
$uberX->printDataCar();
?>