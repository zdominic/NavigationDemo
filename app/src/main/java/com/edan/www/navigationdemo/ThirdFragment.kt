package com.edan.www.navigationdemo

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation

/**
 * 创建者     Zhangyu
 * 创建时间   2018/8/21 20:20
 * 描述	      ${TODO}
 *
 * 更新者     $Author
 * 更新时间   $Date
 * 更新描述   ${TODO}
 */
class ThirdFragment: Fragment(), View.OnClickListener {
    override fun onClick(v: View?) {
        Navigation.findNavController(getView()!!).navigate(R.id.action_nav_third_frag_to_nav_fourth_frag)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_simple_third, container, false);
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.btn_to_fourth_fragment).setOnClickListener(this)
    }
}