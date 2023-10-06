package com.midominio.evaluable1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping({"/", "/home", "/home/", ""})
	public String homeHandler(Model m) {
		m.addAttribute("titulo", "Inicio");
		m.addAttribute("tituloH1", "Lorem ipsum dolor sit amet.");
		m.addAttribute("p1", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus placerat mollis felis, at tempus mauris lacinia sit amet. Duis purus sapien, molestie eu condimentum ut, ultricies in metus. Proin metus leo, porttitor at tempus vitae, volutpat ac orci. Nullam eu ligula vitae est placerat tempus. Nunc sapien dui, posuere ut nibh ac, porttitor cursus est. Sed mauris tellus, posuere quis rutrum a, volutpat nec ante. Pellentesque commodo faucibus elit, venenatis aliquet quam dignissim sit amet. Donec tempus ex tincidunt imperdiet sodales. Ut justo augue, sagittis a dui nec, interdum bibendum velit. Nam justo ligula, placerat fermentum augue ut, viverra placerat risus. Phasellus feugiat leo leo, id suscipit libero fermentum id.");
		m.addAttribute("p2", "Suspendisse convallis quam sem, quis condimentum libero tempus ac. Ut lacinia vestibulum nibh gravida volutpat. Cras lacinia in ligula ac tempus. Maecenas nec odio sed tellus posuere commodo. Sed magna libero, consectetur quis faucibus at, pulvinar nec neque. Nam mi quam, semper id tincidunt in, tristique faucibus quam. Sed malesuada mi magna, non iaculis est gravida quis. Etiam eleifend convallis libero id ullamcorper. Nam nulla tellus, aliquet nec tellus nec, porta hendrerit augue.");
		m.addAttribute("p3", "Nunc ut dolor viverra, fringilla magna non, interdum justo. Maecenas molestie nec velit in venenatis. Integer euismod tincidunt felis, id ornare nunc sollicitudin vitae. Nulla finibus rhoncus metus eget feugiat. Praesent pharetra interdum eros non sodales. Praesent ultrices nisi elit, ut dapibus quam scelerisque et. Vestibulum sapien nisl, convallis at venenatis vel, tincidunt nec lacus. Vestibulum ac congue leo. Nullam in tellus sed purus interdum varius. Vestibulum ullamcorper eget ligula nec ullamcorper. Lorem ipsum dolor sit amet, consectetur adipiscing elit.");
		
		return "home";
	}
}
