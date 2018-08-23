package com.edan.www.navigationdemo.bottomnavgation

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.edan.www.navigationdemo.R

/**
 * 创建者     Zhangyu
 * 创建时间   2018/8/22 9:09
 * 描述	      ${TODO}
 *
 * 更新者     $Author
 * 更新时间   $Date
 * 更新描述   ${TODO}
 */
class DashboardFragment : Fragment(){

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_dashboard, container, false);
    }
}