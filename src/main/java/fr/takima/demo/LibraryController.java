package fr.takima.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

/**
 *
 */
@RequestMapping("/")
@Controller
public class LibraryController {

  private final ChampDAO champDAO;
  private final OriginDAO originDAO;
  private final ClassDAO classDAO;
  private final TeamDAO teamDAO;

  public LibraryController(ChampDAO champDAO, OriginDAO originDAO, ClassDAO classDAO, TeamDAO teamDAO) {
    this.champDAO = champDAO;
    this.originDAO = originDAO;
    this.classDAO = classDAO;
    this.teamDAO = teamDAO;
  }

  @GetMapping
  public String homePage(Model m) {
    //m.addAttribute("ids", champDAO.getAllChampId());
      m.addAttribute("champs", champDAO.findAll());
    return "index";
  }

  @GetMapping("/new")
  public String addNewTeam(Model m) {
    m.addAttribute("champ", new Champ());
    return "new";
  }

  @PostMapping("/new")
  public RedirectView createNewTeam(@ModelAttribute Champ champ, RedirectAttributes attrs) {
    attrs.addFlashAttribute("message", "Champion ajouté avec succès");
    // champDAO.save(champ);
    return new RedirectView("/");
  }

}
