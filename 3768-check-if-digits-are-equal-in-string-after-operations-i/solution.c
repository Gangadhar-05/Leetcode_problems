#include<stdio.h>
#include<string.h>
int hasSameDigits(char *s) {
    while (strlen(s) > 2) {
        int n = strlen(s);
        char str[n];  
        for (int i = 0; i < n - 1; i++) {
            str[i] = (s[i] - '0' + s[i + 1] - '0') % 10 + '0';  
        }
        str[n - 1] = '\0';  
        strcpy(s, str);  
    }
    return s[0] == s[1];  
}

