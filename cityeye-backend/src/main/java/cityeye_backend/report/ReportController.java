
package cityeye_backend.report;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/reports")
@CrossOrigin(origins = "*")
public class ReportController {

    private final ReportService service;

    public ReportController(ReportService service) {
        this.service = service;
    }

    @GetMapping
    public List<Report> getAllReports() {
        return service.getAll();
    }

    @PostMapping
    public Report createReport(@RequestBody Report report) {
        return service.add(report);
    }
}
