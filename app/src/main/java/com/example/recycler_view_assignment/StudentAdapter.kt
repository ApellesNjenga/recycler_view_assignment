package com.example.recycler_view_assignment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class StudentAdapter (private val students: MutableList<Student>)
    : RecyclerView.Adapter<StudentAdapter.ViewHolder>(){

    class ViewHolder(private val view: View) : RecyclerView.ViewHolder(view){
        val tvStudentName : TextView? = view.findViewById<TextView>(
            R.id.tvStudentName)
        val tvStudentRegNo : TextView? = view.findViewById<TextView>(
            R.id.tvStudentRegNo)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.student_record, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val student = students[position]
        holder.tvStudentRegNo?.text =student.adminNo
        holder.tvStudentName?.text =student.name
    }

    override fun getItemCount(): Int {
        return students.size
    }
}