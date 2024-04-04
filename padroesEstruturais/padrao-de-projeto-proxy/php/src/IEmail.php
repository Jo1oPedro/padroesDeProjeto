<?php

namespace Proxy\Php;

interface IEmail
{
    public function enviaEmail(string $dadosSender, string $dadosRecipient, string $subject, string $body): string;
}