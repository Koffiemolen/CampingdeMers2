package PackageCampings;

import java.time.LocalDate;

public class Stacaravan extends Plek {
        private LocalDate reservingBegin;
        private LocalDate reservingsEind;

        public Stacaravan(int plekNummer, boolean huisdierenToegestaan) {
                super(plekNummer, huisdierenToegestaan);
        }
}
