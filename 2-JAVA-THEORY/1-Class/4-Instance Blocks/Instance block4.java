Instance Blocks

		1.used to write the logics
		2.Execution during object creation
		
		Syntax:-
		{
		//Logics
		}
		
		diff between constructor and instance block
		
		Example:
		class Test
		{
		Test()
		{
		Syste.out.println("0-arg constructor"); // it execute second
		}
		{
		Syste.out.println("Instance Block "); // it execute first
		}
		public static void main (String[] args)
		{
		Syste.out.println("Hello WOrld");
		new Test();
		}
		}
		
		
		Need of instance blocks
		
		
		Example:
		class Test
		{
		Test()
		{
		Syste.out.println("0-arg constructor"); 
		}
		Test(int a)
		{
		Syste.out.println("0-arg constructor"); 
		}
		Test(int a, int b)
		{
		Syste.out.println("0-arg constructor"); 
		}
		{
		Syste.out.println("Instance Block "); // it execute first
		}
		public static void main (String[] args)
		{
		new Test();
		new Test(10);
		new Test(10,20);
		}
		}
		
		
		
		class Test
		{
		Test()
		{
		Syste.out.println("0-arg constructor"); 
		}
		Test(int a)
		{
		Syste.out.println("0-arg constructor"); 
		}
		
		{
		Syste.out.println("Instance Block-1 "); // it execute first
		}
		{
		Syste.out.println("Instance Block-2 "); // it execute second
		}
		public static void main (String[] args)
		{
		new Test();
		new Test(10);
		}
		}
		
		
		//initializing variables	
		
			class Emp
		{
		int eid;//
		
		{
		eid=1
		{
		System.out.println("Instance Block "); // it execute second
		}
			void disp()
			{
			Syste.out.println(eid);
			
			}
		public static void main (String[] args)
		{
		}
		}