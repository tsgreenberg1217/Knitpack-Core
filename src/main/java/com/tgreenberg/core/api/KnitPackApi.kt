import android.util.Log
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import com.google.gson.Gson
import com.tgreenberg.core.models.ProjectTxt
import com.tgreenberg.core.models.UIKnittingProject

object KnitPackApi {

    suspend fun postProject(project: UIKnittingProject) {
        val db = Firebase.firestore
        val postProject = hashMapOf(
            project.name to "name",
//            Gson().toJson(project.steps) to "steps",
//            project.level to "level"
        )
        val x = db.collection("projects").add(postProject)

        if (x.isSuccessful) {
            Log.d("FIREBASE TESTING", "success ${x.result}")
        } else {
            Log.d("FIREBASE TESTING", "error ${x.exception?.message}")
        }
    }
}
