package jenn.codes.chooseyourownadventure

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import jenn.codes.chooseadventureexample.R
import jenn.codes.chooseadventureexample.databinding.FragmentMadeItToSchoolBinding


class MadeItToSchool : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val binding: FragmentMadeItToSchoolBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_made_it_to_school, container, false)
        binding.btnPlayAgain.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_madeItToSchool_to_titleFragment)
        }
        return binding.root
    }
}
