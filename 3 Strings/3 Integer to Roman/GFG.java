// Program 3: Integer to Roman
// https://practice.geeksforgeeks.org/problems/convert-to-roman-no/1/?track=ppc-strings&batchId=221

    class GfG
{
	String convertToRoman(int n)
	{
		String strrom[][] = {{"","I","II","III","IV","V","VI","VII","VIII","IX"},
							   {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"},
							   {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"},
							   {"","M","MM","MMM","","","","","",""}};
		int i = 0;
		String str = "";
		while(n>0)
		{
			str = strrom[i][n%10]+str;
			n = n / 10;
			i++;
		}
		return str;
	}
	
}