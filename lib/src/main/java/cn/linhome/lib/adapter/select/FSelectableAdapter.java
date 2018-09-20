package cn.linhome.lib.adapter.select;

import cn.linhome.lib.selectmanager.FSelectManager;

public interface FSelectableAdapter<T>
{
    FSelectManager<T> getSelectManager();
}
