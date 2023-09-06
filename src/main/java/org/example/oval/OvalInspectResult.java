package org.example.oval;

import java.util.Map;

public class OvalInspectResult {

    private int totalDefCount;
    private int successDefCount;
    private int unknownDefCount;
    private int errorDefCount;
    private int notEvaluateDefCount;
    private int notApplicableCount;

    public OvalInspectResult(Map<String, OvalCriteriaResultType> resultMap) {
        for (OvalCriteriaResultType resultType : resultMap.values()) {
            totalDefCount++;
            switch (resultType) {
                case TRUE:
                    successDefCount++;
                    break;
                case FALSE:
                    break;
                case UNKNOWN:
                    unknownDefCount++;
                    break;
                case ERROR:
                    errorDefCount++;
                    break;
                case NOT_EVALUATED:
                    notEvaluateDefCount++;
                    break;
                case NOT_APPLICABLE:
                    notApplicableCount++;
                    break;
            }
        }
    }

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

    public int getNotEvaluateDefCount() {
        return notEvaluateDefCount;
    }

    public void setNotEvaluateDefCount(int notEvaluateDefCount) {
        this.notEvaluateDefCount = notEvaluateDefCount;
    }

    public int getNotApplicableCount() {
        return notApplicableCount;
    }

    public void setNotApplicableCount(int notApplicableCount) {
        this.notApplicableCount = notApplicableCount;
    }

    @Override
    public String toString() {
        return "OvalInspectResult{" +
                "totalDefCount=" + totalDefCount +
                ", successDefCount=" + successDefCount +
                ", unknownDefCount=" + unknownDefCount +
                ", errorDefCount=" + errorDefCount +
                ", notEvaluateDefCount=" + notEvaluateDefCount +
                ", notApplicableCount=" + notApplicableCount +
                '}';
    }
}
