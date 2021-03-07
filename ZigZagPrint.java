public class ZigZagPrint {
    public void print(String str, int k) {
        int i = 0;
        int w = 0;
        int s = 0;
        int t = 2 * (k - 1);
        int p = 0;
        while (t >= 0) {
            i = p;
	    while (i < str.length()) {
		System.out.print(str.charAt(i));
		w = 0;
		while (w++ < t)
		    System.out.print(" ");
                if (s > 0) {
		    i += s;
                    if (i < str.length()) {
			System.out.print(str.charAt(i));
			w = 0;
			while (w++ < t)
			    System.out.print(" ");
                    }
                }
		i += t;
	    }
	    t -= 2;
	    s++;
	    p++;
            System.out.println();
            w = 0;
            while (w++ < s)
                System.out.print(" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ZigZagPrint zzp = new ZigZagPrint();
        String str = "thisisazigzag";
        int k = 4;
        zzp.print(str, k);
    }
}
