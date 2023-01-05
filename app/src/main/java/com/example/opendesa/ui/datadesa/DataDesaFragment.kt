package com.example.opendesa.ui.datadesa

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.opendesa.R
import com.example.opendesa.databinding.FragmentDataDesaBinding

class DataDesaFragment : Fragment()
{
    private var _binding: FragmentDataDesaBinding? = null
    private val binding get() = _binding!!

    private lateinit var adapter: DataDesaAdapter
    private lateinit var recyclerView: RecyclerView

    private var listDesa: MutableList<Desa> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDataDesaBinding.inflate(inflater, container, false)
        val root : View = binding.root
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initData()

        val layoutManager = LinearLayoutManager(context)
        recyclerView = view.findViewById(R.id.recyclerview_desa)
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)
        adapter = DataDesaAdapter(listDesa, activity)
        recyclerView.adapter = adapter
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    private fun initData() {
        val desa = resources.getStringArray(R.array.array_desa)
        listDesa.clear()

        for (i in desa.indices) {
            listDesa.add(Desa(desa[i]))
        }
    }
}