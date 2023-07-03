public class VnorenaTriedaPriklad {

    class VnorenaTrieda {
        private String meno = "Ján";
        private String priezvisko = "Žitniak";
    }

    public static void main(String[] args) {
        VnorenaTriedaPriklad vtp = new VnorenaTriedaPriklad();
        VnorenaTrieda vt = vtp.new VnorenaTrieda();
        System.out.println(vt.meno);
        System.out.println(vt.priezvisko);
    }
}
