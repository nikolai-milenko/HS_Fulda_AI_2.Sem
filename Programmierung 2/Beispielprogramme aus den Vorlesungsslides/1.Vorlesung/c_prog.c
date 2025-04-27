#include "stdio.h"

int main(int argc, char** argv) {
  for (int i = 0; i < 10; i++) {
    printf("Hello world (%d)\n", i) ;

    if (i == 9) {
      printf("Done!\n") ;
    }
  }
}