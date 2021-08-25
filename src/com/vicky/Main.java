package com.vicky;

import com.vicky.template.AuditTrail;
import com.vicky.template.GenerateReportTask;
import com.vicky.template.Task;
import com.vicky.template.TransferMoneyTask;


public class Main {

    public static void main(String[] args) {
        Task task = new TransferMoneyTask(new AuditTrail());
        task.execute();
        task = new GenerateReportTask(new AuditTrail());
        task.execute();
     }

}
