package com.example.recycler_view_assignment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class StudentAdapter (val students: MutableList<Student>) : RecyclerView.Adapter<>(){

    class ViewHolder(val view: View) : RecyclerView.ViewHolder(view){
        val tvStudentName : TextView? = view.findViewById<TextView>(
            R.id.tvStudentName)
        val tvStudentRegNo : TextView? = view.findViewById<TextView>(
            R.id.tvStudentRegNo)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ??? {
        TODO("Not yet implemented")
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.student_record, parent ,attachToRoot false
        )
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
        val student = students[position]
        holder.tvStudentRegNo?.text =student.adminNo
        holder.tvStudentName.text =student.name
    }
    overide fun getItemCount (): Int {
        return students.size
    }
}