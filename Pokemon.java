

public class Pokemon {
    private String name;
    private int level;
    private int maxHp;
    private int currentHp;
    private int attack;
    private int defense;
    private int speed;

    public Pokemon(String name, int level, int maxHp, int attack, int defense, int speed) {
        this.name = name;
        this.level = level;
        this.maxHp = maxHp;
        this.currentHp = maxHp;
        this.attack = attack;
        this.defense = defense;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public int getCurrentHp() {
        return currentHp;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public int getSpeed() {
        return speed;
    }

    public void setCurrentHp(int currentHp) {
        this.currentHp = currentHp;
    }

    public void levelUp() {
        this.level++;
        this.maxHp += 10;
        this.currentHp = this.maxHp;
        this.attack += 2;
        this.defense += 2;
        this.speed += 1;
    }

    public void takeDamage(int damage) {
        int actualDamage = Math.max(damage - this.defense, 1);
        this.currentHp -= actualDamage;
    }

    public void attack(Pokemon target) {
        int damage = this.attack - target.getDefense();
        if (damage <= 0) {
            System.out.println(this.name + "�� ������ ��ȿ�մϴ�.");
        } else {
            System.out.println(this.name + "��(��) " + target.getName() + "���� " + damage + "�� �������� �������ϴ�.");
            target.takeDamage(damage);
        }
    }

    @Override
    public String toString() {
        return this.name + " (���� " + this.level + ") HP: " + this.currentHp + "/" + this.maxHp +
                " ����: " + this.attack + " ���: " + this.defense + " �ӵ�: " + this.speed;
    }
}