import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int size = 100;
        int[] array = new int[size];
        Scanner input = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("****************HACKATHON-JAVA-BASIC-1-MENU***************");
            System.out.println("1. Nhập số phần tử và giá trị cho các phần tử của mảng từ bàn phím");
            System.out.println("2. In ra giá trị các phần tử trong mảng");
            System.out.println("3. Tính tổng và in ra các phần tử có giá trị lẻ trong mảng");
            System.out.println("4. In ra giá trị lớn nhất và nhỏ nhất trong mảng");
            System.out.println("5. Thống kê số lượng phần tử chia hết cho 2 và 3 trong mảng");
            System.out.println("6. In ra mảng đảo ngược");
            System.out.println("7. In ra các phần tử và tổng số các phần tử là số nguyên tố trong mảng");
            System.out.println("8. Sắp xếp mảng tăng dần");
            System.out.println("9. Thoát");
            System.out.println("Nhập lựa chọn của bạn");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    int i = 0;
                    System.out.println("Nhập số phần tử trong mảng");
                    size = input.nextInt();
                    if (size > 100) {
                        System.out.println("Số phần tử của mảng không thể quá 100");
                    } else {
                        while (i < size) {
                            System.out.println("Nhập số thứ " + (i + 1));
                            array[i] = input.nextInt();
                            i++;
                        }
                    }
                    break;
                case 2:
                    int j = 0;
                    while (j < size) {
                        System.out.println("Phần tử thứ " + (j + 1) + ": " + array[j]);
                        j++;
                    }
                    ;
                    break;
                case 3:
                    showOddNumber(array, size);
                    break;
                case 4:
                    showMaxAndMin(array, size);
                    break;
                case 5:
                    numberDividedbyTwoAndThree(array, size);
                    break;
                case 6:
                    reverseArray(array, size);
                    break;
                case 7:
                    findPrimer(array, size);
                    break;
                case 8:
                    sortArray(array, size);
                    break;
                case 9:
                    System.exit(0);
                    break;
            }
        } while (choice > 0);


    }

    public static void showOddNumber(int[] array, int size) {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] % 2 != 0) {
                sum += array[i];
                System.out.println("Các số lẻ trong mảng là: " + array[i] + "\n");
            }
        }
        System.out.println("Tổng các số lẻ trong mảng là: " + sum + "\n");
    }

    public static void showMaxAndMin(int[] array, int size) {
        int max = array[0];
        int min = array[1];
        for (int i = 0; i < size; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Số lớn nhất trong mảng là: " + max + "\n");
        for (int i = 0; i < size; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Số nhỏ nhất trong mảng là: " + min + "\n");
    }

    ;

    public static void numberDividedbyTwoAndThree(int[] array, int size) {
        boolean flag = false;
        for (int i = 0; i < size; i++) {
            if (array[i] % 2 == 0 & array[i] % 3 == 0) {
                flag = true;
                System.out.println("Các số chia hết cho cả 2 và 3 trong mảng là: " + array[i] + "\n");
            }
        }
        if (flag == false) {
            System.out.println("Không có số nào chia hết cho cả 2 và 3");

        }
        ;
    }

    ;

    public static void reverseArray(int[] array, int size) {
        for (int i = 0, j = size - 1; i < j; i++, j--) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        System.out.println("Mảng đảo chiều: " + Arrays.toString(array));
    }

    ;

    public static void findPrimer(int[] array, int size) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            boolean flag = true;
            if (array[i] < 2) {
                flag = false;
            } else {
                if (array[i] == 2) {
                    count += 1;
                    System.out.println("Số nguyên tố trong mảng là: " + array[i]);
                } else {
                    for (int j = 2; j < array[i]; j++) {
                        if (array[i] % j == 0) {
                            flag = false;
                        }
                        ;
                    }
                    ;
                    if (flag) {
                        System.out.println("Số nguyên tố trong mảng là: " + array[i]);
                        count += 1;
                    }
                }
            }
//            if(!flag) {
//                System.out.println("Không có số nguyên tố nào trong mảng");
//            }
        }
        ;
//        if (!flag) {
//        };
        System.out.println("Tổng số các phần tử là số nguyên tố: " + count + "\n");
    }

    ;

    public static void sortArray(int[] array, int size) {
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (array[i] > array[j]) {
                    int x = array[i];
                    array[i] = array[j];
                    array[j] = x;
                }
            }
        }
        ;
        System.out.println(Arrays.toString(array));
    }
}
