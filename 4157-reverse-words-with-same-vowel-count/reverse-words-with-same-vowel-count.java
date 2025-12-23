class Solution {
    public String reverseWords(String s) {
		int count = 1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                count++;
            }
        }
        String[] s1=s.split(" ");
        int v=0;
        for(int i=0;i<s1[0].length();i++) {
        	char ch=s1[0].charAt(i);
        	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
        		v++;
        	}
        }
        int k=0;
        String news=s1[0]+" ";
        for(int i=1;i<s1.length;i++) {
        	for(int j=0;j<s1[i].length();j++) {
        		char ch=s1[i].charAt(j);
            	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
            		k++;
            	}
        	}
        	if(k==v) {
        		String rev="";
        		for(int l=s1[i].length()-1;l>=0;l--) {
        			char ch=s1[i].charAt(l);
        			rev=rev+ch;
        		}
        		news=news+rev+" ";
        	}
        	else {
        		news=news+s1[i]+" ";
        	}
            k=0;
        }
        return news.trim();
    }
}