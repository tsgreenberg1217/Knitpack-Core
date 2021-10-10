import android.util.Log
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import com.google.gson.Gson
import com.tgreenberg.core.models.ProjectTxt

object KnitPackApi{

    fun postProject(project: ProjectTxt){
//        val db = Firebase.firestore
//        val postProject = hashMapOf(
//            project.name to "name",
//            Gson().toJson(project.steps) to "steps",
//            project.level to "level"
//        )
//        db.collection("projects")
//            .add(postProject)
//            .addOnSuccessListener {
//                Log.d("FIREBASE TESTING", "success $it")
//            }
//            .addOnFailureListener {
//                Log.d("FIREBASE TESTING", "error $it")
//            }
    }
}
