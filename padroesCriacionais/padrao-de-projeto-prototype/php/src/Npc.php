<?php

namespace Prototype\Php;

class Npc
{
    public function __construct(
        private String $name,
        private String $level,
        private Map $map
    ) {}

    /**
     * @return String
     */
    public function getName(): string
    {
        return $this->name;
    }

    /**
     * @param String $name
     */
    public function setName(string $name): void
    {
        $this->name = $name;
    }

    /**
     * @return String
     */
    public function getLevel(): string
    {
        return $this->level;
    }

    /**
     * @param String $level
     */
    public function setLevel(string $level): void
    {
        $this->level = $level;
    }

    /**
     * @return Map
     */
    public function getMap(): Map
    {
        return $this->map;
    }

    /**
     * @param Map $map
     */
    public function setMap(Map $map): void
    {
        $this->map = $map;
    }

    public function __clone(): void
    {
        $this->map = clone $this->map;
    }

    public function __toString(): string
    {
        return "Npc{" .
            "name=" . $this->name .
            ", level=" . $this->level .
            ", map='" . $this->map . '\'' .
            '}';
    }
}