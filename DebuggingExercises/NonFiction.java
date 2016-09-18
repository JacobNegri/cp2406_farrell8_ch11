/**
 * Created by jc319816 on 19/09/16.
 */
public class NonFiction extends Book
{
    public NonFiction(String title)
    {
        super(title);
        setPrice();
    }
    public void setPrice()
    {
        super.price = 37.99;
    }
}
