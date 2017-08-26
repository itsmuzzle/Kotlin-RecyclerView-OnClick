class Adapter(val context: Context, val itemList: List<Item>, val layout: Int, val listener: myClickListener)
{
    /* Interface to listen for Clicks */
    interface myClickListener
    {
        fun doSomething()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder
    {
        val view = LayoutInflater.from(context).inflate(layout, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int
    {
        return itemList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int)
    {
        holder.bindView(context, itemList[position], listener)
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)
    {
        /* Icon Button within the RecyclerView layout */
        val itemButton = itemView.findViewById(R.id.item_button) as ImageView
        
        /* Bind the views */
        open fun bindView(context: Context, item: Item, listener: yourClickListener)
        {
            /* Set the listener on the button */
            itemButton.onClick { listener.doSomething() }
        }
    }
}