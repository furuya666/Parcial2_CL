<?php
require_once('lib/nusoap.php');
$wsdl_url='http://localhost:57157/WebService1.asmx?WSDL';
$cliente =new SoapClient($wsdl_url);
$rlista=$cliente->listado();
echo"<pre>";
print_r($rlista);
?>