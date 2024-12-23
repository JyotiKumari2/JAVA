import MyPack1.Demo;
import MyPack1.Demo2;
import MyPack1.inner.Demo3;


class TestPackage
{

   public static void main(String[] args)
  {

      Demo d1 = new Demo();
      d1.Display();
      Demo2 d2 = new Demo2();
      d2.Display();
      Demo3 d3 = new Demo3();
      d3.Display();
      
  }

}