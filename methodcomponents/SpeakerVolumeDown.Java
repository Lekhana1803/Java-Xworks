class SpeakerVolumeDown{


static int decreaseVolume=0;
 static int currentVolume=10;
 static boolean isConnected;
public static void volumeDecrease(){
 

	if(isConnected == false){
		System.out.println("The speaker is 'off' plsease switch 'on' the speaker");
	isConnected = true;
         }
	
	else{
		if(isConnected == true){
			System.out.println("you system volume is" +currentVolume+ "decrese possible ");
               		  if(currentVolume > decreaseVolume){
		 		currentVolume = currentVolume-1;
 				System.out.println("you are decreased the volume by "+currentVolume);
               		  }
			}	
		else{
			System.out.println("please recheck the connection again if the speaker is on or off"+isConnected);
		}
 	}
   }

}