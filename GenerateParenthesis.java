class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> final_answer = new ArrayList<>();
        helper(final_answer,1,0,"(",n);
        return final_answer;
    }
    
    void  helper(List<String> final_answer,int open_bracket_count, int close_bracket_count,String answer_so_far,int n){
        
        if(answer_so_far.length()==2*n){
            final_answer.add(answer_so_far);
            return;
        }
        
        if(open_bracket_count<n){
            helper(final_answer,open_bracket_count+1,close_bracket_count,answer_so_far+"(",n);
        }
        if(close_bracket_count<open_bracket_count){
            helper(final_answer,open_bracket_count,close_bracket_count+1,answer_so_far+")",n);
        }
    }
}