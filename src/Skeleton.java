public class Skeleton {
    public class Skeleton extends Boss {
        private int arrows;

        public Skeleton(String name, int health, Weapon weapon, int arrows) {
            super(name, health, weapon);
            this.arrows = arrows;
        }

        public int getArrows() {
            return arrows;
        }

        public void setArrows(int arrows) {
            this.arrows = arrows;
        }

        @Override
        public String printInfo() {
            String weaponInfo = "No weapon";
            if (getWeapon() != null) {
                weaponInfo = getWeapon().getName() + " (" + getWeapon().getType() + ")";
            }
            return "Name: " + getName() + ", Health: " + getHealth() + ", Weapon: " + weaponInfo + ", Arrows: " + arrows;
        }
    }
}
