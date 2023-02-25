#include <stdio.h>

int main() {
    int a,b;
    printf("Moi nhap a va b\n");
    scanf("%d%d",&a,&b);
    int tong = a+b;
    int hieu = a-b;
    int tich = a*b;
    // double thuong = (double)a/b;
    int chianguyen = a/b;
    int chiadu= a%b;
    printf("%d\n",tong);
    printf("%d\n",hieu);
    printf("%d\n",tich);
    printf("%.2lf\n",(double)a/b);
    printf("%d\n",chianguyen);
    printf("%d\n",chiadu);
}