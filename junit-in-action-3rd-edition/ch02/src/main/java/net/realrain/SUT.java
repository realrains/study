package net.realrain;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class SUT {

    private String systemName;
    private boolean verified;
    private List<Job> jobs;

    public SUT() {
        this("테스트 대상 시스템");
    }

    public SUT(String systemName) {
        this.systemName = systemName;
        this.verified = false;
        this.jobs = new ArrayList<>();
    }

    public void verify() {
        this.verified = true;
    }

    public void addJob(Job job) {
        this.jobs.add(job);
    }

    public void run() {
        if (this.jobs.isEmpty()) {
            throw new IllegalStateException("실행할 작업이 없습니다");
        }
        Job runningJob = this.jobs.remove(0);
        System.out.println("Running Job: " + runningJob.getName());
    }

    public void run(Duration jobDuration) throws InterruptedException {
        run();
        Thread.sleep(jobDuration);
    }

    public boolean isVerified() {
        return verified;
    }

    public String getSystemName() {
        return systemName;
    }
}
