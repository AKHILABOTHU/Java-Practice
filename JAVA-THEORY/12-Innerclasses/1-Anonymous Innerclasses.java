	
	Anonymous Innerclasses (Nameless Innerclasses):-
						
							It reduce the length of the code, Anonymous innerclasses contains expressions does not contain declaration

			Expression:-

			Example 1:- // pkg-1 without anonymous class

			class Test
			{
				void m1()
				{

				}
				void m2()
				{

				}
			}


			class Test1 extends Test // pkg -2
			{
				void m1()
				{
					System.out.println("m1 method");
				}

				void m2()
				{
					System.out.println("m2 method");
				}
			}


			class TestClient  // pkg-3
			{
				public static void main(String[] args)
				{
					Test t = new Test();
					t.m1();
					t.m2(); 
				}
			}



					Example 2:- 

			 Test
			{
				void m1()
				{

				}
				void m2()
				{

				}
			}

			

			class TestClient 
			{
				public static void main(String[] args)
				{
					Test t = new Test()
					{
						void m1()
				{
					System.out.println("m1 method");
					System.out.println(t.getclass().getName());
				}

				void m2()
				{
					System.out.println("m2 method");
				}
					};

					public static void main(String[] args)
					{
						TestClient tt = new TestClient();
						tt.t.m1();
						tt.t.m2();
					}
					 
				}
			}


			-------------------------------------------------------------------------------

			thread

			/*
			
			class Thread
			{
				public void run(){}
			}
			
			class MyThread extends Thread
			{
				//overriding run to write logics
			}
			class TestClient
			{
				//creating object of MyThread
			}
			
			*/
		** Innerclasses purpose is only one time usage.

			class TestClient
			{
				Thread t = new Thread()
				{
					public void run()
					{
						System.out.println("Run Implementation");
					}
				};

				public static void main (String[] args)
				{
					TestClient tt = new TestClient();
					tt.t.run();
				}

			}



			Interfaces:-



			interface it1 //abstaract
			{
				void m1();
			}

			class Test  implements it1
			{
				//overriding methods
			}
			class TestClient
			{
				//creating objects of the test class
			}


			Example 1:-

			interface it1 //abstaract
			{
				void m1();
			}

			/*class Test  implements it1
			{
				//overriding methods
			}
			class TestClient
			{
				//creating objects of the test class
			}*/

			class TestClient
			{
				it1 i = new it1()
				{
					public void m1()
					{
					System.out.println("M1 Implementation");
					System.out.println(i.getclass().getName());
					}
				};
				public static void main (String[] args)
				{
					TestClient t = new TestClient();
					t.i.m1();
				}
			}


			abstract class :-

			abstract class Test  // predefined class
			{
				abstract void m1();

			}

		/*	class Test1 extends Test
			{
				//override the methods to write logics.

			}
			class TestClient
			{
				//create the object of test class access the methods
			} */	

			class TestClient
			{
				Test t = new Test()
					{
						void m1()
				{
					System.out.println("m1 method");
					System.out.println(t.getclass().getName());
				}
					};
			} 



			Nested classes:-

			Sun Micro systems

				1. static nested classes
				2.non static nested classes (Inner classes)
				      a. normal inner classes
					  b.method local inner classes
					  c.anonymous inner classes

				4- types of inner classes
						
					  a. normal inner classes
					  b.method local inner classes
					  c.anonymous inner classes
					  d.static inner classes

