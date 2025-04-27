#include "stdio.h"
#include "stdlib.h"

int global_int_var = 0 ;

char * read_string() {
  printf("Enter string: ") ;
  char * s = (char *) (malloc(100)) ;
  scanf("%s", s) ;
  return s ;
}

int count_X(char * s) {
  int i = 0 ; 
  int count = 0 ;
  while (s[i] != 0) {
    if (s[i++] == 'X') {
      count++ ;
    }
  }
  return count ;
}

int main(int argc, char** argv) {
  char * s = read_string() ;
  global_int_var = count_X(s) ;
  printf("The string %s contains %d X!\n", s, global_int_var) ;    
}

