package com.example.instagram

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    private lateinit var dataSource: ArrayList<MyDataClass>
    private lateinit var dataSource2: ArrayList<MyDataClass2>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        loadData()
        initRecyclerView()
        loadData2()
        initRecyclerView2()
    }

    private fun loadData() {
        dataSource = arrayListOf()
        dataSource.add(
            MyDataClass(
                R.drawable.robot
            )
        )
        dataSource.add(
            MyDataClass(
                R.drawable.robot
            )
        )
        dataSource.add(
            MyDataClass(
                R.drawable.robot
            )
        )
        dataSource.add(
            MyDataClass(
                R.drawable.robot
            )
        )
        dataSource.add(
            MyDataClass(
                R.drawable.robot
            )
        )
        dataSource.add(
            MyDataClass(
                R.drawable.robot
            )
        )
        dataSource.add(
            MyDataClass(
                R.drawable.robot
            )
        )
        dataSource.add(
            MyDataClass(
                R.drawable.robot
            )
        )
        dataSource.add(
            MyDataClass(
                R.drawable.robot
            )
        )

    }

    private fun initRecyclerView() {
        val recyclerView = findViewById<RecyclerView>(R.id.RecyclerViewForStory)
        recyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView.adapter = MyAdapter(dataSource)
    }

    private fun loadData2() {
        dataSource2 = arrayListOf()
        dataSource2.add(
            MyDataClass2(
                R.drawable.robot,
                "Abir",
                "1h",
                R.drawable.postpic,
                "Abir",
                "Ghurte ashchi"
            )
        )
        dataSource2.add(
            MyDataClass2(
                R.drawable.robot,
                "Abir",
                "1h",
                R.drawable.postpic,
                "Abir",
                "Ghurte ashchi"
            )
        )
        dataSource2.add(
            MyDataClass2(
                R.drawable.robot,
                "Abir",
                "1h",
                R.drawable.postpic,
                "Abir",
                "Ghurte ashchi"
            )
        )
        dataSource2.add(
            MyDataClass2(
                R.drawable.robot,
                "Abir",
                "1h",
                R.drawable.postpic,
                "Abir",
                "Ghurte ashchi"
            )
        )
        dataSource2.add(
            MyDataClass2(
                R.drawable.robot,
                "Abir",
                "1h",
                R.drawable.postpic,
                "Abir",
                "Ghurte ashchi"
            )
        )
        dataSource2.add(
            MyDataClass2(
                R.drawable.robot,
                "Abir",
                "1h",
                R.drawable.postpic,
                "Abir",
                "Ghurte ashchi"
            )
        )

    }
    private fun initRecyclerView2(){
        val recyclerView2 = findViewById<RecyclerView>(R.id.postRecyclerView)
        recyclerView2.layoutManager =
            LinearLayoutManager(this)
        recyclerView2.adapter = MyAdapter2(dataSource2)
    }
}