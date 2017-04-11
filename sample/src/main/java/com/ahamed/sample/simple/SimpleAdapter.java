package com.ahamed.sample.simple;

import com.ahamed.multiviewadapter.DataListManager;
import com.ahamed.multiviewadapter.RecyclerListAdapter;
import java.util.List;

public class SimpleAdapter extends RecyclerListAdapter {

  private DataListManager<ItemModel> dataManager;

  public SimpleAdapter() {
    this.dataManager = new DataListManager<>(this);
    addDataManager(dataManager);

    registerBinder(new ItemBinder());
  }

  public void addData(List<ItemModel> dataList) {
    dataManager.addAll(dataList);
  }
}