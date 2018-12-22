package mobileInfoManagementsystem;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Connected {

   // String ss = null;//return image
    public String connect(String con) {
        String ss = null;
        if (con.equals("017")) {
            ss = "Connected";
        } else if (con.equals("018")) {
            ss = "Connected";
        } else if (con.equals("019")) {
            ss = "Connected";
        } else if (con.equals("015")) {
            ss = "Connected";
        } else if (con.equals("016")) {
            ss = "Connected";
        } else {
            ImageIcon icon = new ImageIcon("F:\\JSP\\dtasjd\\src\\Images\\ball.gif");
            JOptionPane.showMessageDialog(null, "Enter with Code !", "Number set", JOptionPane.INFORMATION_MESSAGE, icon);

        }
        return ss;
    }

    public String myOperator(String opName) {

        String operator = null;
        if (opName.equals("017")) {
            operator = "GP";
        } else if (opName.equals("018")) {
            operator = "ROBY";
        } else if (opName.equals("019")) {
            operator = "BL";
        } else if (opName.equals("015")) {
            operator = "TT";
        } else if (opName.equals("016")) {
            operator = "AIRTEL";
        }

        return operator;
    }

    public ImageIcon setImagelogo(String opDigit) {
        ImageIcon newimageIcon = null;
        ImageIcon ii;
        if (opDigit.equals("017")) {
            ii = new ImageIcon("F:\\JSP\\dtasjd\\src\\Images\\gp.png");
            Image im = ii.getImage();
            Image newimage = im.getScaledInstance(80, 80, Image.SCALE_SMOOTH);
            newimageIcon = new ImageIcon(newimage);
        } else if (opDigit.equals("018")) {
            ii = new ImageIcon("F:\\JSP\\dtasjd\\src\\Images\\rb.jpg");
            Image im = ii.getImage();
            Image newimage = im.getScaledInstance(80, 80, Image.SCALE_SMOOTH);
            newimageIcon = new ImageIcon(newimage);
        } else if (opDigit.equals("019")) {
            ii = new ImageIcon("F:\\JSP\\dtasjd\\src\\Images\\bl.png");
            Image im = ii.getImage();
            Image newimage = im.getScaledInstance(80, 80, Image.SCALE_SMOOTH);
            newimageIcon = new ImageIcon(newimage);
        } else if (opDigit.equals("016")) {
            ii = new ImageIcon("F:\\JSP\\dtasjd\\src\\Images\\art.PNG");

            Image im = ii.getImage();
            Image newimage = im.getScaledInstance(80, 80, Image.SCALE_SMOOTH);
            newimageIcon = new ImageIcon(newimage);
        } else if (opDigit.equals("015")) {

            ii = new ImageIcon("F:\\JSP\\dtasjd\\src\\Images\\tt.png");
            Image im = ii.getImage();
            Image newimage = im.getScaledInstance(80, 80, Image.SCALE_SMOOTH);
            newimageIcon = new ImageIcon(newimage);
        }
        return newimageIcon;
    }

}
