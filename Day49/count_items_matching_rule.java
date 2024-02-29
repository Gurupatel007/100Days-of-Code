import java.util.List;

public class count_items_matching_rule {
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        int flag = 0;
        if(ruleKey.equals("type")) flag = 0;
        if(ruleKey.equals("color"))flag = 1;
        if(ruleKey.equals("name")) flag = 2;

        for(List<String> ls:items){
            if(ls.get(flag).equals(ruleValue))count++;
        }

        return count;
    }
    public static void main(String[] args) {
        List<List<String>> arr = List.of(List.of("phone","blue","pixel"),List.of("computer","silver","lenovo"),List.of("phone","gold","iphone"));
        String ruleKey = "color";
        String ruleValue = "silver";
        int ans = countMatches(arr, ruleKey, ruleValue);
        System.out.println(ans);
        
    }
}
