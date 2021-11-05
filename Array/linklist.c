#include <stdio.h>
#include <stdlib.h>

struct linklist
{
    int number;
    struct linklist *next;
};

typedef struct linklist node;

void create();
void display();
void menu();
node *head, *temp;

int main()
{
    menu();
    return 0;
}

void menu()
{
    int ch;
    node *head;
    printf("\n**********Menu*************\n");
    printf("\n1. Create LinkList");
    printf("\n2. Display LinkList");
    printf("\n3. Insert into Linklist");
    printf("\n4. Delete from Linklist");
    printf("\n5.Exit from Menu");
    printf("\nEnter your choice: ");
    scanf("%d", &ch);

    switch (ch)
    {
    case 1:
        create();
        menu();
        break;
    case 2:
        display();
        menu();
        break;
    case 3:
        menu();
        break;
    case 4:
        menu();
        break;
    case 5:
        exit(0);
    }
}

void create()
{
    int no, noofElements, index;
    head = (node *)malloc(sizeof(node));
    temp = head;
    printf("Enter the number of elements to be inserted: ");
    scanf("%d", &noofElements);
    for (index = 0; index < noofElements; index++)
    {

        printf("Enter number:");
        scanf("%d", &no);
        temp->number = no;
        if (index == noofElements-1)
        {
            temp->next = '\0';
        }
        else
        {

            temp->next=(node *)malloc(sizeof(node));
            temp = temp->next;
        }
    }
}

void display()
{
    temp = head;
    while (temp->next != '\0')
    {
        printf("%d ------> ", temp->number);
        temp = temp->next;
    }
    printf("%d", temp-> number);
}

