package capstone.com.verve.View.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import capstone.com.verve.Interface.iUserClickListener
import capstone.com.verve.Model.ForumData
import capstone.com.verve.R

class ForumRecyclerViewAdapter (private var items: List<ForumData>, val iUserClickListener: iUserClickListener) : RecyclerView.Adapter<ForumRecyclerViewAdapter.ViewHolder>(){
    private var context: Context? = null
    private var itemsList: List<ForumData> = items

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent?.context)
            .inflate(R.layout.item_post_forum, parent, false)
        context = itemView.context

        return ViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var post = items[position]
        holder?.txtName?.text = post.uName
        holder?.txtDate?.text = post.uDate
        holder?.txtTime?.text = post.uTime
        holder?.txtHearts?.text = post.hearts
        holder?.txtComments?.text = post.comments
        holder?.txtPostTitle?.text = post.postTitle
        holder?.txtPostDetails?.text = post.postDetails
        holder?.txtLastPerson?.text = post.lastPerson
        holder?.txtLastComment?.text = post.lastComment
        holder.txtDateComment?.text = post.dateComment
        holder.txtTimeComment?.text = post.timeComment
    }

    inner class ViewHolder(row: View): RecyclerView.ViewHolder (row), View.OnClickListener {
        var txtName: TextView? = null
        var txtDate: TextView? = null
        var txtTime: TextView? = null
        var txtHearts: TextView? = null
        var txtComments: TextView? = null
        var txtPostTitle: TextView? = null
        var txtPostDetails: TextView? = null
        var txtLastPerson: TextView? = null
        var txtLastComment: TextView? = null
        var txtDateComment: TextView? = null
        var txtTimeComment: TextView? = null

        init {
            itemView.setOnClickListener(this)
            this@ForumRecyclerViewAdapter.iUserClickListener
            this.txtName = row?.findViewById(R.id.txtName)
            this.txtDate = row?.findViewById(R.id.txtDate)
            this.txtTime = row?.findViewById(R.id.txtTime)
            this.txtHearts = row?.findViewById(R.id.txtHearts)
            this.txtComments = row?.findViewById(R.id.txtComments)
            this.txtPostTitle = row?.findViewById(R.id.txtPostTitle)
            this.txtPostDetails = row?.findViewById(R.id.txtPostDetails)
            this.txtLastPerson = row?.findViewById(R.id.txtLastPerson)
            this.txtLastComment = row?.findViewById(R.id.txtLastComment)
            this.txtDateComment = row?.findViewById(R.id.txtDateComment)
            this.txtTimeComment = row?.findViewById(R.id.txtTimeComment)

        }

        override fun onClick(p0: View?) {
            iUserClickListener.onClick(items[adapterPosition])
        }

    }
}