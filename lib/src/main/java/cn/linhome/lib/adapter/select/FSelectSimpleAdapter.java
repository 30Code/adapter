package cn.linhome.lib.adapter.select;

import android.app.Activity;

import cn.linhome.lib.adapter.FSimpleAdapter;
import cn.linhome.lib.selectionmanager.FSelectManager;

public abstract class FSelectSimpleAdapter<T> extends FSimpleAdapter<T> implements FSelectableAdapter<T>
{
    private FSelectManager<T> mSelectManager;

    public FSelectSimpleAdapter(Activity activity)
    {
        super(activity);
        getSelectManager().setMode(FSelectManager.Mode.SINGLE);
    }

    @Override
    public final FSelectManager<T> getSelectManager()
    {
        if (mSelectManager == null)
        {
            mSelectManager = new AdapterSelectManager<>(this);
        }
        return mSelectManager;
    }
}
