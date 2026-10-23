
package cityeye_backend.report;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class ReportService {

    private final List<Report> reports = new ArrayList<>();
    private final AtomicLong nextId = new AtomicLong(1);

    public ReportService() {
        reports.add(new Report(
            nextId.getAndIncrement(),
            "Broken street light",
            "The street light does not work",
            "Astana",
            "NEW"
        ));
    }

    public List<Report> getAll() {
        return new ArrayList<>(reports);
    }

    public Report add(Report report) {
        report.setId(nextId.getAndIncrement());

        if (report.getStatus() == null ||
            report.getStatus().isBlank()) {
            report.setStatus("NEW");
        }

        reports.add(report);
        return report;
    }
}
