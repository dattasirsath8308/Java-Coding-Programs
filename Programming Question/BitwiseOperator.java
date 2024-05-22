
/*
Bitwise Operator

1. Bitwise OR : |
2. Bitwise AND : &
3. Bitwise exclusive OR : ^
4. Bitwise Complement (Not) : ~
5. Left shift : <<
6. Right Shift : >> 

*/

/*
1 0 0 1   :   9
1 0 1 0   :   10

-----------
1 0 1 1   : 11 (OR)
1 0 0 0   : 8 (AND)
0 0 1 1   : 3 (E OR)

Left Shift
9 << 1  : 1 0 0 1   ->  1 0 0 1 0 (18)
9 << 2  : 1 0 0 1   ->  1 0 0 1 0 0 (36)

Right Shift   
9 >> 1  : 1 0 0 1   ->  1 0 0   (4)
9 >> 2  : 1 0 0 1   ->    1 0   (2)


*/



class BitwiseOperator{

    public static void main(String[] args) {


        int No1 = 9 , No2 = 10 ;

        System.out.println(No1 | No2); // 11
        System.out.println(No1 & No2); // 8
        System.out.println(No1 ^ No2); // 3


        System.out.println(No1 << 1); // 18
        System.out.println(No1 << 2); // 36

        System.out.println(No1 >> 1); // 4
        System.out.println(No1 >> 2); // 2

    }
}