/**
 * Enumeration with marine melee weapon constants.
 */
public enum MeleeWeapon {
    HEAVY_BOLTGUN,
    BOLT_PISTOL,
    GRAV_GUN;

    /**
     * Generates a beautiful list of enum string values.
     * @return String with all enum values splitted by comma.
     */
    public static String nameList() {
        String nameList = "";
        for (MeleeWeapon meleeWeapon : values()) {
            nameList += meleeWeapon.name() + ", ";
        }
        return nameList.substring(0, nameList.length()-2);
    }
}
