package Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/curriculo")
public class Curriculo {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setAttribute("title", "Marco Antonio Sousa Soares");
        req.setAttribute("h11", "Marco Antonio Sousa Soares");
        req.setAttribute("subtitulo", "Estudante de Análise e Desenvolvimento de Sistemas");
        req.setAttribute("contato2", "marco.asousa09@gmail.com");
        req.setAttribute("contato3", "https://www.linkedin.com/in/marco-soares-desenvolvedor/");
        req.setAttribute("contato4", "https://github.com/DevMrc");

        req.setAttribute("h12", "Resumo");
        req.setAttribute("resumo", "Estudante de ADS no Senac SP");

        req.setAttribute("h13", "Formação Acadêmica");
        req.setAttribute("formacao1", "Tecnólogo em Análise e Desenvolvimento de Sistemas");
        req.setAttribute("formacao2", "Centro Universitário Senac (Cursando)");

        req.setAttribute("h14", "Certificações");
        req.setAttribute("certificacao1", "Introdução a Banco de Dados e Linguagem SQL – Escola de Inteligência Artificial – 2023;");
        req.setAttribute("certificacao2", "AWS Academy Cloud Foundations – AWS Academy – 2023;");
        req.setAttribute("certificacao2", "Ocupações Administrativas Práticas e Teóricas – CIEE – 2020;");
        req.setAttribute("certificacao2", "Lógica de Programação Back-end e Front-end/ Empreendedorismo – ORACLE ONE – 2020;");
        req.setAttribute("certificacao2", "Proprofissão em Administração – Senac – 2019;");
        req.setAttribute("certificacao2", "Curso Básico em elementos e recursos da ferramenta Word – Fundação Bradesco – 2018;");
        req.setAttribute("certificacao2", "Power Point Básico – Fundação Bradesco – 2018;");
        req.setAttribute("certificacao2", "Excel Básico – Fundação Bradesco – 2018;");
        req.setAttribute("certificacao2", "ESPRO FMT – Lar Mei Mei – 2018.");

        req.setAttribute("h15", "Experiencias profissionais");
        req.setAttribute("formacao1", "Instituto de Responsabilidade Social Sírio Libanês");
        req.setAttribute("formacao1", "Período: 03/2021 – Atualmente\r\n Cargo: Auxiliar administrativo");

        req.setAttribute("formacao1", "Allianz Seguros");
        req.setAttribute("formacao1", "Período: 09/2019 – 12/2020\r\n" + //
                        "        Cargo: Auxiliar administrativo de RH – Jovem Aprendiz");

        req.setAttribute("h15", "Descrição das atividades profissionais");
        req.setAttribute("h15", "Descrição das atividades profissionais");
        req.setAttribute("h15", "Instituto de Responsabilidade Social Sírio Libanês: Responsável por realizar o monitoramento do paciente, desde de seu\r\n" + //
                        "        ingresso no hospital, sua movimentação interna e externa até a alta hospitalar, ligada diretamente à direção geral do\r\n" + //
                        "        hospital, além de realizar transferências para outros hospitais para transferência e realização de exames, anexar\r\n" + //
                        "        documentos no prontuário do paciente e arquivamento de documentos; Conhecimento no sistema MV Soul onde geria a\r\n" + //
                        "        transferência e acompanhamento dos pacientes; Agendamento cirúrgico, responsável pelo agendamento de ambulatórios\r\n" + //
                        "        internos, agendamento de consultas externas através do portal SIRESP para recursos externos; Elaboração de relatórios\r\n" + //
                        "        semanais para acompanhamento dos ambulatórios; Agendamento de cirurgias eletivas além do controle da agenda para\r\n" + //
                        "        melhor aproveitamento das cirurgias do dia e também realizando a quantificação dos agendamentos eletivos para controle\r\n" + //
                        "        da meta estipulada.");

        req.setAttribute("h15", "Allianz Seguros: Responsável por organizar e arquivar documentos, prestar atendimento ao colaborador, realizar\r\n" + //
                        "        solicitação e envio de benefícios e documentos; Elaboração de planilhas para o controle de envio de benefícios;\r\n" + //
                        "        Participação na elaboração de prontuários de novos colaboradores, juntamente ao processo de admissão; Conhecimento\r\n" + //
                        "        do sistema APdata no qual realizava processos como atualização de foto do colaborador, retirada de fichas financeiras e\r\n" + //
                        "        de registro e CTPS atualizada; Realização de consulta de dados de colaborador para elaboração de contrato.");

        req.setAttribute("h16", "Habilidades");
        req.setAttribute("habilidade1", "Java: POO, Funções Recursivas, CRUD.");
        req.setAttribute("habilidade2", "Front-End: HTML5, CSS3, javascript.");

        req.setAttribute("h17", "Projetos");
        req.setAttribute("projeto1", "Você pode encontrar alguns dos meus projetos no GitHub, acessando o meu perfil em: <a href=\"https://github.com/DevMrc\">https://github.com/DevMrc</a>");

        req.getRequestDispatcher("cv.jsp").forward(req, resp);

    }
}
