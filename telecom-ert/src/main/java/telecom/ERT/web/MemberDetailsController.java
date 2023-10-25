package telecom.ERT.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MemberDetailsController {

    @PostMapping("/member-deatils")
    public String addMembers(@RequestParam("member") List<String> members, Model model) {
        model.addAttribute("members", members);
        return "member-details";
    }
}
