package top.woohsi;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

public class DirList {


    public static FilenameFilter filter(final String regex) {

        return new FilenameFilter() {
            private Pattern p = Pattern.compile(regex);
            @Override
            public boolean accept(File file, String s) {
                return p.matcher(s).matches();
            }
        };
    }

    public static void main(String[] args) {
        File path = new File(".");
        String[] list;
        if (args.length == 0) {
            list = path.list();
        } else {
            list = path.list(filter(args[0]));
        }
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
        for (String dirItem: list) {
            System.out.println(dirItem);
        }
    }

}
