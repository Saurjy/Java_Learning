class NumberFilter extends StringFilter{
	NumberFilter(String S){
		Name = S;
	}
	public void NFilter(){
		int temp;
		for(int i = 0 ; i < Name.length();i++)
		{
			temp = Name.charAt(i);
			if(temp>47 && temp<58)
				System.out.println(Name.charAt(i));
		}
	}
}
