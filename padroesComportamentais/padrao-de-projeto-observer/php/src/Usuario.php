<?php

namespace Observer\Php;

class Usuario implements \SplObserver
{

    private string $notificacaoDesconto = "";
    public function update(\SplSubject $subject): void
    {
        $mensagem = "";

        /** @var Loja $subject */
        /** @var Produto $produtoEmPromocao */
        foreach($subject->getProdutosEmPromocao() as $produtoEmPromocao) {
            $mensagem .= "nome do produto: {$produtoEmPromocao->getNome()} | preco: {$produtoEmPromocao->getPreco()}";
        }
        $this->notificacaoDesconto = $mensagem;
    }

    public function getNotificacaoDesconto(): string
    {
        return $this->notificacaoDesconto;
    }
}