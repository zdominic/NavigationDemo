package com.edan.www.navigationdemo

import android.os.Bundle
import android.support.annotation.Nullable
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation


/**
 * 创建者     Zhangyu
 * 创建时间   2018/8/21 15:56
 * 描述	      ${TODO}
 *
 * 更新者     $Author
 * 更新时间   $Date
 * 更新描述   ${TODO}
 */
class FirstFragment : Fragment(), View.OnClickListener {
    override fun onClick(v: View?) {
//        Navigation.findNavController(getView()!!).navigate(R.id.action_nav_first_frag_to_nav_second_frag)
//        val bundle = Bundle()
//        bundle.putString("KEY","我是从 First 过来的");
//        getView()?.let { Navigation.findNavController(it).navigate(R.id.action_nav_first_frag_to_nav_second_frag,bundle) }
        Navigation.findNavController(view!!).navigate(R.id.action_nav_first_frag_to_nav_second_frag)


    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_simple_first, container, false);
    }

    override fun onViewCreated(view: View, @Nullable savedInstanceState: Bundle?) {
        val btnFirstToSecond = view.findViewById<Button>(R.id.btn_to_second_fragment)
        btnFirstToSecond.setOnClickListener(this)
    }

}