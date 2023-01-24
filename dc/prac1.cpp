#include <stdio.h>
#include<conio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>

// Driver code
int main()
{
    FILE* ptr;
    char ch,x,a[100]; 
    int j,k,len,i=0,totalChar=0;
    float pro=0.0, lg2_to_ten = 0.0, info=0.0, entropy=0.0;
    
    // Opening file in reading mode
    ptr = fopen("test.txt", "r");
 
    if (ptr == NULL)
	{
      printf("file does not exist !!! \n");
      goto end;
    }
 
    printf("190420116043 : HARSH PANCHAL");
    printf("\nPractical No. 1: For any given input file (containing sequence of symbol/letters),     compute the frequency, probability, and information content of each symbol and present them in tabular format. Also find average length as well as entropy of the code given in the file.");
    printf("\nContent of this file is : ");
 
    // Printing what is written in file
    // character by character using loop.
    
    do {
         ch = fgetc(ptr);
         a[i]=ch;
         printf("%c", ch);
         i++;
         
        // Checking if character is not EOF.
        // If it is EOF stop eading.
        
    } while (ch != EOF);
    
    printf("\n \n");
    totalChar = i-1;
    printf("Total numbers of characters: %d",totalChar);
    printf("\n \n");
      
    lg2_to_ten = 0.3010299;
    printf("Characters  |  Frequency  |  Probability  |  Self information \n");
    
    // comparing letters with each other to note its repitition
   	for(j=0; j<=strlen(a)-1;j++)
	{
   		len = 1;
   		x=a[j];
   		for(k=j+1; k<=strlen(a);k++)
		{
   			if(x == a[k])
			{
   				len++;
   				a[k] = '@';
			} 
		}
		
		if ((x>=97 && x<=122) || (x>=65 && x<=90) || x==32)
		{
			pro = ((float)len) / ((float)totalChar);
			info = - (log10(pro) / lg2_to_ten);
			entropy =  entropy + (pro * info);
			printf(".......................................................");
			printf("\n   %c :\t|  \t %d   \t| %f   \t|  %f   \n", x,len,pro,info);
		}
	}
	
	printf("......................................................."); 
	printf("\n");
	printf("Entropy is: %f",entropy);
	printf("\n \n");

	   
    // Closing the file
    fclose(ptr);
    end:
    return 0;
}
