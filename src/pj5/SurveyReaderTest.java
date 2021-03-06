package pj5;

import java.io.FileNotFoundException;
import student.TestCase;

/**
 * This is a test class for SurveyReader
 * 
 * @author zuriw, usmana
 * @version 11/30/2016
 */
public class SurveyReaderTest extends TestCase
{

    private SurveyReader reader;
    private MusicReader  musicReader;


    /**
     * creates an SurveyReader object for testing
     */
    public void setUp() throws FileNotFoundException
    {

        reader = new SurveyReader("MusicSurveyDataTest1.csv");
        musicReader = new MusicReader("SongListTest1.csv");
    }


    /**
     * tests to see if the SurveyReader can retrieve the songs from the File
     */
    public void testGetStudents()
    {
        LList<Song> songs = musicReader.getSongs();
        LList<Student> students = reader.getStudents(songs);
        assertEquals(6, students.getLength());

    }
}
