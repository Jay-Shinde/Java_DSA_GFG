//The discs are arranged such that the top disc is numbered 1 and the bottom-most disc is numbered N. Also, all the discs have different sizes and a bigger disc cannot be put on the top of a smaller disc. Refer the provided link to get a better clarity about the puzzle. -------- https://en.wikipedia.org/wiki/Tower_of_Hanoi

//idea is to
// Shift ‘N-1’ disks from ‘A’ to ‘B’, using C.
// Shift 1 disk from ‘A’ to ‘C’.
// Shift ‘N-1’ disks from ‘B’ to ‘C’, using A.
//repeatedly...

public class TowerOfHanoi {
    static void towerOfHanoi(int n, char from_rod,
            char to_rod, char aux_rod) {
        if (n == 0) {
            return;
        }
        towerOfHanoi(n - 1, from_rod, aux_rod, to_rod);
        System.out.println("Move disk " + n + " from rod "
                + from_rod + " to rod "
                + to_rod);
        towerOfHanoi(n - 1, aux_rod, to_rod, from_rod);
    }

    public static void main(String[] args) {
        int N = 3;

        // A, B and C are names of rods
        towerOfHanoi(N, 'A', 'C', 'B');
    }

}
