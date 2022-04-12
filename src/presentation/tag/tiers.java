package presentation.tag;

import javax.servlet.jsp.tagext.SimpleTagSupport;

public class tiers extends SimpleTagSupport
{
    private String type;

    public final String getType()
    {
        return type;
    }

    public final void setType(String type)
    {
        this.type = type;
    }
}
