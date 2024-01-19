package org.college;
//import org.placementcell.PlacementDetails;
public class College extends DepartmentDetails {
private void collegeName() {
	System.out.println("college name=KINGSTON");
}
private void collegeRank() {
	this.collegeName();
	System.out.println("college rank=1");
	super.departmentName();
}
public static void main (String[]args) {
	College a=new College();
	
	a.collegeRank();

}
}
