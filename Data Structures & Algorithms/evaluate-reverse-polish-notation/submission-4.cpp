class Solution {
public:
    bool isAllDigits(const string& str){
        for(char c : str){
            if(c == '-' && str.size() > 1)continue;
            if(!isdigit(c)){
                return false;
            }
        }
        return true;
    }

    int operation(int a, int b, string op){
        if(op == "+")return a + b;
        else if(op == "-")return a - b;
        else if(op == "*")return a * b;
        else{
            if((a < 0 && b>0) || (a > 0 && b<0))return ceil(a/b);
            else return floor(a/b);
        }
    }
    int evalRPN(vector<string>& tokens) {
        stack<int> results;
        int a,b,num,toPush;
        for(string i : tokens){
            if(isAllDigits(i)){
                num = stoi(i);
                results.push(num);
            }else{
                b = results.top();
                results.pop();
                a = results.top();
                results.pop();
                toPush = operation(a,b,i);
                results.push(toPush);
            }
        }
        return results.top();

    }
};
