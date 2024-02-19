void main(){
    String[][] customerDetails ={{"1","2","3","4"},{"Kasun","Nuwan","Ruwan","Supun"},{"071-4588223","072-4425724","076-8485921","071-4432245"},{"011-4582234","011-4423562","011-4524563","011-4423562"}};
    final String LINE = STR."+\{"-".repeat(6)}+\{"-".repeat(15)}+\{"-"
            .repeat(13)}+\{"-".repeat(13)}+";
    final String HEADER = "\033[41;1m|%-6s|%-15s|%-13s|%-13s|\033[0m"
            .formatted("ID", "CUSTOMER NAME", "CONTACT 01", "CONTACT 02");
    final String ROW = "|%-6s|%-15s|%-13s|%-13s|\n";
    System.out.println(LINE);
    System.out.println(HEADER);
    System.out.println(LINE);

    for (int i=0; i!=customerDetails[0].length; i++){

        String id = "C-%03d".formatted(Integer.parseInt(customerDetails[0][i]));
        String name = customerDetails[1][i];
        String c1 = customerDetails[2][i];
        String c2 =customerDetails[3][i];
        System.out.printf(ROW, id,name,c1,c2);
        System.out.println(LINE);

    }
}