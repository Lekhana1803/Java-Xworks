class NewspaperRunner{

public static void main(String[] args){
System.out.println("main stated");


//classname refvar=new clsname()or new Constructor
Newspaper paper=new Newspaper();//obj ref type or custom type


//instance type of var(newspaperid)
System.out.println("id of newspaper ="+paper.newspaperId);
System.out.println("brand of newspaper ="+paper.Brand);
System.out.println("number of pages in newspaper="+paper.noOfPages);
System.out.println("language of newspaper="+paper.languge);
System.out.println("date of newspaper="+paper.date);
System.out.println("day of newspaper="+paper.day);


paper.newspaperId=1;
paper.Brand="times of india";
paper.noOfPages=19;//instance
paper.languge="english";
paper.date="25-1-2025";
paper.day="tuesday";


System.out.println("id of newspaper =" + paper.newspaperId);
System.out.println("brand of newspaper is="+paper.Brand);
System.out.println("number of pages in newspaper ="+paper.noOfPages);
System.out.println("language of newspaper="+paper.languge);
System.out.println("date of newspaper ="+paper.date);
System.out.println("day of newspaper ="+paper.day);


System.out.println("main ended");


}
}



