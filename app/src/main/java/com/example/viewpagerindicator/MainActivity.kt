package com.example.viewpagerindicator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import kotlinx.android.synthetic.main.activity_main.*
import me.relex.circleindicator.CircleIndicator3

class MainActivity : AppCompatActivity() {


    private var nameList = mutableListOf<String>()
    private var descriptionList = mutableListOf<String>()
    private var imageList = mutableListOf<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addtolist("PERSON1","this is a person 1",R.drawable.img1)
        addtolist("PERSON2","this is a person 2",R.drawable.ic_launcher_background)
        addtolist("PERSON3","this is a person 3",R.drawable.img3)

        viewpager.adapter = ViewPagerAdapter(nameList,descriptionList,imageList)
        viewpager.orientation=ViewPager2.ORIENTATION_HORIZONTAL
        val indicator:CircleIndicator3 = findViewById(R.id.circle_indicator)
        indicator.setViewPager(viewpager)
    }


    private fun addtolist(name:String,description:String,image:Int)
    {
       nameList.add(name)
        descriptionList.add(description)
        imageList.add(image)
    }
}