<?php

namespace Proxy\Php;

class EmailProxy implements IEmail
{
    public function enviaEmail(string $dadosSender, string $dadosRecipient, string $subject, string $body): string
    {
        $this->geraLog($dadosSender, $dadosRecipient, $subject, $body);
        return (new Email())->enviaEmail($dadosSender, $dadosRecipient, $subject, $body);
    }

    public function geraLog(string $dadosSender, string $dadosRecipient, string $subject, string $body): void
    {
        file_put_contents('log.txt', "{$dadosSender} {$dadosRecipient} {$subject} {$body} \n");
    }
}