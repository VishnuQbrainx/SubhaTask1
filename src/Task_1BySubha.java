public class Task_1BySubha {


    public static String allSmall(String string) {
        return string.toLowerCase();
    }

    public static String allSmallRemoveSpace(String string) {
        return string.toLowerCase().replace(" ", "");
    }

    public static String allSmallReplaceSpaceWithUnderscore(String string) {
        return string.toLowerCase().replace(" ", "_");
    }

    public static String allSmallReplaceSpaceWithHyphen(String string) {
        return string.toLowerCase().replace(" ", "-");
    }


    public static void main(String[] args) {
        String string = "If you’ve ever worked with APIs, chances are, you’ve heard";
        System.out.println(allSmall(string));
        System.out.println(allSmallRemoveSpace(string));
        System.out.println(allSmallReplaceSpaceWithHyphen(string));
        System.out.println(allSmallReplaceSpaceWithUnderscore(string));


    }
}



