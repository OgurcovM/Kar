using System;
using System.Collections.Generic;

namespace Task12
{
    internal class Program
    {
        public static void Main(string[] args)
        {
            Ex1();
            Ex2();
            Console.ReadLine();
        }
        public static void Ex1()
        {
            string[] lastNames = new[] {"Иванов","Петров","Максимов"};
            string[] firstNames = new[] {"Иван","Пётр","Максим" };
            bool checkName;
            bool checkLastName;
            
            Console.WriteLine("Задание 1:");
            Console.WriteLine("Введите имя:");
            string name = Console.ReadLine();
            Console.WriteLine("Введите фамилию:");
            string lastName = Console.ReadLine();
            checkName = Check(name, firstNames);
            checkLastName = Check(lastName, lastNames);
            if(checkName)
                Console.WriteLine("Имя есть в списке");
            else
                Console.WriteLine("Имени нет в списке");
            
            if(checkLastName)
                Console.WriteLine("Фамилия есть в списке");
            else
                Console.WriteLine("Фамилии нет в списке");
        } 
        public static void Ex2()
        {
            Console.WriteLine("\n\rЗадание 2");
            int[] sums = new int[7];
            int[] b = new[] {2,4,6,8,10,12,14,16}; //8
            int[] y = new[] {1,3,5,7,9,11,13}; //7
            for (int i = 0; i < 7; i++)
            {
                foreach (int num in y)
                {
                    sums[i] += num;
                }
                sums[i] *= y[i];
                foreach (int num in b)
                {
                    sums[i] += num;
                }
            }

            Console.WriteLine("Итог выражения: ");
            foreach (int sum in sums)
            {
                Console.WriteLine(sum);
            }
        }

        public static bool Check(string checkVariable, string[] massive)
        {
            foreach (string s in massive)
            {
                if (s == checkVariable)
                    return true;
            }
            return false;
        }
    }


}