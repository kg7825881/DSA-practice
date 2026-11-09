/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        
        List<Double> avgLevel = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            TreeNode cur = q.remove();
            if(cur == null){
                double sum = 0.0;
                int c = 0;
                while(!st.isEmpty()){
                    sum += st.pop();
                    ++c;
                }

                double avg = sum / c;

                avgLevel.add(avg);
                if(q.isEmpty()){
                    break;
                }

                q.add(null);
            } else {
                st.add(cur.val);
                if(cur.left != null){
                    q.add(cur.left);
                }
                if(cur.right != null){
                    q.add(cur.right);
                }
            }
        }

        return avgLevel;
    }
}