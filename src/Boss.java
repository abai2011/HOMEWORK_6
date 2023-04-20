public class Boss {
    public class Boss extends GameEntity {
        private Weapon weapon;

        public Boss(String name, int health, Weapon weapon) {
            super(name, health);
            this.weapon = weapon;
        }

        public Weapon getWeapon() {
            return weapon;
        }

        public void setWeapon(Weapon weapon) {
            this.weapon = weapon;
        }

        public String printInfo() {
            String weaponInfo = "No weapon";
            if (weapon != null) {
                weaponInfo = weapon.getName() + " (" + weapon.getType() + ")";
            }
            return "Name: " + getName() + ", Health: " + getHealth() + ", Weapon: " + weaponInfo;
        }
    }

}
