public class Npc implements Cloneable {
    private Map map;
    private String name;
    private String level;

    public Npc(String name, String level, Map map) {
        this.name = name;
        this.level = level;
        this.map = map;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public Npc clone() throws CloneNotSupportedException {
        Npc npcClone = (Npc) super.clone();
        npcClone.map = (Map) npcClone.map.clone();
        return npcClone;
    }

    @Override
    public String toString() {
        return "Npc{" +
                "name=" + name +
                ", level=" + level +
                ", map='" + map + '\'' +
                '}';
    }
}
