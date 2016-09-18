/**
 * Created by jc319816 on 19/09/16.
 */

public class ElementArray
{
    public static void main(String[] args)
    {
        Element elements[] = new Element[3];
        int i;
        elements[0] = new MetalElement("Cu", 29, 63.55);
        elements[1] = new NonMetalElement("He", 2, 4.003);
        elements[2] = new MetalElement("Ne", 1029, 20.18);
        for(i = 0; i < elements.length; ++i)
            elements[i].describeElement();
    }
}
