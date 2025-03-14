import java.util.HashMap;
import java.util.Map;

class LearningRecord {
    private String username;
    private Map<String, String> progress = new HashMap<>();

    public LearningRecord(String username) {
        this.username = username;
    }

    public void updateProgress(String courseName, String status) {
        progress.put(courseName, status);
        System.out.println("课程进度更新： " + username + " 的 " + courseName + "课状态为： " + status);
    }

    public Map<String, String> getProgress() {
        return progress;
    }
}

class LearningRecordManager {
    private Map<String, LearningRecord> records = new HashMap<>();

    public void createRecord(String username) {
        if (!records.containsKey(username)) {
            records.put(username, new LearningRecord(username));
            System.out.println(username+"课程管理已创建" );
        }
    }

    public void updateProgress(String username, String courseName, String status) {
        LearningRecord record = records.get(username);
        if (record != null) {
            record.updateProgress(courseName, status);
        }
    }

    public LearningRecord getRecord(String username) {
        return records.get(username);
    }
}
