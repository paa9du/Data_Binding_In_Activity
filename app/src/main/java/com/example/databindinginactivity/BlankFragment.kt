package com.example.databindinginactivity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.databindinginactivity.databinding.FragmentBlankBinding


class BlankFragment : Fragment() {
    private lateinit var blankBinding: FragmentBlankBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View {
        // Inflate the layout for this fragment
      blankBinding=DataBindingUtil.inflate(inflater,R.layout.fragment_blank,container,false)
        blankBinding.printBtn.setOnClickListener {
            if(blankBinding.edTitle.text.toString().isEmpty())
            {
                blankBinding.edTitle.error="Required"
            }
            else  if(blankBinding.edDesc.text.toString().isEmpty())
            {
                blankBinding.edTitle.error="Required"
            }
            else{
                blankBinding.titleStr=blankBinding.edTitle.text.toString()
                blankBinding.descStr=blankBinding.edDesc.text.toString()
            }
        }
        return  blankBinding.root
    }

}