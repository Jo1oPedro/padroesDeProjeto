<?php

namespace Proxy\Php;

class Email implements IEmail
{
    public function enviaEmail(string $dadosSender, string $dadosRecipient, string $subject, string $body): string
    {
        return "email enviado com sucesso";
    }
}