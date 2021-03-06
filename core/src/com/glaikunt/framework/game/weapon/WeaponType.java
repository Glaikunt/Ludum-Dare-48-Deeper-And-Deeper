package com.glaikunt.framework.game.weapon;

public enum WeaponType {

    MELEE(.5f, 1f),
    RANGED(.2f, 1f),
    SUPPORT(.2f, 1f);

    private float damage;
    private float attackSpeed;

    WeaponType(float damage, float attackSpeed) {
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }

    public float getDamage() {
        return damage;
    }

    public float getAttackSpeed() {
        return attackSpeed;
    }
}
