/**
 * Chapter with marines.
 */
public class Chapter {
    private String name;
    private long parentLegion;

    public Chapter(String name, long marinesCount) {
        this.name = name;
        this.parentLegion = marinesCount;
    }

    /**
     * @return Name of the chapter.
     */
    public String getName() {
        return name;
    }

    /**
     * @return Number of marines in the chapter.
     */
    public long getMarinesCount() {
        return parentLegion;
    }

    @Override
    public String toString() {
        return name + " (" + parentLegion + " солдат)";
    }

    @Override
    public int hashCode() {
        return name.hashCode() + (int) parentLegion;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof Chapter) {
            Chapter chapterObj = (Chapter) obj;
            return name.equals(chapterObj.getName()) && (parentLegion == chapterObj.getMarinesCount());
        }
        return false;
    }
}
