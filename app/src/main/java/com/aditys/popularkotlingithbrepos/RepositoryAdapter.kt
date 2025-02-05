package com.aditys.popularkotlingithbrepos

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RepositoryAdapter(var repositories: List<Repository>, private val onItemClick: (String) -> Unit) :
    RecyclerView.Adapter<RepositoryAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nameTextView: TextView = itemView.findViewById(R.id.nameTextView)
        val descriptionTextView: TextView = itemView.findViewById(R.id.descriptionTextView)
        val starsTextView: TextView = itemView.findViewById(R.id.starsTextView)
        val forksTextView: TextView = itemView.findViewById(R.id.forksTextView)

        init {
            itemView.setOnClickListener {
                onItemClick(repositories[adapterPosition].html_url)
            }
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_repository, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val repository = repositories[position]
        holder.nameTextView.text = repository.name
        holder.descriptionTextView.text = repository.description
        holder.starsTextView.text = "Stars: ${repository.stargazers_count}"
        holder.forksTextView.text = "Forks: ${repository.forks_count}"
    }

    override fun getItemCount(): Int {
        return repositories.size
    }
}
