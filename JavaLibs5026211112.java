import javax.swing.JOptionPane;

public class JavaLibs5026211112 {
  public static void main(String[] args) {
    String name, album, genre, fans, favLine, tittleTrack;
    int date, numberSong, age;
    double duration, totalDuration;
    
    //pembukaan
    JOptionPane.showMessageDialog(null,"Heyy kamu! Sekarang kamu hampir debut jadi penyanyi loh! Yuk kita bikin album musikmu.");
    
    //input
    name = JOptionPane.showInputDialog(null,"Kamu mau pake nama panggung apa nih?");
    age = Integer.parseInt(JOptionPane.showInputDialog(null,"Usia kamu sekarang berapa?"));
    date = Integer.parseInt(JOptionPane.showInputDialog(null, "Kira-kira kamu mau debut tanggal berapa nih?"));
    genre = JOptionPane.showInputDialog(null,"Kamu paling suka musik genre apa?");
    album = JOptionPane.showInputDialog(null,"Coba ketik nama album yg keren:");
    tittleTrack = JOptionPane.showInputDialog(null,"Salah satu lagu punya judul:");
    numberSong = Integer.parseInt(JOptionPane.showInputDialog(null, "Dalam album ini, kamu mau menyanyikan berapa lagu?"));
    duration = Double.parseDouble(JOptionPane.showInputDialog(null,"Dalam satu lagu mau berapa menit? (menit.detik)"));
    totalDuration = (numberSong * duration);
    fans = JOptionPane.showInputDialog(null,"Beri nama panggilan buat para fansmu yuk:");
    favLine = JOptionPane.showInputDialog(null,"Coba tulis lirik paling berkesan yang kamu ingat:");

    //output
    JOptionPane.showMessageDialog(null, "Drum Roll~ \n Selamat, " +name+ "! Album kamu sudah jadi!\n Kini dengan Radio SuaraKita, Kamu berhasil debut menjadi penyanyi pada " +
    date+ " Februari 2022 dengan Album berjudul " +album+ ".\n " +name+ " debut pada usia " +age+ " dengan ciri yang khas menawarkan pesona lagu-lagu bergenre " +
    genre+ ".\n Dengan " +numberSong+ " judul lagu, album " +album+ " dapat didengarkan secara lengkap selama " +
    totalDuration+ " menit.\n ~" +favLine+ "~ Yuhuuu tadi itu cuplikan isi lagunya. Gimana? keren bangettt.\n Gimana nih para " +
    fans+ "~! Suka banget kan sama lagunya? \n Okey kalo gitu mari kita dengarkan salah satu lagu di album " +album+ " dengan judul " +
    tittleTrack+ "! Selamat menikmati lagunya. Sampai Jumpa!");
  
  }
}