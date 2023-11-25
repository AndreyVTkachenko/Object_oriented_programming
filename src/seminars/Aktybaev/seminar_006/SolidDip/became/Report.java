package seminars.Aktybaev.seminar_006.SolidDip.became;

import java.util.ArrayList;
import java.util.List;

public class Report{
    private List<ReportItem> items;	// Отчетные данные
    private Printer printer;

    public Report(Printer printer) {
        this.printer = printer;
    }

    // расчет отчетных данных
    public void calculate(){
        items = new ArrayList<>();
        items.add(new ReportItem("First", (float)5));
        items.add(new ReportItem("Second", (float)6));
    }

    public void output(){
        printer.output(items);
    }
}
