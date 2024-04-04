<?php

namespace Observer\Php;

class Loja implements \SplSubject
{
    private array $produtosEmPromocao = [];

    private \SplObjectStorage $observers;
    public function __construct()
    {
        $this->observers = new \SplObjectStorage();
    }

    public function setProdutosEmPromocao(Produto $produto): Loja
    {
        $this->produtosEmPromocao[] = $produto;
        return $this;
    }

    public function getProdutosEmPromocao(): array
    {
        return $this->produtosEmPromocao;
    }

    public function attach(\SplObserver $observer): Loja
    {
        $this->observers->attach($observer);
        return $this;
    }

    public function detach(\SplObserver $observer): Loja
    {
        $this->observers->detach($observer);
        $this;
    }

    public function notify(): Loja
    {
        foreach($this->observers as $observer) {
            $observer->update($this);
        }
        return $this;
    }
}