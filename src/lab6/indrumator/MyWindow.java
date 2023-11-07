package lab6.indrumator;

import javax.swing.*;

public class MyWindow extends JFrame {

    //doar unul dintre urmatorii 2 constructori poate fi prezent (decomentat o data). De ce?
    // pentru a vedea ce se intampla, decomenteaza unul si comenteaza l pe celalalt

//    public MyWindow(String title) {
//        // constructorul implicit al superclasei este automat
//        setTitle(title);
//        System.out.println("In constructorul in care super se apeleaza implicit, si apelam noi setTitle");
//    }

    public MyWindow(String title) {
        super(title);
        System.out.println("In constructorul in care noi apelam super(title)");
    }

}
