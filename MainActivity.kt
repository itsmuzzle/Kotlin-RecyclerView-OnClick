class Activity: Adapter.myClickListener
{
    override fun doSomething()
    {
        toast("Hey! Implement me!")
    }

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        /* The RecyclerView to display items */
        val recycler_view = findViewById(R.id.home_recycler_view) as RecyclerView

        /* Layout Manager for the adapter */
        val layoutManager = LinearLayoutManager(this)
        recycler_view.layoutManager = layoutManager

        /* The Custom Adapter for the RecyclerView */
        val adapter = Adapter(context, items, layout, this)    
        recycler_view.adapter = adapter
    }
}