package lcTestCoding;
import java.util.*;
public class MajorityElementII {
	//public int majorityElement2(int[] nums) {
		/*
		class Solution {
			public:
			    vector<int> majorityElement(vector<int>& nums) {
			       
			        if (nums.empty()) return {};
			        return _majorityElementOfK(nums, 3); 
			    }
			    
			    vector<int> _majorityElementOfK(const vector<int>& nums, int k){
			        if (nums.empty()) return { };
			        
			        int helperSize = k - 1;
			        vector<int> counters(helperSize,0);
			        vector<int> elements(helperSize,0);
			        
			        int found = false;
			      
			        // find the possible elements that is greater than n/k, 
			        for (int num: nums){
			            found = false;
			            
			            for (int i = 0; i < helperSize; ++i){
			                if (!counters[i] || num == elements[i]){
			                    ++counters[i];
			                    elements[i] = num;
			                    found = true;
			                    break;
			                }
			            }
			            
			            if (!found){
			               for (int i = 0; i < helperSize; ++i){
			                    --counters[i];
			                }
			            }
			        }
			            
			        // clear the counters and re-cal to get the correct frequencies
			        for (int i = 0; i < helperSize; ++i){
			             counters[i] = 0;
			        }
			        
			        for (int i = 0; i < nums.size(); ++i){
			            for (int j = 0; j < helperSize; ++j){
			                if (elements[j] == nums[i]){
			                    ++counters[j];
			                    break;
			                }
			            }
			        }
			        
			        // push numbers to the result if it is more than n/k
			        vector<int> result;
			        for (int i = 0; i < helperSize; ++i){
			            if (counters[i] > nums.size()/k) result.push_back(elements[i]);
			        }
			        
			        return result;
			        
			    }
			};
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	*/
	}


