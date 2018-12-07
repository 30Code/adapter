package cn.linhome.adapter.model;

import java.util.ArrayList;
import java.util.List;

import cn.linhome.lib.selectionmanager.FSelectManager;

public class DataModel extends FSelectManager.SelectableModel
{
    public String name;

    public static List<DataModel> get(int count)
    {
        final List<DataModel> list = new ArrayList<>();
        for (int i = 0; i < count; i++)
        {
            final DataModel model = new DataModel();
            model.name = String.valueOf(i);
            list.add(model);
        }
        return list;
    }

    @Override
    public String toString()
    {
        return name;
    }
}
