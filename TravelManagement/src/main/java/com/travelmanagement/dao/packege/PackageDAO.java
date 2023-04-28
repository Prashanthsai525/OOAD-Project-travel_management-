package com.travelmanagement.dao.packege;

import com.travelmanagement.model.travelpackage.TravelPackageModel;
import com.travelmanagement.model.user.UsersModel;

import java.util.List;
//DAO pattern
//DAO interface defines an abstract api that performs curd operations
public interface PackageDAO {
    public void save(UsersModel usersModel, TravelPackageModel travelPackageModel);

    public List<TravelPackageModel> getAllTravelPackage();

    public TravelPackageModel getTravelPackage(int id);

    public List<TravelPackageModel> getTravelPackageByUser(int id);

    public void deleteTravelPackage(int id);

    public void updateTravelPackage(TravelPackageModel travelPackageModel);
}
