<?php

namespace Singleton\Php;

class Email
{
    private static ?Email $email = null;

    private function __construct() {}

    public static function getInstance() {
        if(is_null(self::$email)) {
            self::$email = new Email();
        }
        return self::$email;
    }

    public function send(String $subject, String $body, Pessoa $recipient, Pessoa $sender): String {
        // realiza a lógica de envio de email;
        return '...realiza a lógica de enviar os dados a partir de alguma biblioteca de envio de email';
    }
}