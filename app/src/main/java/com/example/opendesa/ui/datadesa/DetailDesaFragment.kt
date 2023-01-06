package com.example.opendesa.ui.datadesa

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.DialogFragment
import com.example.opendesa.R

class DetailDesaFragment(val desa: Desa) : DialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.popup_detail_desa, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val kodeDesa: TextView = view.findViewById(R.id.kode_desa)
        val namaDesa: TextView = view.findViewById(R.id.nama_desa)

        kodeDesa.text = desa.code
        namaDesa.text = desa.name
    }

}