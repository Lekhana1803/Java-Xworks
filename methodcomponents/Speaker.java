class Speaker{
static int maxVolume=10;
static boolean  isConnected;
static int currentVolume=0;


public static void increaseVolume(){
	if(isConnected == false){
	System.out.println("please switch on the speaker");
	isConnected = true;
	}
	else{
		if(isConnected == true){
			if(currentVolume < maxVolume){
			currentVolume = currentVolume +1;	
			System.out.println("The speaker volume is increased by "+currentVolume);
			System.out.println("current volume="+currentVolume);
			}
			else{
			System.out.println("it is alredy in the maxVolume");
			}
		}
		else{
		System.out.println("please make sure that your speaker is on or off" );
		}

		}
	}
			
				
}
