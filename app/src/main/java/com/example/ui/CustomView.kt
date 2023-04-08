package com.example.ui

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import androidx.databinding.DataBindingUtil
import com.example.ui.databinding.CustomViewBinding

class CustomView  @JvmOverloads constructor (
    context: Context,
    attributeSet: AttributeSet? = null,
    defStyle: Int = 0
) : LinearLayout(context, attributeSet, defStyle) {

    lateinit var binding: CustomViewBinding

    init {
        initBinding()
    }

    private fun initBinding() {
        binding = DataBindingUtil.inflate(
            LayoutInflater.from(context),
            R.layout.custom_view,
            this,
            true
        )
    }


    fun bindData(name: String, number: String) {
        binding.txtName.text = name
        binding.txtNumber.text = number
    }


}