package org.example.template;

public class TransferMoneyTask extends Task{

//    private AuditTrail auditTrail;

//    public TransferMoneyTask(AuditTrail auditTrail) {
////        this.auditTrail = auditTrail;
//        super(auditTrail);
//    }

//    public void execute() {
//        auditTrail.record();
//
//        System.out.println("Transfer Money");
//    }

    @Override
    protected void doExecute() {
        System.out.println("Transfer Money");
    }
}
