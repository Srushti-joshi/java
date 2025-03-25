class FloorRunner{
	public static void main(String[] args) {
        Floor floor = new Floor();
          System.out.println("Default Values:");
        System.out.println("Material: " + floor.material);
        System.out.println("Color: " + floor.color);
        System.out.println("Level: " + floor.level);
        System.out.println("Area: " + floor.area);

          floor.material = "Marble";
          floor.color = "White";
          floor.level = 2;
          floor.area = 1500;
          System.out.println("\nUpdated Values:");

          System.out.println("Material: " + floor.material);
        System.out.println("Color: " + floor.color);
        System.out.println("Level: " + floor.level);
        System.out.println("Area: " + floor.area);

        
	
}
}