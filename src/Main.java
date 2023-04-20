public class Main {
    public static void main(String[] args) {
        Weapon bossWeapon = new Weapon(WeaponType.AXE, "Mighty Axe");
        Boss boss = new Boss("Evil Boss", 1000, bossWeapon);

        Skeleton skeleton1 = new Skeleton("Skeleton Warrior", 100, null, 50);
        Weapon skeletonWeapon = new Weapon(WeaponType.SWORD, "Bone Sword");
        Skeleton skeleton2 = new Skeleton("Skeleton Archer", 50, skeletonWeapon, 20);

        System.out.println("Boss Info: " + boss.printInfo());
        System.out.println("Skeleton 1 Info: " + skeleton1.printInfo());
        System.out.println("Skeleton 2 Info: " + skeleton2.printInfo());
    }
    }
