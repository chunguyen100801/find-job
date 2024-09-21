package chunguyen.find_job.controller;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.transaction.Transactional;
import chunguyen.find_job.service.EmailService;
import chunguyen.find_job.service.SubscriberService;
import chunguyen.find_job.util.annotation.ApiMessage;

@RestController
@RequestMapping("/api/v1")
public class EmailController {

    private final EmailService emailService;
    private final SubscriberService subscriberService;

    public EmailController(EmailService emailService,
            SubscriberService subscriberService) {
        this.emailService = emailService;
        this.subscriberService = subscriberService;
    }

    @GetMapping("/email")
    @ApiMessage("Send simple email")
    // @Scheduled(cron = "*/30 * * * * *")
    // @Transactional
    public String sendSimpleEmail() {
        // this.emailService.sendSimpleEmail();
        // this.emailService.sendEmailSync("nguyenchuaqna@gmail.com", "test send
        // email",
        // "<h1> <b> hello </b> </h1>", false,
        // true);
        // this.emailService.sendEmailFromTemplateSync("nguyenchuaqna@gmail.com",
        // "test
        // send email", "job");
        this.subscriberService.sendSubscribersEmailJobs();
        return "ok";
    }
}
