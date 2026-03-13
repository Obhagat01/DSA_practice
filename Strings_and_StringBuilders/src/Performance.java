public class Performance {
    public static void main(String[] args) {
        String series="";
        for (int i = 0; i < 26 ; i++) {
            char ch=(char)('a'+i);
            series=series+ch;

        }
        System.out.println(series);
        //here everytime it is creating new object ,so memory wasteage occur
        //{a,ab,abc,abcd,abcde,abcdef,.....,abcd..y} will don't have reference varibale ,hence memory wasteage ,garbage collection will hit it
        //o(n^2)
        //Hence we have StringBuilder Class so we can update it in same reference variable
    }
}
