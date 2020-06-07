public class EscalonamentoDeIntervalos {
    public static void main(String[] args) {
        int[] s = {2,4,1,6,4,6,7,9,9,3,13};
        int[] f = {4,5,6,7,8,9,10,11,12,13,14};

        int[] sdm = sdmGuloso(s,f);

        print(s);
        print(f);
        print(sdm);
    }

    public static void print(int[] arr){
        System.out.print("{ ");
        for (int x: arr) {
            System.out.print(x+" ");
        }
        System.out.println("}");
    }

    public static int[] sdmGuloso(int[] s,int[] f){
        int[] x = new int[s.length];
        int i = 0;
        while (i < s.length){
            x[i] = 1;
            int k = i + 1;
            while (k < s.length && s[k] <= f[i]){
                k++;
            }
            i = k;
        }
        return x;
    }
}
