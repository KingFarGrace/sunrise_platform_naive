package team.sunrise.managementplatform.entity;

import java.util.Date;
import java.util.Objects;

public class Task {
    private String uid;
    private String content;
    private Date startTime;
    private Date endTime;

    public Task() {}

    public Task(String uid, String content, Date startTime, Date endTime) {
        this.uid = uid;
        this.content = content;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Task task = (Task) o;
        return Objects.equals(uid, task.uid) &&
                Objects.equals(content, task.content) &&
                Objects.equals(startTime, task.startTime) &&
                Objects.equals(endTime, task.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uid, content, startTime, endTime);
    }
}
