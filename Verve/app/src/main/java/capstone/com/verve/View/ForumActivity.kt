package capstone.com.verve.View

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.view.View
import capstone.com.verve.Interface.AcceptListener
import capstone.com.verve.R
import capstone.com.verve.View.Adapters.ForumPagerAdapter
import capstone.com.verve.View.Fragments.ForumAddPostFragment
import kotlinx.android.synthetic.main.activity_forum.*

class ForumActivity : AppCompatActivity(), AcceptListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forum)

        click_fab.setOnClickListener {
            showPostDialog()
        }

        val tabLayout = findViewById<View>(R.id.tabLayout)
        val pageAdapter = ForumPagerAdapter(supportFragmentManager, 2)
        val followingFragment = pageAdapter.getFollowingFragment()
        val popularFragment = pageAdapter.getPopularFragment()

        viewpager.adapter = pageAdapter
        viewpager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabLayout as TabLayout?))
    }

    private fun showPostDialog() {
        val fm = supportFragmentManager
        val editNameDialogFragment = ForumAddPostFragment.newInstance("What's Up?")
        editNameDialogFragment.setListener(this@ForumActivity)
        editNameDialogFragment.show(fm, "fragment_edit_name")
    }

    override fun onSubmit() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


}
