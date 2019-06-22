#include "stdio.h"
#include "stdlib.h"
#include "dfs.h"

int main()
{
        Node *root = generate_left_node(1, NULL);
        Node *left1 = generate_left_node(2, &root);
        Node *right1 = generate_right_node(3, &root);
        Node *left11 = generate_left_node(4, &left1);
        Node *right11 = generate_right_node(5, &left1);
        Node *right21 = generate_right_node(6, &right1);
        Node *left111 = generate_left_node(7, &left11);
        Node *left211 = generate_left_node(8, &right21);
        Node *right211 = generate_right_node(9, &right21);
        Node *left2111 = generate_left_node(10, &left211);
        Node *right2112 = generate_right_node(11, &right211);
        Node *left21121 = generate_left_node(12, &right2112);

        dfs(root);

        free(left21121);
        free(right2112);
        free(left2111);
        free(right211);
        free(left211);
        free(left111);
        free(right21);
        free(right11);
        free(left11);
        free(right1);
        free(left1);
        free(root);

        return 0;
}

