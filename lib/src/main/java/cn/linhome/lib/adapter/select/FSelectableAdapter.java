package cn.linhome.lib.adapter.select;

import cn.linhome.lib.selectionmanager.FSelectManager;

public interface FSelectableAdapter<T>
{
    FSelectManager<T> getSelectManager();
}
