package com.gagan.happybirthdaymuskan

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.gagan.happybirthdaymuskan.databinding.FragmentSecondBinding

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class SecondFragment : Fragment() {

    private var _binding: FragmentSecondBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root



    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.noteButton.setOnClickListener{
            Toast.makeText(context, "Here We Go 👻🤩", Toast.LENGTH_SHORT).show()
            //Implicit Intent
            val url = "https://docs.google.com/document/d/1I0fVsqD-QZGq5-uU_3aDmheXiq80qhNJCZMEGrhrobM/edit?usp=sharing"

            val websiteIntent = Intent(Intent.ACTION_VIEW)
            val uri = Uri.parse(url)
            websiteIntent.data = uri
            startActivity(websiteIntent)
        }
        binding.videoButton.setOnClickListener{
            Toast.makeText(context, "✨✨", Toast.LENGTH_SHORT).show()
            //Implicit Intent
            val url = "https://drive.google.com/drive/folders/153z6sn-BceGmX6UR30J1IJZsXSTfFeNk?usp=sharing"

            val websiteIntent = Intent(Intent.ACTION_VIEW)
            val uri = Uri.parse(url)
            websiteIntent.data = uri
            startActivity(websiteIntent)

        }

        /*binding.buttonSecond.setOnClickListener {
            findNavController().navigate(R.id.action_SecondFragment_to_FirstFragment)
        }*/
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}