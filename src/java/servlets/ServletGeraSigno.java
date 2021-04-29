package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import util.VerificaSigno;

@WebServlet(name = "ServletGeraSigno", urlPatterns = {"/ServletGeraSigno"})
public class ServletGeraSigno extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       request.setCharacterEncoding("UTF-8");
       HttpSession sessao = request.getSession(true);
        String data = new String();
       try{
          data= request.getParameter("data");
       }
       catch(Exception e)
       {data = "01-01-2000";}
       response.setContentType("text/html;charset=UTF-8");
       try (PrintWriter out = response.getWriter()) {
           VerificaSigno ver=new VerificaSigno();
           int num_sig = ver.RetornaSigno(data);
           RandomAccessFile raf;
            raf = new RandomAccessFile(request.getServletContext().getRealPath("")+"//horoscopo.txt","r");
            int i=0;
            String dados;
            while(i<num_sig)
            {
                dados = raf.readLine();
                i++;
            }
            dados = raf.readLine();
            raf.close();
            out.println(dados.split("#")[0]);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}