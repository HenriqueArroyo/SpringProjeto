package com.webapp.escola_xyz_b.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class IndexController {
    //classe para criação das rotas de navegação

    @GetMapping("/home")
    public ModelAndView acessoHomePage() {
        ModelAndView mv = new ModelAndView("index");
        return mv;
    }
    @GetMapping("")
    public ModelAndView acessoHomePage2() {
        ModelAndView mv = new ModelAndView("index");
        return mv;
    }
    @GetMapping("/login-adm")
    public ModelAndView acessoLoginAdm() {
        ModelAndView mv = new ModelAndView("login/login-adm");
        return mv;
    }
    @GetMapping("/cadastro-adm")
    public String acessoCadastroAdm() {
        return "cadastro/cadastro-adm";
    }
    @GetMapping("/login-professor")
    public ModelAndView acessoLoginProfessor() {
        ModelAndView mv = new ModelAndView("login/login-professor");
        return mv;
    }
    @GetMapping("/cadastro-professor")
    public ModelAndView acessoCadastroProfessor() {
        ModelAndView mv = new ModelAndView("cadastro/cadastro-professor");
        return mv;
    }
    @GetMapping("/login-aluno")
    public ModelAndView acessoLoginAluno() {
        ModelAndView mv = new ModelAndView("login/login-aluno");
        return mv;
    }
    @GetMapping("/cadastro-aluno")
    public ModelAndView acessoCadastroAluno() {
        ModelAndView mv = new ModelAndView("cadastro/cadastro-aluno");
        return mv;
    }
    @GetMapping("/contato")
    public ModelAndView acessoContato() {
        ModelAndView mv = new ModelAndView("contato/contato");
        return mv;
    }
    @GetMapping("/sobre")
    public ModelAndView acessoSobre() {
        ModelAndView mv = new ModelAndView("sobre/sobre");
        return mv;
    }
    
    
    
    
}