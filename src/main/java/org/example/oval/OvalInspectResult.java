package org.example.oval;

public class OvalInspectResult {

    int totalDefCount;
    int successDefCount;
    int unknownDefCount;
    int errorDefCount;

    public int getTotalDefCount() {
        return totalDefCount;
    }

    public void setTotalDefCount(int totalDefCount) {
        this.totalDefCount = totalDefCount;
    }

    public int getSuccessDefCount() {
        return successDefCount;
    }

    public void setSuccessDefCount(int successDefCount) {
        this.successDefCount = successDefCount;
    }

    public int getUnknownDefCount() {
        return unknownDefCount;
    }

    public void setUnknownDefCount(int unknownDefCount) {
        this.unknownDefCount = unknownDefCount;
    }

    public int getErrorDefCount() {
        return errorDefCount;
    }

    public void setErrorDefCount(int errorDefCount) {
        this.errorDefCount = errorDefCount;
    }

    @Override
    public String toString() {
        return "OvalInspectResult{" +
                "totalDefCount=" + totalDefCount +
                ", successCount=" + successDefCount +
                ", unknownCount=" + unknownDefCount +
                ", errorCount=" + errorDefCount +
                '}';
    }
}
