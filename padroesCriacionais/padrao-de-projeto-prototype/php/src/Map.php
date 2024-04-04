<?php

namespace Prototype\Php;

class Map
{
    public function __construct(
        private String $name,
        private String $minimumLevel,
        private String $coordinateNpcX,
        private String $coordinateNpcY
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
    public function getMinimumLevel(): string
    {
        return $this->minimumLevel;
    }

    /**
     * @param String $minimumLevel
     */
    public function setMinimumLevel(string $minimumLevel): void
    {
        $this->minimumLevel = $minimumLevel;
    }

    /**
     * @return String
     */
    public function getCoordinateNpcX(): string
    {
        return $this->coordinateNpcX;
    }

    /**
     * @param String $coordinateNpcX
     */
    public function setCoordinateNpcX(string $coordinateNpcX): void
    {
        $this->coordinateNpcX = $coordinateNpcX;
    }

    /**
     * @return String
     */
    public function getCoordinateNpcY(): string
    {
        return $this->coordinateNpcY;
    }

    /**
     * @param String $coordinateNpcY
     */
    public function setCoordinateNpcY(string $coordinateNpcY): void
    {
        $this->coordinateNpcY = $coordinateNpcY;
    }

    public function __toString(): string
    {
        return "Map{" .
            "name='" . $this->name .
            "', level minimo='" . $this->minimumLevel .
            "', coordenada x='" . $this->coordinateNpcX . '\'' .
            ", coordenada y='" . $this->coordinateNpcY . '\'' .
            '}';
    }
}