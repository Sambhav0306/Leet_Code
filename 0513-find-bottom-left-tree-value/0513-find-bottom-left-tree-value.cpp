/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    int x=-1;
    int y;
    void DFS(TreeNode* root,int level){
        if(root==NULL)return;
        if(root->left==NULL && root->right==NULL && level>y){
            x=root->val;
        }
        y=max(level,y);
        DFS(root->left,level+1);
        DFS(root->right,level+1);
    }
    int findBottomLeftValue(TreeNode* root) {
        if(root->left==NULL && root->right==NULL){
            return root->val;
        }
        DFS(root,0);
        return x;
    }
};