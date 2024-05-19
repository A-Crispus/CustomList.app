package com.example.customlistview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MyAdapter(var Mctx:Context,var Resources:Int,var Items:List<Model>) :ArrayAdapter<Model>(Mctx,Resources,Items) {


    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

       val display:LayoutInflater=LayoutInflater.from(Mctx)
        val view:View=display.inflate(Resources,null)

        val imageView:ImageView=view.findViewById(R.id.image)
        val Tittle:TextView=view.findViewById(R.id.Tittle_Textview)
        val Tittledescription:TextView=view.findViewById(R.id.Sub_Textview)

        val Mitem:Model=Items[position]
        imageView.setImageDrawable(Mctx.resources.getDrawable(Mitem.image))
        Tittle.text=Mitem.tittle
        Tittledescription.text=Mitem.description


        return view



    }


}