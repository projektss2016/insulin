package data;

import sun.security.util.Password;

/**
 * Created by nata on 09.09.2016.
 */
public class Passwort {

        private String kod;

        public Passwort (String kod) {
            this.kod = kod;
                  }

        public String getKod() {
            return kod;
        }
        public void setKod(String kod) {
            this.kod = kod;
        }

    }
