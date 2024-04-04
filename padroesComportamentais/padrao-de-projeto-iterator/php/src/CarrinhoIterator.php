<?php

namespace Iterator\Php;

use Ds\Vector;

class CarrinhoIterator implements \Iterator
{
    private Vector $vector;
    private int $position = 0;
    private bool $reverse;
    public function __construct(Vector $vector, bool $reverse = false)
    {
        $this->vector = $vector;
        $this->reverse = $reverse;
    }

    public function current(): mixed
    {
        return $this->vector->get($this->position);
    }

    public function next(): void
    {
        $this->position = $this->position + ($this->reverse ? -1 : 1);
    }

    public function key(): mixed
    {
        return $this->position;
    }

    public function valid(): bool
    {
        if ($this->position >= 0 && $this->position < $this->vector->count()) {
            return true;
        }
        return false;
    }

    public function rewind(): void
    {
        $this->position = $this->reverse ?
            $this->vector->count() - 1 : 0;
    }
}