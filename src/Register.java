
public interface Register {

	public void enter(String Name, int Erscheinungsjahr, String Genre, int Bewertung); //hinzufügen
	public void remove(String Name, int Erscheinungsjahr); //entfernen
	public String search(String Suchtext); //suchen
	public void sort(); //ordnen
}
