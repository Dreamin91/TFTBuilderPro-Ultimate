package fr.BedardBouzehouaneDouillard.tftbuilder;

import fr.BedardBouzehouaneDouillard.tftbuilder.data.ChampDAO;
import fr.BedardBouzehouaneDouillard.tftbuilder.data.TeamDAO;
import fr.BedardBouzehouaneDouillard.tftbuilder.model.Champ;
import fr.BedardBouzehouaneDouillard.tftbuilder.model.Team;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;

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
    attrs.addFlashAttribute("message", "Equipe ajoutée avec succès");
    teamDAO.save(team);
    return new RedirectView("/");
  }

  @DeleteMapping("/{id}")
  public RedirectView deleteUser(@PathVariable Integer id, RedirectAttributes attrs) {
    attrs.addFlashAttribute("message", "Equipe supprimée avec succès");
    this.teamDAO.deleteById(id);
    return new RedirectView("/Comps");
  }

}
