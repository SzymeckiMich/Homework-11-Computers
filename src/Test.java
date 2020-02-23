public class Test {
    public static void main(String[] args) {
        Overclocked cpu = new CPU("Intel", "i7", "XX22XX",
                1500, 40, 100);
        Overclocked ramik = new RAM("GoodRam", "16gbSuperSpeed", "MIGH", 4096,
                1200, 30, 150);

        Overclocked ram = new RAM("Samsung", "Ram", "XXCCXX", 1024, 1500,
                15, 95);

        System.out.println(cpu.toString());
        cpu.overclockFrequency(500);
        System.out.println(cpu.toString());
        cpu.overclockFrequency(100);



    }

}
