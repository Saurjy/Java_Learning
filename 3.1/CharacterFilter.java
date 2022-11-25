class CharacterFilter extends StringFilter{
	CharacterFilter(String S){
		Name = S;
	}
	public void CFilter(){
		int temp;
		for(int i = 0 ; i < Name.length();i++)
		{
			temp = Name.charAt(i);
			if(temp>64 && temp<91)
				System.out.println(Name.charAt(i));
			else if(temp>96 && temp<123)
				System.out.println(Name.charAt(i));
		}
	}
}
