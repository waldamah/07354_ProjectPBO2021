package Controller;

import Entity.RecordEntity;

public interface ClusterControllerInterface {
    public void initializeClusterAndCentroid(int clusterNumber);
    public void initializeCluster(int clusterNumber,RecordEntity record);
    public void FinalCluster();
    public String viewDataCluster();
}
