/**
 * Created by jc319816 on 19/09/16.
 */

public class Fiction extends Book
{
    public Fiction(String title)
    {
        super(title);
        setPrice();
    }
    public void setPrice()
    {
        super.price = 24.99;
    }

}