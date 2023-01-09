class Union{
public static void main (String args[]){
int i, j=0;
int a[]={2,45,678,85,4,6,7};
int b[]={3,6,8,9,0,6,5};
int x=a.length;
int y=b.length;
int z=a.length+b.length;
int c[]=new int[z]; 
for( i=0; i<a.length; i++){
c[i]=a[i];
}
for( j=a.length+i; j<a.length; j++){
c[a.length+i]=b[i];
}
for( i=0; i<c.length; i++){
System.out.print(c[i]);
}
}
}