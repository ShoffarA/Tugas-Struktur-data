public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int ia,i1,i2,i3,i4,o,p;
System.out.println(“Program Kalkulator Bilangan Pecahan”);
System.out.println(“Pilihan Operator”);
System.out.println(“1. Penjumlahan \t3. Perkalian”
+ “\n2. Pengurangan \t4. Pembagian”);
System.out.print(“Masukkan pilihan : “);
ia = input.nextInt();</strong>

if(ia==1)
{
System.out.print(“Masukkan bilangan pembilang 1 : “);
i1 = input.nextInt();
System.out.print(“Masukkan bilangan penyebut 1 : “);
i2 = input.nextInt();
System.out.print(“Masukkan bilangan pembilang 2 : “);
i3 = input.nextInt();
System.out.print(“Masukkan bilangan penyebut 2 : “);
i4 = input.nextInt();
if(i2!=i4)
{
System.out.print(i1+”/”+i2+” + “+i3+”/”+i4+” = “);
int k = i2*i4;
i1 = k/i2*i1;
i3 = k/i4*i3;
p = i1+i3;
if(p%k==0)
{
p = p/k;
System.out.println(i1+”/”+k+” + “+i3+”/”+k+” = “+p+”/”+k+”=” +p);
}
else
System.out.println(i1+”/”+k+” + “+i3+”/”+k+” = “+p+”/”+k);
}
else
{
p = i1+i3;
if(p%i2==0)
{
p = p/i2;
System.out.println(i1+”/”+i2+” + “+i3+”/”+i4+” = “+i2+”/”+i2+” = “+p);
}
else
System.out.println(i1+”/”+i2+” + “+i3+”/”+i4+” = “+p+”/”+i2);
}
}

else if(ia==2)
{
System.out.print(“Masukkan bilangan pembilang 1 : “);
i1 = input.nextInt();
System.out.print(“Masukkan bilangan penyebut 1 : “);
i2 = input.nextInt();
System.out.print(“Masukkan bilangan pembilang 2 : “);
i3 = input.nextInt();
System.out.print(“Masukkan bilangan penyebut 2 : “);
i4 = input.nextInt();
if(i2!=i4)
{
System.out.print(i1+”/”+i2+” – “+i3+”/”+i4+” = “);
int k = i2*i4;
i1 = k/i2*i1;
i3 = k/i4*i3;
p = i1-i3;
if(p%k==0)
{
p = p/k;
System.out.println(i1+”/”+k+” – “+i3+”/”+k+” = “+p+”/”+k+”=” +p);
}
else
System.out.println(i1+”/”+k+” – “+i3+”/”+k+” = “+p+”/”+k);
}
else
{
p = i1-i3;
if(p%i2==0)
{
p = p/i2;
System.out.println(i1+”/”+i2+” – “+i3+”/”+i4+” = “+i2+”/”+i2+” = “+p);
}
else
System.out.println(i1+”/”+i2+” – “+i3+”/”+i4+” = “+p+”/”+i2);
}
}

else if(ia==3)
{
System.out.print(“Masukkan bilangan pembilang 1 : “);
i1 = input.nextInt();
System.out.print(“Masukkan bilangan penyebut 1 : “);
i2 = input.nextInt();
System.out.print(“Masukkan bilangan pembilang 2 : “);
i3 = input.nextInt();
System.out.print(“Masukkan bilangan penyebut 2 : “);
i4 = input.nextInt();
System.out.print(i1+”/”+i2+” x “+i3+”/”+i4+” = “);
i1 = i1*i3;
i2 = i2*i4;
if(i1%i2==0)
{
p = i1/i2;
System.out.println(i1+”/”+i2+” x “+i3+”/”+i4+” = “+i1+”/”+i2+”=” +p);
}
else
System.out.println(i1+”/”+i2+” x “+i3+”/”+i4+” = “+i1+”/”+i2);
}

else if(ia==4)
{
System.out.print(“Masukkan bilangan pembilang 1 : “);
i1 = input.nextInt();
System.out.print(“Masukkan bilangan penyebut 1 : “);
i2 = input.nextInt();
System.out.print(“Masukkan bilangan pembilang 2 : “);
i3 = input.nextInt();
System.out.print(“Masukkan bilangan penyebut 2 : “);
i4 = input.nextInt();
System.out.print(i1+”/”+i2+” / “+i3+”/”+i4+” = “);
i1 = i1*i4;
i2 = i2*i3;
if(i1%i2==0)
{
p = i1/i2;
System.out.println(p);
}
else
System.out.println(i1+”/”+i2);
}
