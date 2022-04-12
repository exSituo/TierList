package presentation.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/index.html", "/accueil", "/form"})
public class Formulaire extends HttpServlet
{
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        try
        {
            request.getRequestDispatcher("WEB-INF/tierliste.jsp").forward(request, response);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        System.out.println("Nouveau formulaire !");
        try
        {
            String[] top1 = request.getParameterValues("top1");
            ArrayList<Integer> liste1 = new ArrayList<Integer>();
            if (top1.length == 0)
            {
                int convertedtop1 = Integer.parseInt(top1[0]);
                liste1.add(convertedtop1);

            }
            else
            {
                for (int i = 0; i < top1.length; i++)
                {
                    int convertedtop1 = Integer.parseInt(top1[i]);
                    liste1.add(convertedtop1);
                }

            }
            String[] top2 = request.getParameterValues("top2");
            ArrayList<Integer> liste2 = new ArrayList<Integer>();
            if (top2.length == 0)
            {
                int convertedtop1 = Integer.parseInt(top1[0]);
                liste1.add(convertedtop1);

            }
            else
            {
                for (int i = 0; i < top2.length; i++)
                {
                    int convertedtop2 = Integer.parseInt(top2[i]);
                    liste2.add(convertedtop2);
                }

            }

            String[] top3 = request.getParameterValues("top3");
            ArrayList<Integer> liste3 = new ArrayList<Integer>();
            if (top3.length == 0)
            {
                int convertedtop3 = Integer.parseInt(top3[0]);
                liste3.add(convertedtop3);

            }
            else
            {
                for (int i = 0; i < top3.length; i++)
                {
                    int convertedtop3 = Integer.parseInt(top3[i]);
                    liste3.add(convertedtop3);
                }

            }
            String[] top4 = request.getParameterValues("top4");
            ArrayList<Integer> liste4 = new ArrayList<Integer>();
            if (top4.length == 0)
            {
                int convertedtop4 = Integer.parseInt(top4[0]);
                liste3.add(convertedtop4);

            }
            else
            {
                for (int i = 0; i < top4.length; i++)
                {
                    int convertedtop4 = Integer.parseInt(top4[i]);
                    liste4.add(convertedtop4);
                }

            }

            String[] top5 = request.getParameterValues("top5");
            ArrayList<Integer> liste5 = new ArrayList<Integer>();
            if (top5.length == 0)
            {
                int convertedtop5 = Integer.parseInt(top5[0]);
                liste3.add(convertedtop5);

            }
            else
            {
                for (int i = 0; i < top5.length; i++)
                {
                    int convertedtop5 = Integer.parseInt(top5[i]);
                    liste5.add(convertedtop5);
                }

            }

            String[] top6 = request.getParameterValues("top6");
            ArrayList<Integer> liste6 = new ArrayList<Integer>();
            if (top6.length == 0)
            {
                int convertedtop6 = Integer.parseInt(top6[0]);
                liste3.add(convertedtop6);

            }
            else
            {
                for (int i = 0; i < top6.length; i++)
                {
                    int convertedtop6 = Integer.parseInt(top6[i]);
                    liste6.add(convertedtop6);
                }

            }

            String[] top7 = request.getParameterValues("top7");
            ArrayList<Integer> liste7 = new ArrayList<Integer>();
            if (top7.length == 0)
            {
                int convertedtop7 = Integer.parseInt(top7[0]);
                liste7.add(convertedtop7);

            }
            else
            {
                for (int i = 0; i < top7.length; i++)
                {
                    int convertedtop7 = Integer.parseInt(top7[i]);
                    liste7.add(convertedtop7);
                }
            }

            String[] top8 = request.getParameterValues("top8");
            ArrayList<Integer> liste8 = new ArrayList<Integer>();
            if (top8.length == 0)
            {
                int convertedtop8 = Integer.parseInt(top8[0]);
                liste8.add(convertedtop8);

            }
            else
            {
                for (int i = 0; i < top8.length; i++)
                {
                    int convertedtop8 = Integer.parseInt(top8[i]);
                    liste8.add(convertedtop8);
                }
            }

            String[] top9 = request.getParameterValues("top9");
            ArrayList<Integer> liste9 = new ArrayList<Integer>();
            if (top9.length == 0)
            {
                int convertedtop9 = Integer.parseInt(top9[0]);
                liste9.add(convertedtop9);

            }
            else
            {
                for (int i = 0; i < top9.length; i++)
                {
                    int convertedtop9 = Integer.parseInt(top9[i]);
                    liste9.add(convertedtop9);
                }
            }

        }
        catch (Exception e)
        {
            System.out.println(e);
        }

    }
}
