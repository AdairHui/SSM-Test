package top.heiping.service.app;
import java.util.List;
import java.util.Map;
import top.heiping.domain.App;

public interface AppService {
	
	public void saveApp(App app);
	
	public List<App> listApp();
	
	public void updateApp(App app);
	
	public void deleteApp(int id);
	
	public App select(Map<String,Object> map);
}
