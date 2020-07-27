<?php
require_once('lib/nusoap.php');
$wsdl_url='http://localhost:8080/wbpersona/swdatos?WSDL';
$cliente =new SoapClient($wsdl_url);
$rlista=$cliente->ingreso();
echo"<pre>";
print_r($rlista);
?>