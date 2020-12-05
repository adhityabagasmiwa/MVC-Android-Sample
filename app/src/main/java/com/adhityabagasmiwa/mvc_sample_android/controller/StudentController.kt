package com.adhityabagasmiwa.mvc_sample_android.controller

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.adhityabagasmiwa.mvc_sample_android.R
import com.adhityabagasmiwa.mvc_sample_android.model.Student

class StudentListAdapter(context: Context) : RecyclerView.Adapter<StudentListAdapter.StudentViewHolder>() {
    private val inflater = LayoutInflater.from(context)
    var students = emptyList<Student>()

    // function get data student
    fun getStudent() {
        students = listOf(
            Student("Adhitya Bagas", "Informatika"),
            Student("Fadhilah Ananda", "Akuntansi"),
            Student("Andhy Panca", "Teknik Komputer"),
            Student("Adi Kencana", "Sistem Informasi"),
            Student("Farhan Setiadi", "Ilmu Komunikasi"),
            Student("Aas Andrian", "D3-Informatika"),
        )
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentViewHolder {
        val rvItem = inflater.inflate(R.layout.item_student_list, parent, false)

        return StudentViewHolder(rvItem)
    }

    override fun getItemCount() = students.size

    override fun onBindViewHolder(holder: StudentViewHolder, position: Int) {
        holder.bind(students[position])
    }

    inner class StudentViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(students: Student) {
            with(itemView) {
                val tvFullName = findViewById<TextView>(R.id.tvFullName)
                val tvStudyProgram = findViewById<TextView>(R.id.tvStudyProgram)
                tvFullName.text = students.Name
                tvStudyProgram.text = students.Lesson
            }
        }

    }
}



