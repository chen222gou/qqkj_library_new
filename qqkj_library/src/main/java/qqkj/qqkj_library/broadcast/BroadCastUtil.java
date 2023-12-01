package qqkj.qqkj_library.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;

/**
 * 这个类是用来做甚的
 * 创建广播
 * <p>
 * Created by 陈二狗 on 2017/9/13.
 */

public class BroadCastUtil {

    private static BroadCastUtil _broadcast_util = null;

    private Context _context;


    private BroadCastUtil(Context _context){

        this._context = _context;
    }


    public static BroadCastUtil getIns(Context _context){

        return new BroadCastUtil(_context);
    }


    /**
     * 注册广播
     * @param _br_name
     * @param _br
     */
    public void _get_broadcast(String _br_name, BroadcastReceiver _br){

        IntentFilter _intent_filter = new IntentFilter(_br_name);

        _context.registerReceiver(_br,_intent_filter);
    }


    /**
     * 反注册广播
     * @param _br
     */
    public void _get_un_broadcast(BroadcastReceiver _br){

        if(null != _br){

            _context.unregisterReceiver(_br);
        }
    }
}
