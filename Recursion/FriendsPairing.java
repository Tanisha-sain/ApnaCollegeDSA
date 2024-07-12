// Given n friends, each one can remain single or can be paired up with some other friend.
// Each friend can be paired only once. Find out the total number of ways in which friends can remain single or can be paired up.

package Recursion;

public class FriendsPairing {
    static int friendsPairing(int n){
        if(n == 1 || n == 2) return n;
        return friendsPairing(n-1) + (n-1)*friendsPairing(n-2); 
    }
    public static void main(String[] args) {
        int n = 4;
        // for n = 3 => (a b c) || (ab c) || ac b) || a bc)
        // for n = 4 => (a b c d) || (ab c d) || (ac b d) || (ad b c) || (a bc d) || (a bd c) || (a b cd) || (ab cd) || (ac bd)
        System.out.println(friendsPairing(n));
    }
}
