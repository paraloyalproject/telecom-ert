package telecom.ERT.service;

import java.util.List;

public class ChartData {
    private List<String> labels;
    private List<Integer> totalConnections;
    private List<Integer> prepaidUsage;
    private List<Integer> postpaidUsage;
    private List<Integer> currentUsage;

    public ChartData(List<String> labels, List<Integer> totalConnections,
                     List<Integer> prepaidUsage, List<Integer> postpaidUsage, List<Integer> currentUsage) {
        this.labels = labels;
        this.totalConnections = totalConnections;
        this.prepaidUsage = prepaidUsage;
        this.postpaidUsage = postpaidUsage;
        this.currentUsage = currentUsage;
    }

	public List<String> getLabels() {
		return labels;
	}

	public void setLabels(List<String> labels) {
		this.labels = labels;
	}

	public List<Integer> getTotalConnections() {
		return totalConnections;
	}

	public void setTotalConnections(List<Integer> totalConnections) {
		this.totalConnections = totalConnections;
	}

	public List<Integer> getPrepaidUsage() {
		return prepaidUsage;
	}

	public void setPrepaidUsage(List<Integer> prepaidUsage) {
		this.prepaidUsage = prepaidUsage;
	}

	public List<Integer> getPostpaidUsage() {
		return postpaidUsage;
	}

	public void setPostpaidUsage(List<Integer> postpaidUsage) {
		this.postpaidUsage = postpaidUsage;
	}

	public List<Integer> getCurrentUsage() {
		return currentUsage;
	}

	public void setCurrentUsage(List<Integer> currentUsage) {
		this.currentUsage = currentUsage;
	}
}
