/**
 * Created by jc319816 on 19/09/16.
 */
public abstract class Division
{
    protected String divisionTitle;
    protected int acctNum;
    public Division(String title, int acct)
    {
        divisionTitle = title;
        acctNum = acct;
    }
    public abstract void display();
}
