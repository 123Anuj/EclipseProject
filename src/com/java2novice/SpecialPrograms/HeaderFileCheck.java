package com.java2novice.SpecialPrograms;

public class HeaderFileCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String tag1 = "<strong>This is Strong Text </strong>";
		    while((tag1 = getContent(tag1)).contains("<"))
		    {
		        tag1 = getContent(tag1);
		    }
		    System.out.println(tag1);
	}


public static String getContent(String line)
{
    String content = "";
    if(line.contains("<") && line.contains(">"))
    {
        String tag = line.substring(line.indexOf("<")+1, line.indexOf(">"));
        if(line.contains("</"+tag+">"))
        {
                int st = line.indexOf(">");
                int end = line.lastIndexOf("<");
                content = line.substring(st+1,end);
        }
        else return "None";
    }else content =line;
    return content;
}
}