class Solution {
public:
    vector<int> dailyTemperatures(vector<int>& temperatures) {
        vector<int> result(temperatures.size());
        stack<pair<int, int>> temps;
        pair<int, int> p;
        for(int i = 0; i < temperatures.size();i++){
            if(temps.empty()){
                p = {temperatures[i], i};
                temps.push(p);
            }else{
                while(!temps.empty() && temperatures[i] > temps.top().first){
                    result[temps.top().second] = i - temps.top().second;
                    temps.pop();
                }
                p = {temperatures[i], i};
                temps.push(p);
            }
        }
        return result;

    }
};
