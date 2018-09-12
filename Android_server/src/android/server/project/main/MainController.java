package android.server.project.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.google.gson.Gson;

import antlr.collections.List;

@Controller
public class MainController {

	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping(value="/ispis", method= {RequestMethod.POST, RequestMethod.GET})
	public String ispis(HttpServletRequest httpServletRequest, Model model) {
		
		String tekstJson = "";
		
		String tekst = httpServletRequest.getParameter("sifra");
		model.addAttribute("sifra", tekst);
	    
	    Studenti studenti = new Studenti("Mustafa", "Mustafic", 20, 10);
	    Studenti studenti2 = new Studenti("Hasan", "Hasanic", 20, 100);
	    Studenti studenti3 = new Studenti("Kemal", "Kemalic", 20, 140);
	    
	    ArrayList<Studenti> listaStudenata = new ArrayList<>();
	    listaStudenata.add(studenti);
	    listaStudenata.add(studenti2);
	    listaStudenata.add(studenti3);
	    
	    Gson gson = new Gson();
	    if (httpServletRequest.getParameterMap().containsKey("name")){
		    	for (Studenti st : listaStudenata) {
					if(st.getIme().toLowerCase().equals(httpServletRequest.getParameter("name")))
						tekstJson = gson.toJson(st).trim();
				}
		    }else tekstJson = gson.toJson(listaStudenata).trim();

	    model.addAttribute("gson", tekstJson);
	    
		return "ispis";
	}
	
	
}
