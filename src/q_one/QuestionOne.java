package q_one;

import java.util.ArrayList;
import java.util.List;

public class QuestionOne {

	int num_doors = 100;

	public static void main(String[] args) {
		new QuestionOne().toggleDoors();
	
	}

	private void toggleDoors() {
		List<Doors> doors = createDoors();
		int y = 3;
		int round = 0;
		while (y > 0) {
			int index = 0;
			for (Doors door : doors) {
				switch (round) {
				case 0:

					door.setDoor_status(!door.isDoor_status());
					doors.set(index, door);
					break;

				case 1:

					if ((index+1) % 2 == 0) {
					
						door.setDoor_status(!door.isDoor_status());
						doors.set(index, door);
					}

					break;
				case 2:

					if ((index+1) % 3 == 0) {
				
						door.setDoor_status(!door.isDoor_status());
						doors.set(index, door);
					}

					break;
				}
				index++;
			}

			y--;
			round++;

		}
		for (Doors door : doors) {
			System.out.println(door.getDoor_number() + " " + (door.isDoor_status() ? "Open" : "Closed"));
		}

	}

	private List<Doors> createDoors() {
		List<Doors> doors = new ArrayList<>();
		for (int x = 1; x <= num_doors; x++) {
			doors.add(new Doors(false, "Num " + x));
		}

		return doors;
	}

	class Doors {
		boolean door_status;
		String door_number;

		public Doors(boolean door_status, String door_number) {

			this.door_status = door_status;
			this.door_number = door_number;
		}

		public boolean isDoor_status() {
			return door_status;
		}

		public String getDoor_number() {
			return door_number;
		}

		public void setDoor_status(boolean door_status) {
			this.door_status = door_status;
		}

		public void setDoor_number(String door_number) {
			this.door_number = door_number;
		}

	}
}
