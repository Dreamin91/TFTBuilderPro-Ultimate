package fr.BedardBouzehouaneDouillard.tftbuilder.app;

import fr.BedardBouzehouaneDouillard.tftbuilder.data.ChampDAO;
import fr.BedardBouzehouaneDouillard.tftbuilder.data.TeamDAO;
import fr.BedardBouzehouaneDouillard.tftbuilder.model.Champ;
import fr.BedardBouzehouaneDouillard.tftbuilder.model.Team;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;

/**
 *
 */
@RequestMapping("/")
@Controller
public class LibraryController {

  private final ChampDAO champDAO;
  private final TeamDAO teamDAO;

  public LibraryController(ChampDAO champDAO, TeamDAO teamDAO) {
    this.champDAO = champDAO;
    this.teamDAO = teamDAO;
  }

  @GetMapping
  public String homePage(Model m) {
      m.addAttribute("champs", champDAO.findAll());
      m.addAttribute("team", new Team());
    return "index";
  }

  @GetMapping("/Comps")
  public String addNewTeam(Model m) {
    m.addAttribute("teams", teamDAO.findAll());
    m.addAttribute("champs", new ArrayList<Champ>());
    return "Comps";
  }

  @PostMapping("/")
  public RedirectView createNewTeam(@ModelAttribute Team team, RedirectAttributes attrs) {
    attrs.addFlashAttribute("message", "Equipe ajoutée avec succés");
    teamDAO.save(team);
    return new RedirectView("/");
  }

}
