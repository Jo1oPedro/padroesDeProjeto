public class DanoNumerico implements IDano {

    float dano = 0f;
    public IDano setDano(float dano) {
        this.dano = dano;
        return this;
    }

    public float getDano() {
        return this.dano;
    }
}
