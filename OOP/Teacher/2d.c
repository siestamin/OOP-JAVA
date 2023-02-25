#include <stdio.h>

void nhapMaTran(int a[][100], int n) {
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            printf("Nhap a[%d][%d]: ", i, j);
            scanf("%d", &a[i][j]);
        }
    }
}

int timMaxDuongCheoChinh(int a[][100], int n) {
    int max = a[0][0];
    for (int i = 1; i < n; i++) {
        if (a[i][i] > max) {
            max = a[i][i];
        }
    }
    return max;
}

int timMinDuongCheoPhu(int a[][100], int n) {
    int min = a[0][n - 1];
    for (int i = 1; i < n; i++) {
        if (a[i][n - i - 1] < min) {
            min = a[i][n - i - 1];
        }
    }
    return min;
}

int timCotChuaMin(int a[][100], int n) {
    int min = a[0][0];
    int cot = 0;
    for (int j = 1; j < n; j++) {
        if (a[0][j] < min) {
            min = a[0][j];
            cot = j;
        }
    }
    for (int i = 1; i < n; i++) {
        if (a[i][cot] > a[i][cot+1]) {
            cot++;
        }
    }
    return cot;
}

void xuatMaTran(int a[][100], int n) {
    printf("Ma tran vua nhap:\n");
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            printf("%d\t", a[i][j]);
        }
        printf("\n");
    }
}

int main() {
    int a[100][100], n;
    printf("Nhap kich thuoc ma tran: ");
    scanf("%d", &n);
    nhapMaTran(a, n);
    xuatMaTran(a, n);
    printf("Gia tri lon nhat tren duong cheo chinh la: %d\n", timMaxDuongCheoChinh(a, n));
    printf("Gia tri nho nhat tren duong cheo phu la: %d\n", timMinDuongCheoPhu(a, n));
    int cotMin = timCotChuaMin(a, n);
    printf("Cot chua phan tu nho nhat cua ma tran la cot: %d\n", cotMin+1);
    return 0;
}
