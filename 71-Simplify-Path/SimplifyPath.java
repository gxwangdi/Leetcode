import java.util.ArrayList;
import java.util.List;

public class SimplifyPath {
  public String simplifyPath(String path) {
        // Initialize a stack
        Stack<String> stack = new Stack<String>();
        String[] components = path.split("/");
        // Split the input string on "/" as the delimiter
        // and process each portion one by one
        for (String directory : components) {
            // A no-op for a "." or an empty string
            if (directory.equals(".") || directory.isEmpty()) {
                continue;
            } else if (directory.equals("..")) {
                // If the current component is a "..", then
                // we pop an entry from the stack if it's non-empty
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                // Finally, a legitimate directory name, so we add it
                // to our stack
                stack.add(directory);
            }
        }

        // Stich together all the directory names together
        StringBuilder result = new StringBuilder();
        for (String dir : stack) {
            result.append("/");
            result.append(dir);
        }

        return result.length() > 0 ? result.toString() : "/" ;
    }

    // public String simplifyPath(String path) {
    //     if (path == null || path.length()==0) {
    //         return "";
    //     }
    //     StringBuilder res = new StringBuilder();
    //     res.append("/");
    //     String[] stubs = path.split("/+");
    //     List<String> dirs = new ArrayList<>();
    //     for (String s : stubs) {
    //         if ("..".equals(s)) {
    //             if (dirs.size() > 0) {
    //                 dirs.remove(dirs.size()-1);
    //             }
    //         } else if (!".".equals(s) && !"".equals(s)) {
    //             dirs.add(s);
    //         }
    //     }
    //     for (String s : dirs) {
    //         res.append(s+"/");
    //     }
    //     if (res.length() > 1) {
    //         res.deleteCharAt(res.length()-1);
    //     }
    //     return res.toString();
    // }
}
