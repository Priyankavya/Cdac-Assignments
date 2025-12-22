using System;



namespace _36CSharpFeatures
{
    internal class Program
    {
        static void Main(string[] args)
        {
            #region Partial Class

            //CMath cMath = new CMath();
            //Console.WriteLine($"Add result ={cMath.Add(20,10)}");
            //Console.WriteLine($"Multiply result={cMath.Multiply(10,10)}");
            #endregion

           
           #region Nullable types [? = nullable operator]

            string name = null ; //allowed already
           
            //int c=null  not allowed

            // int dept = null; error because value type cant store null
            //hence use nullable operator

            int? dept = null;
            int? deptid=null;

            if (deptid.HasValue)
            {
                Console.WriteLine(deptid.Value);
            }
            else
            {
                Console.WriteLine("deptid=null");
            }

            DateTime? dt = null;

            //another way
            Nullable<int> n = null;
            Nullable<DateTime> d = null;

            #endregion

            #region ObjectInitializer {}

            //initializes object without constructor declaration 
            //constructor is created by compiler

            Food food=new Food() { id=101,name="pizza"};
            Console.WriteLine(food.id+"  "+food.name);

            Food food1 = new Food() { id = 201, name = "burer", price = 200 };
            Console.WriteLine(food1.id+" "+food1.name+" "+food1.price);

            #endregion

        }

        public class Food
          
        {
            public int id;
            public string name;
            public int price;
        }
    }
}
