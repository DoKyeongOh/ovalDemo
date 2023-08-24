package org.example.oval;

public class OvalInspectResult {

    int totalDefCount;
    int successCount;
    int unknownCount;
    int errorCount;

    public int getTotalDefCount() {
        return totalDefCount;
    }

    public void setTotalDefCount(int totalDefCount) {
        this.totalDefCount = totalDefCount;
    }

    public int getSuccessCount() {
        return successCount;
    }

    public void setSuccessCount(int successCount) {
        this.successCount = successCount;
    }

    public int getUnknownCount() {
        return unknownCount;
    }

    public void setUnknownCount(int unknownCount) {
        this.unknownCount = unknownCount;
    }

    public int getErrorCount() {
        return errorCount;
    }

    public void setErrorCount(int errorCount) {
        this.errorCount = errorCount;
    }

    @Override
    public String toString() {
        return "OvalInspectResult{" +
                "totalDefCount=" + totalDefCount +
                ", successCount=" + successCount +
                ", unknownCount=" + unknownCount +
                ", errorCount=" + errorCount +
                '}';
    }
}
