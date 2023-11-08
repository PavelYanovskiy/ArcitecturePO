package Homework_10;

public class UnitOfWork {
    private boolean isTransactionActive;

    public boolean isTransactionActive() {
        return isTransactionActive;
    }

    public void setTransactionActive(boolean isTransactionActive) {
        this.isTransactionActive = isTransactionActive;
    }

    public void beginTransaction() {
        isTransactionActive = true;
    }

    public void endTransaction() {
        isTransactionActive = false;
    }

    public void rollback() {
        isTransactionActive = false;
    }

    public void commit() {
        // Логика сохранения изменений
    }

}
