package com.srm.training;

import java.util.logging.Logger;

public class Room {
	static Logger log=Logger.getLogger(Room.class.getName());
	int room_no;
	String room_type;
	float room_area;
	String Ac_machine;
	
	Room(int room_no, String room_type, float room_area, String Ac_machine){
		this.room_no=room_no;
		this.room_type=room_type;
		this.room_area=room_area;
		this.Ac_machine=Ac_machine;
	}
	void display() {
		log.info("AC Machine Info");
	log.info("Room Number: " +room_no +"Room Type: "  +room_type+" Room Area: " +room_area+" AC Machine: " +Ac_machine);
	}

	public static void main(String[] args) {
		Room rm=new Room(123,"Living Room",1200,"Split AC");
		rm.display();
		Room rm1=new Room(10,"Hall",2200,"Centralized");
		rm1.display();
		

	}

}
