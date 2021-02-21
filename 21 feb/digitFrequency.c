#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    char str[1000] ;
    int digit[10],i,j,length;
    gets(str);
    
    for(i = 0; i < 10 ; i++){
        digit[i] = 0; 
    }
    
    for(i = 0; i < strlen(str); i++){
        if((int)str[i] >= 48 && (int)str[i] < 58 ){
            digit[(int)str[i] - 48]++;
        }
    }
    
    for(i = 0; i < 10; i++){
        printf("%d ",digit[i]);
    }
    
    return 0;
}