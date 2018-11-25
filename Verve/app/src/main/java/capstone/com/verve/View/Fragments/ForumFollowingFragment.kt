package capstone.com.verve.View.Fragments

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import capstone.com.verve.Model.ForumData

import capstone.com.verve.R
import capstone.com.verve.View.Adapters.ForumPagerAdapter
import capstone.com.verve.View.Adapters.ForumRecyclerViewAdapter
import kotlinx.android.synthetic.main.fragment_forum_following.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [ForumFollowingFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [ForumFollowingFragment.newInstance] factory method to
 * create an instance of this fragment.
 *
 */
class ForumFollowingFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private var listener: OnFragmentInteractionListener? = null
    var recyclerView : RecyclerView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var rootView = inflater.inflate(R.layout.fragment_forum_following, container, false)


        return rootView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        recyclerView = view.findViewById(R.id.followingRecyclerView) as RecyclerView
        var layoutManager = LinearLayoutManager(context)
        var postList : MutableList<ForumData> = ArrayList()
        recyclerView!!.layoutManager = layoutManager
        var eAdapter = ForumRecyclerViewAdapter(postList)
        recyclerView!!.adapter = eAdapter

        for (i in 1..10) {
            var postsData = ForumData()

            postsData.setUname("John Ranel Tuble $i")
            postsData.setUdate("11/25/2018")
            postsData.setUtime("12:15 PM")
            postsData.setcomments("69")
            postsData.sethearts("15")
            postsData.setPosttitle("I SURVIVED!")
            postsData.setPostdetails("I want to express my deepest gratitude to my family and friends for being with me during this challenging journey")
            postsData.setdateComment("11/25/2018")
            postsData.settimeComment("11:25 PM")
            postsData.setlastPerson("Syuujie Yoshino")
            postsData.setLastcomment("Wow. Congratulations! Can't wait to see you again.")

            postList.add(postsData)
        }

    }

    // TODO: Rename method, update argument and hook method into UI event
    fun onButtonPressed(uri: Uri) {
        listener?.onFragmentInteraction(uri)
    }


    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     *
     *
     * See the Android Training lesson [Communicating with Other Fragments]
     * (http://developer.android.com/training/basics/fragments/communicating.html)
     * for more information.
     */
    interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        fun onFragmentInteraction(uri: Uri)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment ForumFollowingFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            ForumFollowingFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}
