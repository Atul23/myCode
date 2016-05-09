#include <stdio.h>
int opr(int a[],int n);//declaration
int main() {
    
	//code
	int t,n,a[1000],i,output[100],a1;
	scanf("%d",&t);
	a1=t;
	while(t!=0)
	{
	scanf("%d",&n);
	for(i=0;i<n;i++)
	{
	    scanf("%d",&a[i]);
	}
	output[t]=opr(a,n);
	t--;
	}
	while(a1!=0)
	{
	
	if(output[a1]==1)
	printf("YES\n");
	else
	printf("NO\n");
	a1--;
	}
	
	return 0;
}

int opr(int a[],int n) //definition
{
	int max,sum=0,i,loc,ele,val,sum1=0;
	max=a[0];
	for(i=1;i<n;i++)
	{ 
		if(max < a[i])
		{
		max=a[i];
		loc=i;
		}
	}
	for(i=0;i<n;i++)
	{ 
		if(i==loc)
		continue;
		sum=sum+a[i];
	}

	if(max > sum)
	return 0;
	else if(max==sum)
	return 1;
	if(max<sum)
	{
		if((max+sum)%2==0)
		{
		ele=(sum+max)/2;
		val=ele-max;
		for(i=0;i<n;i++)
		{
			if(val==a[i])
			break;
			else if(val>a[i])
			{
			if(i==loc)
			continue;
			sum1=sum1+a[i];
			if(sum1==val)
			break;
			}
		}
		if(i==n)
		return 0;
		else 
		return 1;
		}
		else
		{return 0;}
	}
	
}



