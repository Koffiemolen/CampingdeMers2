package PackageCampings;

import java.time.LocalDate;

public class Stacaravan extends Plek {
        private LocalDate reservingBegin;
        private LocalDate reservingsEind;
        private int minAantalpersonen;
        private boolean minderValidenToegestaanl;

        public Stacaravan(int plekNummer, boolean huisdierenToegestaan, int minAantalpersonen, boolean minderValidenToegestaanl) {
                super(plekNummer, huisdierenToegestaan);
                this.minAantalpersonen = minAantalpersonen;
        }

        public LocalDate getReservingBegin() {
                return reservingBegin;
        }

        public LocalDate getReservingsEind() {
                return reservingsEind;
        }

        @Override
        void berekenprijs() {

        }
}
