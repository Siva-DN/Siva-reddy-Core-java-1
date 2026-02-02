package com.praticeprograms;

public class AverageStudent {
	
	int mathsmarks=80;
	int physics=60;
    int java=90;
	int sql=70;
	int social=85;
	float averagepercentage;
	int totalmarks;
	
	{
		totalmarks=mathsmarks+physics+java+sql+social;
		averagepercentage=mathsmarks+physics+java+sql+social;
	}


	    void main() {
		AverageStudent s1 =new AverageStudent();
		System.out.println("totalmarks"+s1.totalmarks);
		
		System.out.println("averagepercentage"+s1.averagepercentage/5);
		
	}

}
