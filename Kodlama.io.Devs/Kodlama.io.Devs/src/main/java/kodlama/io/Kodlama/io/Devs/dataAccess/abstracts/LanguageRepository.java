package kodlama.io.Kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

public interface LanguageRepository {
	
	List<Language> getAll();

	Language getId(int id);
	
	public void add(Language language);
	
	public void update(Language language);
	
	public void delete(int id);
	
	
}
