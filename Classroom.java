import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Name: (Jackson Hercina)
 * Course: CS20S
 * Teacher: Mr.Hardman
 * Lab#4, Program#1
 * Date Last Modified: (Nov.22.2017)
 * 
 */
public class Classroom extends World
{

    /**
     * Constructor for objects of class Classroom.
     * 
     */
    public Classroom()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Student student1 = new Student( 1, "Bob", "Smith", 12, 94.3, true );
        Student student2 = new Student( 2, "Kenan", "Tinkle", 1, 01.0, false );
        Student student3 = new Student( 3, "Will", "Denis", 11, 85.6, false );
        addObject(student1, 60, 60);
        addObject(student2, 540, 60);
        addObject(student3, 300, 340);
    }
}
