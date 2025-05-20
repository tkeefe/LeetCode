import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<String> removeSubfolders(String[] folder) {
        List<String> result = new ArrayList<>();
        Arrays.sort(folder);

        String previous = "";
        for (String current : folder) {
            if (!previous.isEmpty() && current.startsWith(previous) && current.charAt(previous.length()) == '/') {
                continue;
            }
            result.add(current);
            previous = current;
        }
        return result;
    }
}