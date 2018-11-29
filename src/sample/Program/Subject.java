package sample.Program;

public class Subject {
    private String idSubject;
    private boolean status;
    private String toSubject;

    public Subject(String idSubject, boolean status, String toSubject) {
        this.idSubject = idSubject;
        this.status = status;
        this.toSubject = toSubject;
    }

    public String getIdSubject() {
        return idSubject;
    }

    public void setIdSubject(String idSubject) {
        this.idSubject = idSubject;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getToSubject() {
        return toSubject;
    }

    public void setToSubject(String toSubject) {
        this.toSubject = toSubject;
    }
}
