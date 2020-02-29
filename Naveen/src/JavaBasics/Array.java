package JavaBasics;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[] = new int[4];

a[0]= 1;
a[1]= 2;
a[2]= 3;
a[3]= 4;

System.out.println(a[1]);
System.out.println(a[1]+a[3]);
System.out.println(a.length);

for(int j=0;j<a.length;j++)
{
	System.out.println(a[j]);
}


double g[] = new double[2];

g[0]= 1.23;
g[1]= 2.23;

System.out.println(g[0]);
System.out.println(g[0]+g[1]);
System.out.println(g.length);




Object ob[] = new Object[2];
ob[0]  = 123;
ob[1]  = "test iop";
System.out.println(ob[1]);

System.out.println(ob.length);

	
	}

}
