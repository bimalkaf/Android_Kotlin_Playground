package np.com.bimalkafle.viewmodeltest

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    var count = 0;

    fun increaseCount(){
        count++;
    }

}